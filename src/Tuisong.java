import java.io.IOException;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Tuisong {
	
	public static void main(String[] args) throws IOException {
		
		local();
		
//		detail();
		
	}
	public static void local() throws IOException{
			String url = "http://api.map.baidu.com/geosearch/v3/local";
			
			HttpGet hg = new HttpGet(url);

			String q = "";
			String geotable_id = "103236";
			String ak = "3EQkyVB7qqRGAehd7uTmDKUT";
			String coord_type = "3";
			String region = "四川";

			hg.addParemeter("ak", ak);// string(50) 必选
			hg.addParemeter("geotable_id", geotable_id);// string(50)
			hg.addParemeter("q", q);
//			hg.addParemeter("coord_type", coord_type);
			hg.addParemeter("region", region);
//			hg.addParemeter("tags", tags);
			// 必选，加密后的id

			String result = hg.getResult();

			JsonParser jp = new JsonParser();
			JsonElement parse = jp.parse(result);

			System.out.println(parse);
			
	}

	public static void detail() throws IOException {
		String url = "http://api.map.baidu.com/geodata/v3/poi/detail";

		HttpGet hg = new HttpGet(url);

		String id = "1054304333";
		String geotable_id = "103236";
		String ak = "3EQkyVB7qqRGAehd7uTmDKUT";

		hg.addParemeter("id", id);
		hg.addParemeter("geotable_id", geotable_id);// string(50)
		// 必选，加密后的id
		hg.addParemeter("ak", ak);// string(50) 必选

		String result = hg.getResult();

		JsonParser jp = new JsonParser();
		JsonElement parse = jp.parse(result);

		System.out.println(parse);
	}

	/**
	 * 参数名 参数含义 类型 备注 title poi名称 string(256) 可选 address 地址 string(256) 可选 tags
	 * tags string(256) 可选 latitude 用户上传的纬度 double 必选 longitude 用户上传的经度 double
	 * 必选 coord_type 用户上传的坐标的类型 uint32 必选 1：GPS经纬度坐标 2：国测局加密经纬度坐标 3：百度加密经纬度坐标
	 * 4：百度加密墨卡托坐标 geotable_id 记录关联的geotable的标识 string(50) 必选，加密后的id ak
	 * 用户的访问权限key string(50) 必选 sn 用户的权限签名 string(50) 可选 {column key}
	 * 用户在column定义的key/value对 开发者自定义的类型（string、int、double）
	 * 唯一索引字段必选，且需要保证唯一，否则会创建失败
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void create() throws IOException {

		String url = "http://api.map.baidu.com/geodata/v3/poi/create";

		long currentTimeMillis = System.currentTimeMillis();

		HttpPost hg = new HttpPost(new URL(url));

		String title = "测试2";
		String address = "测试";
		String tags = "测试";
		String latitude = "29.59811";
		String longitude = "106.720584";
		String coord_type = "3";
		String geotable_id = "103236";
		String ak = "3EQkyVB7qqRGAehd7uTmDKUT";

		hg.addParemeter("title", title);// string(256) 可选
		hg.addParemeter("address", address);// string(256) 可选
		hg.addParemeter("tags", tags);// string(256) 可选
		hg.addParemeter("latitude", latitude);// double 必选
		hg.addParemeter("longitude", longitude);// double 必选
		/**
		 * 1：GPS经纬度坐标 2：国测局加密经纬度坐标 3：百度加密经纬度坐标 4：百度加密墨卡托坐标
		 */
		hg.addParemeter("coord_type", coord_type);// uint32 必选
		hg.addParemeter("geotable_id", geotable_id);// string(50)
		hg.addParemeter("ak", ak);// string(50) 必选
		hg.addParemeter("businessid", "112321");// 开发者自定义的类型（string、int、double）
		hg.addParemeter("tel", "4");// 开发者自定义的类型（string、int、double）

		String result = hg.getResult();

		JsonParser jp = new JsonParser();
		JsonElement parse = jp.parse(result);

		System.out.println(parse);
	}
}
