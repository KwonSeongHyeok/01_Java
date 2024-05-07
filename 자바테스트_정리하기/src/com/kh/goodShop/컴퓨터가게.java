package com.kh.goodShop;

import java.util.*;

public class 컴퓨터가게 {
	public static void main(String[] args) {
		
		// 모든 제품 HashMap
		Map<String, Integer> 모든제품 = new HashMap<>();
		
		모든제품.put("노트북", 700000);
		모든제품.put("데트크탑", 20000);
		모든제품.put("모니터", 5000);
		모든제품.put("마우스", 3000);
		모든제품.put("키보드", 2000);
		
		// Entry 사용해서 출력
		System.out.println("컴퓨터 상품 목록");
		for(Map.Entry<String, Integer> e : 모든제품.entrySet()) {
			String 제품명 = e.getKey();
			int 제품가격 = e.getValue();
			System.out.println(제품명 + "은 " + 제품가격 + "원 입니다.");
		}
			
		// 특정 물품의 가격 출력
		// Scanner로 입력받아서 확인
		System.out.print("찾는 물건을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String 찾는물건 = sc.nextLine(); // "USB";
		
		System.out.println(찾는물건 + " 가게에 있습니까?");
		
		// containsKey 존재하는지 존재하지 않는지 if 문 사용해서 확인 후
		// 존재한다면 네~! 존재합니다.
		// 존재하지않는다면 현재 품절입니다.
		if(모든제품.containsKey(찾는물건)) {
			int 제품가 = 모든제품.get(찾는물건);
			System.out.println("네~! 존재합니다. 가격은 " + 제품가 + "원 입니다.");
		} else {
			System.out.println("현재 품절입니다.");
		}
		
	}
}
