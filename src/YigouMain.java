
import java.net.URL;


public class YigouMain {
	public static final String baseUrl = "http://localhost:8080/chuang/";
	
//	public static final String baseUrl = "http://121.40.177.251:8810/";
	
	public static void main(String[] args) throws  Exception {
		
//		String dingwei = dingwei();
		
//		System.out.println(dingwei);
	}
	
	/**
	 * 加盟店定位
	 * @return
	 * @throws Exception
	 */
	public static String dingwei() throws  Exception{
	
		String url = "baba/shangjiaLuru.do";
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		//商户名称
		hp.addParemeter("shanghuname", "shanghuname");
		//联系人
		hp.addParemeter("name", "name");
		//联系电话
		hp.addParemeter("phone", "phone");
		hp.addParemeter("type", "type");
		hp.addParemeter("addr", "addr");
		hp.addParemeter("latitude", "latitude");
		hp.addParemeter("longitude", "longitude");
		hp.addParemeter("locationdescribe", "locationdescribe");
		
		
		return hp.getResult();
	}
}
