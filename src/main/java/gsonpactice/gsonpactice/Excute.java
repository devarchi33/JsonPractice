package gsonpactice.gsonpactice;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Excute {

	public static void main(String[] args){
		Gson gson = new Gson();
		
		List<School> schools = new ArrayList<School>();
		schools.add(new School("단국대","한남동",2005));
		schools.add(new School("중앙대","흑석동",2011));
		schools.add(new School("한양사이버대","행당동",2014));
		
		String result = gson.toJson(new Member("이동훈", 31, schools));
		System.out.println("============== JSON 표현식으로 변환 ==============");
		System.out.println(result);
		
		Member mem = gson.fromJson(result, Member.class);
		System.out.println();
		
		System.out.println("============== 자바 객체로 복원 ==============");
		System.out.println("name : " + mem.getName());
		System.out.println("age : " + mem.getAge());
		for(School sc : schools){
			System.out.println("school name : " + sc.getName());
			System.out.println("school location : " +sc.getLocation());
			System.out.println("enter year : " + sc.getEnterYear());
		}
	}
}
