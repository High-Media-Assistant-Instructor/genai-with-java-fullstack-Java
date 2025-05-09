package collectionex;

//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;

public class CollEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");

		System.out.println("요소의 개수 : " + list.size());

		System.out.println(">> Iterator 객체로 요소 얻기 <<");
//		Iterator elements = list.iterator(); // 1.5이전
		Iterator<String> elements = list.iterator();
		while (elements.hasNext()) {
//			String str = (String) elements.next();// 1.5이전
			String str = elements.next();
			System.out.print(str + "\t");
		}
		System.out.println("\n");

		System.out.println(">> get메소드로 요소 얻기 <<");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();

	}

}
