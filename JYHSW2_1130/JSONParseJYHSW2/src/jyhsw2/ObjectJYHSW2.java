package jyhsw2;
import org.json.simple.JSONObject;


public class ObjectJYHSW2 {
	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
	    obj.put("Név", "Blászló");
	    obj.put("Fizetés", 1000000.0);
	    obj.put("Kor", 21);
	    System.out.print(obj);
        
        /*JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");
        
        obj.put("messages", list);*/
        
	}
}