package gsonpactice.gsonpactice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SimpleExample02 {

	public static void main(String[] args) throws IOException{
		Writer writer = new FileWriter("C:\\Users\\LG\\Desktop\\output.json");
		
		Gson gson = new GsonBuilder().create();
		gson.toJson("Hello",writer);
		gson.toJson("World",writer);
		gson.toJson(2015,writer);
		
		writer.close();
	}
}
