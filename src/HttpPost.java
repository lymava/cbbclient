


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author ly
 *
 */
public class HttpPost{
	
	private URLConnection openConnection ;
	private StringBuilder paremeter = new StringBuilder();
	private String charset = null;
	
	
	private Map<String, String> cookies = null;
	
	public Map<String, String> getCookies() {
		return cookies;
	}
	public void setCookies(Map<String, String> cookies) {
		this.cookies = cookies;
	}
	
	/**
	 * 
	 * @param urlStr url地址
	 * @throws IOException 如果这个报错就是连接根本没打开 
	 */
	public HttpPost(URL url,String charset) throws IOException{
		if(charset == null){
			charset = "utf-8";
		}else{
			this.charset = charset; 
		}
    	openConnection =  url.openConnection();
    	openConnection.setDoOutput(true); 
    	openConnection.setDoInput(true); 
    	openConnection.setConnectTimeout(10000); 
    	openConnection.setReadTimeout(10000); 
	} 
	/**
	 * 
	 * @param urlStr url地址
	 * @throws IOException 如果这个报错就是连接根本没打开 
	 */
	public HttpPost(URL url) throws IOException{
		this.charset = "utf-8"; 
    	openConnection =  url.openConnection();
    	openConnection.setDoOutput(true); 
    	openConnection.setDoInput(true); 
    	
    	openConnection.setConnectTimeout(10000); 
    	openConnection.setReadTimeout(10000); 
	}
	
	public void addParemeter(String name,String value){ 
		if(name == null){
			paremeter.append(value).append("&"); 
		}else{
			paremeter.append(URLEncoder.encode(name)).append("=").append(URLEncoder.encode(value)).append("&"); 
		}
	} 
	public void addRequestProperty(String key,String value){ 
		openConnection.addRequestProperty(key, value);
	} 
	/**
	 *  
	 * @return post的返回值
	 * @throws IOException 获取结果报错
	 */
	public String getResult() throws IOException {
		
		String login_name = "13996237451";
		String key = "13aeec8ab69df2d2fbdcc7b5";
		String login_rand = ""+System.currentTimeMillis();
		
		String login_mac = Md5Util.MD5Normal(key+login_rand);
		
		this.addParemeter("login_name", login_name);
		this.addParemeter("login_rand", login_rand);
		this.addParemeter("login_mac", login_mac);
		
		OutputStreamWriter outputStream = null;
		InputStream inputStream = null;
		ByteArrayOutputStream outByteArray = new ByteArrayOutputStream();
		if(paremeter.length() > 1){
			paremeter = paremeter.deleteCharAt(paremeter.length()-1);
		}
		
		StringBuilder sb = new StringBuilder();
		if(cookies != null){
			Set<String> keySet = cookies.keySet();
			for (String string : keySet) {
				String string2 = cookies.get(string);
				
				sb.append(string+"="+string2+"; ");
			}
		}
		
		openConnection.setRequestProperty("Cookie", sb.toString());
		
		//System.out.println(paremeter.toString());
		byte[] returnByte = null;
		try {
			outputStream = new OutputStreamWriter(openConnection.getOutputStream(), charset);   
	    	outputStream.write(paremeter.toString());  
	    	outputStream.flush(); 
	    	outputStream.close(); 
	    	//System.out.print(openConnection.getHeaderField("Set-Cookie"));
	    	
//	    	System.out.println(openConnection.getHeaderFields());
	    	
	    	if(this.cookies != null){
				Map<String, List<String>> headerFields = openConnection.getHeaderFields();
		    	
	    		List<String> list = headerFields.get("Set-Cookie");
	    		if(list != null){
	    			for (String string2 : list) {
	        			String[] substring = string2.substring(0,string2.indexOf(";")).split("=");
	        			cookies.put(substring[0], substring[1]);
	    			}
	    		}
			}
	    	
	    	
	    	inputStream = openConnection.getInputStream();
			int b;
			while (inputStream != null && (b = inputStream.read()) != -1) {
				outByteArray.write(b);
			} 
			returnByte = outByteArray.toByteArray();
		} catch (IOException e) {
			inputStream = ((HttpURLConnection)openConnection).getErrorStream();
			int b;
			while (inputStream != null && (b = inputStream.read()) != -1) {
				outByteArray.write(b);
			} 
			returnByte = outByteArray.toByteArray();
			e.printStackTrace();
		}finally {
			outByteArray.close();
			if (outputStream != null) {
				outputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
		 
	}
		return new String(returnByte,charset);
	}
}
