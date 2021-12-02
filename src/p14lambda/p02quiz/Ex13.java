package p14lambda.p02quiz;

import java.util.HashMap;
import java.util.Map;

public class Ex13 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("spring", 1);
		map.put("java", 1);
		map.put("html", 1);
		map.put("css", 1);
		
		// map.replaceAll
		// 각 entry의 값이 key의 length가 되도록 코드 완성
		
		// 풀어씀
//		map.replaceAll((k, v) -> {
//			System.out.println(k + ":" + v);
//			
//			return k.length();
//		});
		
		// lambda
		map.replaceAll((k, v) -> k.length());
		
		System.out.println(map);
		// {spring=6, css=3, java=4, html=4}
		
	}
}
