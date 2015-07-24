import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Test { 
	
	

	 public String mapToJson(Map<String, String> maps){
		 StringBuilder sb = new StringBuilder();
		 
		 Set<Entry<String, String>> entrySet = maps.entrySet();
		 sb.append("{");
		 
		 for (Entry<String, String> entry : entrySet) {
			
			 sb.append("");
			 
		}
		 sb.append("{");
		 return sb.toString();
	 }
}
