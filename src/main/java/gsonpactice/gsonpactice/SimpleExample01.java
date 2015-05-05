package gsonpactice.gsonpactice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SimpleExample01 {

	public static void main(String[] args){
		Gson gson = new GsonBuilder().create();
		gson.toJson("Hello", System.out);
		gson.toJson("World", System.out);
		gson.toJson(2015, System.out);
	}
}
