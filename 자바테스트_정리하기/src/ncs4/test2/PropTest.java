package ncs4.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropTest {
	// 파일 저장
	public static void fileSave(Properties p) throws IOException {
		// Properties 객체에 데이터 저장
		// setProperty 무조건("", "")
		p.setProperty("1", "apple,1200,3");
		p.setProperty("2", "banana,2500,2");
		p.setProperty("3", "grape,4500,5");
		p.setProperty("4", "orange,800,10");
		p.setProperty("5", "melon,5000,2");
		
		// Properties 객체를 XML 파일로 저장
		FileOutputStream fos = new FileOutputStream("data.xml");
		p.storeToXML(fos, null);
		// xml 파일로 저장할 것,  fos : 입출력 입력하겠다.
		// null 코멘트로 설명을 달아서 저장하겠다 라는 것
		// 추가로 작성할 설명이 없으면 null 처리를 함
		fos.close();	
	}
	
	// 파일 읽기
	public static void fileOpen(Properties p) {
		try {
			// Properties 객체에 XML 파일 내용 읽어올 준비 하기
			FileInputStream fis = new FileInputStream("data.xml");
			p.loadFromXML(fis);
			fis.close();
			
			// Properties 객체에 키-값 으로 Fruit 객체를 List로 저장
			List<Fruit> fruits = new ArrayList<>();
			// 파일에 저장
			for(String key : p.stringPropertyNames()) {
				// 설정에 적혀있는 문자이름을 가져와서 key로 넣을 예정
				String[] values = p.getProperty(key).split(",");
				// "apple,1200,3"   , 로 구분해서 각각 값을 저장하겠다는 의미
				//					 "apple,			1200,						3"
								//    String		String -> int				String -> int
				Fruit 과일 = new Fruit(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
				fruits.add(과일);
			
			}
			
			// List 배열로 변환하고 오름차순으로 정렬
			Fruit[] 과일배열 = fruits.toArray(new Fruit[0]);
			// 정렬하기
			Arrays.sort(과일배열);
			
			// Fruit 배열 출력
			System.out.println("Fruit 배열 출력");
			for(Fruit f : 과일배열) {
				System.out.println(f);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 최종으로 출력하기
	
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		fileSave(p);
		fileOpen(p);
	}
	
}
