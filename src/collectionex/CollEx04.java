package collectionex;

import java.util.*;

public class CollEx04 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student stu = new Student();
		stu.setName("자바왕");
		stu.setBan(1);
		stu.setNo(1);
		list.add(stu);
		
		stu.setName("자바짱");
		stu.setBan(1);
		stu.setNo(2);
		list.add(stu);
		
		stu.setName("홍길동");
		stu.setBan(2);
		stu.setNo(1);
		list.add(stu);
		
		stu.setName("전우치");
		stu.setBan(2);
		stu.setNo(2);
		list.add(stu);

		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name + " " + s.ban + "반 " + s.no + "번");
		}
	}
}

