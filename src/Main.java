import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jdk.nashorn.internal.runtime.FindProperty;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.sun.jersey.core.util.Base64;


public class Main {
	public static final String baseUrl = "http://localhost:8080/chuangv2/";
//	public static final String baseUrl = "http://121.40.177.251:8910/";
	
//	public static void main(String[] args) throws  Exception {
		
//		System.out.println(yuyue());
		//加盟店获取自己的预约信息
//		System.out.println(getMyYuyue()); 
//		/删除预约
//		System.out.println(deleteMyYuyue());
		//加盟店登录
//		System.out.println(login());
//		System.out.println(getShangpFenlei());
//		System.out.println(getShangpin());
//		System.out.println(getShangpinByid());
//		System.out.println(getPubByid());
//		System.out.println(getPubByFenleiid());
//		System.out.println(getPubXiangguanByPub());
//		System.out.println(getProductTuijian());
//		System.out.println(getProductTejia());
		
//		System.out.println(getProductPriceByconfig());
		
//		System.out.println(getLoginRand());
		
//		System.out.println(Randlogin("DF7753902F155B135760940DD9F04E5D","18908397910","770282"));
		
//		System.out.println(indexBanner());
		
//		System.out.println(updateUser());
		
//		System.out.println(uploadHetong());
		
//		System.out.println(getUserInfo());
		
//		System.out.println(tiwen());
		
//		System.out.println(huida());
		
//		System.out.println(tiwenList());
		
//		System.out.println(createOrder());;
		
//		System.out.println(orderList_maijia());
		
//		System.out.println(orderList_saler());
		
//		System.out.println(list_daijinquan());
		
//		System.out.println(orderUseDaijinQuan());
		
//		System.out.println(choujiang());
		//收藏
//		System.out.println(shoucang());
		//收藏List
//		System.out.println(shoucangList());
		//移除收藏
//		System.out.println(shoucang_quxiao());
		//重置密码
//		System.out.println(resetPasswd());
		//我的提问列表
//		System.out.println(mytiwenList());
		//代理商展示
//		System.out.println(dailishangList());
		//代理商推荐
//		System.out.println(dailishangList_tuijian());
		//买家删除订单
//		System.out.println(orderDelete());
		//安装统计
//		System.out.println(installCount());
		//首页城市
//		System.out.println(indexCity());
		//铝材零售 
//		System.out.println(lvcaiFenleiList());
		//用户评论代理商
//		System.out.println(userPinglunDailishang());
		//代理商创意发布
//		System.out.println(userFabuchuang());
		//我的创意列表
//		System.out.println(chuangyilist());
		//首页获取门窗属性
//		System.out.println(getMenchuangShuxing());
//	}
//	/**
//	 * 我的创意列表
//	 * @return
//	 * @throws Exception
//	 */
//	private static String chuangyilist() throws Exception {
//		String urlString = baseUrl+"face/userfront/chuangyilist.do";
//		
//		//用户密钥
//		String key = "9cc61558bc03343d63b8c5a9";
//		//用户名
//    	String name = "MY0000"; 
//    	
//    	JsonObject json = new JsonObject();
//    	//代理商ID
//    	json.addProperty("page", "1");
//    	json.addProperty("pageSize", "1");
//		
//		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
//		return request_data;
//	}
	/**
	 * 代理商创意发布
	 * @return
	 * @throws Exception
	 */
	private static String userFabuchuang() throws Exception {
		String urlString = baseUrl+"face/userfront/chuangyifabu.do";
		
		//用户密钥
		String key = "9cc61558bc03343d63b8c5a9";
		//用户名
    	String name = "MY0000"; 
    	
    	JsonObject json = new JsonObject();
    	//代理商ID
    	json.addProperty("name", "创意标题2!");
    	json.addProperty("content", "创意内容3!");
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 代理商被评论的列表
	 * @return
	 * @throws Exception
	 */
	private static String getPinglunDailishang() throws Exception {
		String urlString = "baba/getPinglunDailishang.do";
		 
		HttpPost hp = new HttpPost(new URL(baseUrl+urlString));
		//代理商的id
		hp.addParemeter("dailishangId", "55b5a1a9d6c4595eb279b2dc");
		//页数
		hp.addParemeter("page", "1");
		//每页个数
		hp.addParemeter("pageSize", "15");
		
		return hp.getResult();
	}
	
	/**
	 * 用户评论代理商
	 * @return
	 * @throws Exception
	 */
	private static String userPinglunDailishang() throws Exception {
		String urlString = baseUrl+"face/userfront/userPinglunDailishang.do";
		
		//用户密钥
		String key = "d330a2dafd22439ca5b8babe";
		//用户名
    	String name = "15922520075"; 
    	
    	JsonObject json = new JsonObject();
    	//代理商ID
    	json.addProperty("dailishangId", "55b1b073d6c459501b581c15");
    	json.addProperty("name", "评论标题!");
    	json.addProperty("content", "评论内容!");
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 首页城市配置
	 * @return
	 * @throws Exception
	 */
	private static String lvcaiFenleiList() throws Exception {
		String urlString = "baba/lvcaiFenleiList.do";
		 
		HttpPost hp = new HttpPost(new URL(baseUrl+urlString));
		
		return hp.getResult();
	}
	
	/**
	 * 首页城市配置
	 * @return
	 * @throws Exception
	 */
	private static String indexCity() throws Exception {
		String urlString = "baba/indexCity.do";
		 
		HttpPost hp = new HttpPost(new URL(baseUrl+urlString));
		
		return hp.getResult();
	}
	/**
	 * 安装统计
	 * @return
	 * @throws Exception
	 */
	private static String installCount() throws Exception {
		String urlString = "baba/installTongji.do";
		 
		HttpPost hp = new HttpPost(new URL(baseUrl+urlString));
		//手机号码
		hp.addParemeter("phone", "18908397910");
		//手机型号
		hp.addParemeter("xinghao", "垃圾手机");
		//手机硬件编码
		hp.addParemeter("hardId", System.currentTimeMillis()+"");
		
		return hp.getResult();
	}
	/**
	 * 买家删除订单
	 * @return
	 * @throws Exception
	 */
	private static String orderDelete() throws Exception {
		String urlString = baseUrl+"face/userfront/orderDelete.do";
		
		//用户密钥
		String key = "a1291d896eb54f0412e155b0";
		//用户名
    	String name = "18983261955"; 
    	
    	JsonObject json = new JsonObject();
    	//文章 或产品ID
    	json.addProperty("hetongid", "557ea3b6d812a83241824cc2");
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 首页下面推荐专卖店
	 * @return
	 * @throws Exception
	 */
	private static String dailishangList_tuijian() throws Exception {
		String url = "baba/dailishangList.do";
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		//推荐专卖店
		hp.addParemeter("tuijian", "yes");
		//首页根据城市搜索推荐
		hp.addParemeter("city", "重庆");
		//页数
		hp.addParemeter("page", "1");
		//每页个数
		hp.addParemeter("pageSize", "2");
		
		return hp.getResult();
	}
	/**
	 * 代理商列表
	 * @return
	 * @throws Exception
	 */
	private static String dailishangList() throws Exception {
		String url = "baba/dailishangList.do";
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "4");
//		hp.addParemeter("dailishangId", "55ae0a0bd6c45940a7575491");
		hp.addParemeter("tanzikou", "true");
		
		return hp.getResult();
	}
	/**
	 * 会员密码修改
	 * @return
	 * @throws Exception
	 */
	private static String resetPasswd() throws Exception {
		String urlString = baseUrl+"face/userfront/resetPasswd.do";
		
		String key = "13aeec8ab69df2d2fbdcc7b5";
    	String name = "13996237451"; 
    	
    	JsonObject json = new JsonObject();
    	//文章 或产品ID
    	json.addProperty("oldpwd", Md5Util.MD5Normal("1234561321321"));
    	json.addProperty("newpwd", "1234561");
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 收藏
	 * @return
	 * @throws Exception
	 */
	private static String shoucang() throws Exception {
		String urlString = baseUrl+"face/userfront/shoucang.do";
    	
    	String name = "13996237451";
		String key = "13aeec8ab69df2d2fbdcc7b5";
    	
    	JsonObject json = new JsonObject();
    	//文章 或产品ID
    	json.addProperty("pubId", "561f4cc9d6c4592d6cdd1195");
    	json.addProperty("memo", "备注1");
    	
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 移除收藏
	 * @return
	 * @throws Exception
	 */
	private static String shoucang_quxiao() throws Exception {
		String urlString = baseUrl+"face/userfront/shoucang_quxiao.do";
		
		String name = "13996237451";
		String key = "13aeec8ab69df2d2fbdcc7b5";
    	
    	JsonObject json = new JsonObject();
    	//文章 或产品ID
    	json.addProperty("pubId", "561f4cc9d6c4592d6cdd1195");
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 收藏列表
	 * @return
	 * @throws Exception
	 */
	private static String shoucangList() throws Exception {
		String urlString = baseUrl+"face/userfront/shoucangList.do";
		//用户密钥
		String key = "633bd1f8db6fd7247249db5b";
		//用户名
    	String name = "13896059237"; 
//    	
    	JsonObject json = new JsonObject();
    	 
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 抽奖
	 * @return
	 * @throws Exception
	 */
	private static String choujiang() throws Exception {
		String urlString = baseUrl+"face/userfront/choujiang.do";
		//用户密钥
		String key = "633bd1f8db6fd7247249db5b";
		//用户名
    	String name = "13896059237"; 
    	
    	JsonObject json = new JsonObject();
    	 
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 订单绑定使用代金卷
	 * @return
	 * @throws Exception
	 */
	private static String orderUseDaijinQuan() throws Exception {
		String urlString = baseUrl+"face/userfront/orderUseDaijinQuan.do";
		
		String key = "633bd1f8db6fd7247249db5b";
    	String name = "13896059237"; 
    	
    	JsonObject json = new JsonObject();
    	
    	//代金卷系统id
    	json.addProperty("daijinjuanId", "daijinjuanId");
    	//合同系统id
    	json.addProperty("hetongid", "hetongid");
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 可用
	 */
	public static final Integer daijinquan_state_nomal = 			1;
	/**
	 * 不可用
	 */
	public static final Integer daijinquan_state_false = 			2;
	/**
	 * 已经使用
	 */
	public static final Integer daijinquan_state_yiyong		 = 3;
	/**
	 * 使用中
	 */
	public static final Integer daijinquan_state_doing		 =    4;
	/**
	 * 过期优惠券
	 */
	public static final Integer daijinquan_state_yiguoqi		 =    5;
	
	/**
	 * 奖券
	 */
	public static final Integer daijinquan_state_choujiang		 =    6;
	
	/**
	 * 获取用户自己的代金卷List
	 * @return
	 * @throws Exception
	 */
	private static String list_daijinquan() throws Exception {
		String urlString = baseUrl+"face/userfront/list_daijinquan.do";
		
		String key = "633bd1f8db6fd7247249db5b";
		//用户名
    	String name = "13896059237"; 
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("state", daijinquan_state_nomal);
    	json.addProperty("page", "1");
    	json.addProperty("pageSize", "4");
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 获取卖家卖掉的订单list
	 * @return
	 * @throws Exception
	 */
	private static String orderList_saler() throws Exception {
		String urlString = baseUrl+"face/userfront/orderList_saler.do";
		
		String key = "f6bea8455ef3df6c0365a47a";
    	String name = "新美鱼"; 
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("state", order_STATE_paying);
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 获取买家自己的订单list
	 * @return
	 * @throws Exception
	 */
	private static String orderList_maijia() throws Exception {
		String urlString = baseUrl+"face/userfront/orderList_maijia.do";
		
		String key = "6921f5dfbfc44ac166752347";
    	String name = "18983261955"; 
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("state", order_STATE_paying);;
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 完成
	 */
	public static final Integer order_STATE_pay_ok = 1;
	/**
	 * 订单创建成功
	 */
	public static final Integer order_STATE_create_orderok = 2;
	/**
	 * 支付中
	 */
	public static final Integer order_STATE_paying = 3;
	/**
	 * 支付失败
	 */
	public static final Integer order_STATE_false = 4;
	/**
	 * 创建订单接口
	 * @return
	 * @throws Exception
	 */
	private static String createOrder() throws Exception {
		
		
		String urlString = baseUrl+"face/userfront/createOrder.do";
		
		String key = "0581ed61c0d3eee5e3acff13";
    	String name = "18908397910"; 
    	
    	JsonObject json = new JsonObject();
    	
    	String orderId = (""+System.currentTimeMillis()).substring(1);
    	String productId = "55463490d105fc1e93208b16";
    	/**
    	 * 门窗
    	 */
    	String fangdaoshachuang = "门";
    	/**
    	 * 铝材表面颜色
    	 */
    	 String biaomian="红酸枝" ;
    	/**
    	 * 玻璃规格
    	 */
    	 String guige ="5+9+5";
    	/**
    	 * 玻璃材质
    	 */
    	 String caizhi ="普通钢化";
    	
    	json.addProperty("orderId", orderId);
    	json.addProperty("productId", productId);
    	json.addProperty("fangdaoshachuang", fangdaoshachuang);
    	json.addProperty("biaomian", biaomian);
    	json.addProperty("guige", guige);
    	json.addProperty("caizhi", caizhi); 
    
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 我的提问
	 * @return
	 * @throws Exception
	 */
	private static String mytiwenList() throws Exception {
		String urlString = baseUrl+"face/userfront/tiwenList.do";
		
		String key = "6ea61d7d5b2c5c354aa46ff8";
    	String name = "新美鱼"; 
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("my", "true");
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 提问列表
	 * @return
	 * @throws Exception
	 */
	private static String tiwenList() throws Exception {
		String urlString = baseUrl+"face/userfront/tiwenList.do";
		
		String key = "6ea61d7d5b2c5c354aa46ff8";
    	String name = "新美鱼"; 
    	
    	JsonObject json = new JsonObject();
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	/**
	 * 回答
	 * @return
	 * @throws Exception
	 */
	private static String huida() throws Exception {
		String urlString = baseUrl+"face/userfront/huida.do";
		
		String key = "6ea61d7d5b2c5c354aa46ff8";
    	String name = "新美鱼"; 
    	
    	JsonObject json = new JsonObject();
    	
    	
    	json.addProperty("wenId", "556fef07d105fc22ba0f6e12");
    	json.addProperty("da", "回答了!!!");
    	
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 提问
	 * @return
	 * @throws Exception
	 */
	private static String tiwen() throws Exception {
		String urlString = baseUrl+"face/userfront/tiwen.do";
		
		String key = "43a25be53f98fe5340cdce40";
    	String name = "18908397910"; 
    	
    	JsonObject json = new JsonObject();
    	
    	
    	json.addProperty("wen", "问题");
    	
    	JsonArray ja = new JsonArray();
    	
    	ja.add(new JsonPrimitive(getPicBase64("/home/lymava/下载/qqonline.png")));
    	ja.add(new JsonPrimitive(getPicBase64("/home/lymava/下载/qqonline.png")));
    	
    	json.add("pics",ja);
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	public static String getPicBase64(String pathString){
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		try {
				FileInputStream fis = new FileInputStream(new File(pathString));
				
				int read = fis.read();
				
				
				while(read != -1){
					
					baos.write(read);
					
						read = fis.read();
				}
				fis.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		byte[] byteArray = baos.toByteArray();
		
	
		return new String(Base64.encode(byteArray));
	}
	/**
	 * 获取用户个人信息
	 * @return
	 * @throws Exception
	 */
	private static String getUserInfo() throws Exception {
		String urlString = baseUrl+"face/userfront/getUserInfo.do";
		
		String key = "3ff3f45e7d0879de171d5678";
    	String name = "新美鱼"; 
    	
    	JsonObject json = new JsonObject();
    	
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 上传合同
	 * @return
	 * @throws Exception
	 */
	private static String uploadHetong() throws Exception {
		String urlString = baseUrl+"face/userfront/uploadHetong.do";
		
		String key = "c5192eef5d7e4ae34e1ebfce";
    	String name = "新美鱼"; 
    	
    	String id = "5572c3b4d6c4594eea8700e7";
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("id", id);
    	json.addProperty("priceYuan", "1");
    	json.addProperty("memo", "备注");
    	json.addProperty("pic", "");
    	json.addProperty("hetongBianhao", "hetongBianhao");
    	
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	/**
	 * 更新用户
	 * @return
	 * @throws Exception
	 */
	private static String updateUser() throws Exception {
		String urlString = baseUrl+"face/userfront/updateUser.do";
		
		String key = "3ff3f45e7d0879de171d5678";
    	String name = "新美鱼"; 
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("realname", "realname");
    	json.addProperty("addr", "addr");
    	json.addProperty("phone", "phone");
    	
    	String picBase64 = getPicBase64("/home/lymava/下载/qqonline.png");
    	
    	json.addProperty("pic", picBase64);
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	
	private static String indexBanner() throws MalformedURLException, IOException {
		String url = "baba/indexBanner.do";
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		String result = hp.getResult();
		
		return result;
	}
	
	private static String getLoginRand() throws MalformedURLException, IOException {
		String url = "baba/getLoginRand.do";
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		Map<String, String> cookies = new HashMap<String, String>();
		hp.setCookies(cookies);
		hp.addParemeter("username", "18908397910");
		
		String result = hp.getResult();
		System.out.println(cookies);
		
		return result;
	}
	
	private static String getProductPriceByconfig() throws MalformedURLException, IOException {
		String url = "baba/getProductPriceByconfig.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("productId", "55463490d105fc1e93208b16");
		hp.addParemeter("biaomian", "水曲柳");
		hp.addParemeter("guige", "6+12+6");
		hp.addParemeter("caizhi", "LOW-E玻璃");
		hp.addParemeter("fangdaoshachuang", "门");
		
		return hp.getResult();
	}
	public static final Integer tuijian_yes = 			1;
	public static final Integer tuijian_no = 			2;
	public static final Integer tuijian_tejia = 			3;
	/**
	 * 获取特价商品
	 * @return
	 * @throws Exception
	 */
	public static String getProductTejia() throws Exception{
		
		String url = "baba/getProductListByFenleiId.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("type", tuijian_tejia+"");
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "4");
		
		return hp.getResult();
	}
	/**
	 * 获取推荐商品
	 * @return
	 * @throws Exception
	 */
	public static String getProductTuijian() throws Exception{
		
		String url = "baba/getProductListByFenleiId.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("type", tuijian_yes+"");
		hp.addParemeter("fenleiid", "55482668d6c4591248857578");
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "4");
		
		return hp.getResult();
	}
	/**
	 * 根据商品id获取商品
	 * @return
	 * @throws Exception
	 */
	public static String getShangpinByid() throws Exception{
		
		String url = "baba/getProductById.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("id", "55a857b4d6c45940a7575414");
		
		
		return hp.getResult();
	} 
	/**
	 * 根据分类id获取商品list
	 * @return
	 * @throws Exception
	 */
	public static String getPubXiangguanByPub() throws Exception{
		
		String url = "baba/getPubXiangguanByPub.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("id", "554c8fa8d6c45923169ce936");
		
		
		return hp.getResult();
	}
	/**
	 * 根据分类id获取商品list
	 * @return
	 * @throws Exception
	 */
	public static String getPubByFenleiid() throws Exception{
		
		String url = "baba/getPubByFenleiid.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("fenleiid", "554c8ac9d6c45923169ce92c");
		
		
		return hp.getResult();
	}
	/**
	 * 根据商品id获取商品
	 * @return
	 * @throws Exception
	 */
	public static String getPubByid() throws Exception{
		
		String url = "baba/getPubById.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("id", "55603907d6c45979867997bf");
		
		
		return hp.getResult();
	}
	/**
	 * 获取产品的分类
	 * @return
	 * @throws Exception
	 */
	public static String getShangpFenlei() throws Exception{
		
		String url = "baba/getProductFenleiList.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		String result = hp.getResult();
		
		return result;
	}
	/**
	 * 根据分类id获取商品
	 * @return
	 * @throws Exception
	 */
	public static String getShangpin() throws Exception{
		
		String url = "baba/getProductListByFenleiId.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("fenleiid", "55b1f33fd6c459501b581c23");
		
		
		return hp.getResult();
	} 
	
	//预约中
	public final static Integer state_yuyuezhong = 1;
	//预约完成
	public final static Integer state_finish = 2;
	
	public static String getMyYuyue() throws Exception{
		String urlString = baseUrl+"face/userfront/getYuyueList.do";
		
		String key = "fcd5848f3b42c7134cf6f48d";
    	String name = "13996237451"; 
    	
    	JsonObject json = new JsonObject();
    	json.addProperty("page", "1");
    	json.addProperty("pageSize", "5");
    	json.addProperty("state", "1");
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	public static String deleteMyYuyue() throws Exception{
		String urlString = baseUrl+"face/userfront/deleteYuyue.do";
		
		String key = "fcd5848f3b42c7134cf6f48d";
    	String name = "13996237451"; 
    	
    	String yuyueId = "55effc29d6c4591cdd01c515";
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("yuyueId",yuyueId);
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
		return request_data;
	}
	
	//普通会员
	public static final Integer USERTYPE_YONGHU = 					1;
	//企业会员
	public static final Integer USERTYPE_QIYE = 							3;
	/**
	 * 用户预约加盟店
	 * @return
	 * @throws Exception
	 */
	public static String Randlogin(String JSESSIONID,String username,String randCode) throws  Exception{
	
		String url = "baba/login.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
			Map<String, String> cookies = new HashMap<String, String>();
			cookies.put("JSESSIONID", JSESSIONID);
		
			hp.setCookies(cookies);
		
			hp.addParemeter("username", username);
			hp.addParemeter("randCode", randCode);
		
		return hp.getResult();
	}
	
	/**
	 * 用户预约加盟店
	 * @return
	 * @throws Exception
	 */
	public static String login() throws  Exception{
	
		String url = "baba/login.do";
		
		String pwd = "123456";
		
		String rand = System.currentTimeMillis()+"";
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
//		Map<String, String> cookies = new HashMap<String, String>();
//		cookies.put("JSESSIONID", "9DE84D4609DDA0071ECD0C794733A00B");
//		
//		hp.setCookies(cookies);
		
		String pwd_change = "123456";
		
			hp.addParemeter("username", "新美鱼");
			hp.addParemeter("rand",rand);
			hp.addParemeter("pwd", Md5Util.MD5Normal(Md5Util.MD5Normal(pwd) +rand));
			
			hp.addParemeter("pwd_change", pwd_change);
		
		return hp.getResult();
	}
	
	/**
	 * 用户预约加盟店
	 * @return
	 * @throws Exception
	 */
	public static String yuyue() throws  Exception{
		String urlString = baseUrl+"face/userfront/yuyue.do";
		
		String key = "13aeec8ab69df2d2fbdcc7b5";
    	String name = "13996237451"; 
    	
    	JsonObject json = new JsonObject();
    	
    	json.addProperty("id", "55b9df60d6c45970c2eeab3d");
    	
    	json.addProperty("yuyuePhone", "yuyuePhone");
		json.addProperty("yuyueTime", "yuyueTime");
		json.addProperty("tuijianrenPhone", "tuijianrenPhone");
		json.addProperty("sheng", "sheng");
		json.addProperty("shi", "shi");
		json.addProperty("qu", "qu");
		json.addProperty("message", "message");
		json.addProperty("name", "name");
		json.addProperty("orderId", (System.currentTimeMillis()+"").substring(1));
		
		String string = new String(Base64.encode(json.toString()));
		
    	
		
		String request_data =	BaseWebMain.request_data(urlString, key, name,string);
		return request_data;
	}
	
	/**
	 * 首页获取门窗属性
	 * @return
	 * @throws Exception
	 */
	public static String getMenchuangShuxing() throws Exception{
		

		String url = "baba/getPubByFenleiid.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("fenleiid", "55f101bdd105fc1228077b11");
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "5");
		
		
		return hp.getResult();
	}

	/**
	 * 通过门窗属性查询商品
	 * @return
	 * @throws Exception
	 */
	public static String queryProductByShuxing() throws Exception{
		

		String url = "baba/getProductListByFenleiId.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("shuxing", "卧室门窗");
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "5");
		
		
		return hp.getResult();
	}
	/**
	 * 获取门窗搜索图片
	 * @return
	 * @throws Exception
	 */
	public static String getMenchuangSearchPic() throws Exception{
		
		String url = "baba/getPubById.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("id", "55f27723d812a81087eb9e21");
		
		
		return hp.getResult();
	}
	
	/**
	 * 获取案例搜索图片
	 * @return
	 * @throws Exception
	 */
	public static String getAnliSearchPic() throws Exception{
		
		String url = "baba/getPubById.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("id", "55f2774bd812a81087eb9e24");
		
		return hp.getResult();
	}
	
	/**
	 * 首页获取案例属性
	 * @return
	 * @throws Exception
	 */
	public static String getAnliShuxing() throws Exception{
		

		String url = "baba/getPubByFenleiid.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("fenleiid", "55f29682d812a8284be70ade");
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "5");
		
		
		return hp.getResult();
	} 
	
	/**
	 * 通过案例属性查询商品
	 * @return
	 * @throws Exception
	 */
	public static String queryAnli() throws Exception{
		

		String url = "baba/findAnli.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("fenleiid", "55f2a36ad812a831c9125ebf");
//		hp.addParemeter("shuxing", "简约风格");
		hp.addParemeter("page", "1");
		hp.addParemeter("pageSize", "5");
		
		
		return hp.getResult();
	}
	/**
	 * 通过ID查询案例
	 * @return
	 * @throws Exception
	 */
	public static String getAnliById() throws Exception{
		

		String url = "baba/getAnliById.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		hp.addParemeter("id", "55f2a694d812a833f84b3c01");
		
		
		return hp.getResult();
	}
	/**
	 * 获取案例的分类
	 * @return
	 * @throws Exception
	 */
	public static String getAnliFenlei() throws Exception{
		
		String url = "baba/getAnliFenleiList.do";
		
		
		HttpPost hp = new HttpPost(new URL(baseUrl+url));
		
		String result = hp.getResult();
		
		return result;
	}
	 /**
		 * 获取攻略的分类
		 * @return
		 * @throws Exception
		 */
		public static String getGonglueFenlei() throws Exception{
			
			String url = "baba/getGonglueFenlei.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			String result = hp.getResult();
			
			return result;
		}
		
//		public static final Integer tuijian_yes = 			1;
//		public static final Integer tuijian_no = 			2;
		/**
		 * 获取推荐攻略
		 * @return
		 * @throws Exception
		 */
		public static String getGonglueTuijian() throws Exception{
			
			String url = "baba/getPubByFenleiid.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("fenleiid", "55f3d0bed812a81f62d53373");
//			hp.addParemeter("tuijian", tuijian_yes+"");
			hp.addParemeter("page", "1");
			hp.addParemeter("pageSize", "4");
			
			
			return hp.getResult();
		}
		/**
		 * 获取攻略详情
		 * @return
		 * @throws Exception
		 */
		public static String getGonglueByid() throws Exception{
			
			String url = "baba/getPubById.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("id", "55f3d0d9d812a81f62d53376");
			
			return hp.getResult();
		}
		/**
		 * 获取客服页banner
		 * @return
		 * @throws Exception
		 */
		public static String getKefuBanner() throws Exception{
			
			String url = "baba/getPubById.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("id", "55f7b121d812a80d22d4586a");
			
			return hp.getResult();
		}
		/**
		 * 服务和保障banner
		 * @return
		 * @throws Exception
		 */
		public static String getFuwuBaozhangBanner() throws Exception{
			
			String url = "baba/getPubById.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("id", "55f7b131d812a80d22d4586b");
			
			return hp.getResult();
		}
		
		/**
		 * 获取客服电话
		 * @return
		 * @throws Exception
		 */
		public static String getKefudianhuaList() throws Exception{
			
			String url = "baba/getPubByFenleiid.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("fenleiid", "55f79337d812a80d22d45864");
			
			return hp.getResult();
		}
		/**
		 * 服务和保障 窗爸爸的子栏目
		 * @return
		 * @throws Exception
		 */
		public static String getChuangbabaPubList() throws Exception{
			
			String url = "baba/getPubByFenleiid.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("fenleiid", "55f793b2d812a80d22d45866");
			
			return hp.getResult();
		}
		
		/**
		 * 服务和保障 信任和保障子项目
		 * @return
		 * @throws Exception
		 */
		public static String getXingrenbaozhangPubList() throws Exception{
			
			String url = "baba/getPubByFenleiid.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("fenleiid", "55f793c0d812a80d22d45867");
			
			return hp.getResult();
		}
		
		/**
		 * 用户信息列表
		 * @return
		 * @throws Exception
		 */
		public static String messageList() throws  Exception{
			String urlString = baseUrl+"face/userfront/messageList.do";
			
			String key = "d5f34b7136bda033bd80eeb7";
	    	String name = "18983261955"; 
	    	
	    	JsonObject json = new JsonObject();
			
			String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
			return request_data;
		}
		/**
		 * 用户首页 信息 收藏数 和未查看的信息数量
		 * @return
		 * @throws Exception
		 */
		public static String getUserIndexInfo() throws  Exception{
			String urlString = baseUrl+"face/userfront/getUserIndexInfo.do";
			
			String key = "d5f34b7136bda033bd80eeb7";
	    	String name = "18983261955"; 
	    	
	    	JsonObject json = new JsonObject();
			
			String request_data =	BaseWebMain.request_data(urlString, key, name,json.toString());
			return request_data;
		}
		
		/**
		 * 通过关键字查询商品
		 * @return
		 * @throws Exception
		 */
		public static String queryProductBySearchKey() throws Exception{

			String url = "baba/getProductListByFenleiId.do";
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
//			hp.addParemeter("searchKey", "80-126");
			hp.addParemeter("page", "1");
			hp.addParemeter("pageSize", "5");
			
			return hp.getResult();
		}
		/**
		 * 分享转发统计
		 * @return
		 * @throws Exception
		 */
		public static String shareCount() throws Exception{

			String url = "baba/shareCount.do";
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("pubId", "56245277d6c4594ea00de1be");
			
			return hp.getResult();
		}
		
		/**
		 * 获取二维码
		 * @return
		 * @throws Exception
		 */
		public static String getErweiMa() throws Exception{

			String url = "baba/getPubById.do";
			
			
			HttpPost hp = new HttpPost(new URL(baseUrl+url));
			
			hp.addParemeter("id", "56285f6dd812a80be69733f9");
			
			
			return hp.getResult();
		}
		
		 public static void main(String[] args) throws Exception {
//			 System.out.println(shareCount());
//				System.out.println(getAnliById());
			 
//			 System.out.println(2);
//			 System.out.println(yuyue());
//			 System.out.println( getGonglueTuijian() );
//			 System.out.println(shoucang());
//			 
//			 System.out.println(queryProductBySearchKey());
//			 
//			 System.out.println(shoucang_quxiao());
//			 
//			 System.out.println(queryProductBySearchKey());
//			 System.out.println(getErweiMa());
			 
//				System.out.println(getMyYuyue());
			}
}
