package javalangex;

public class StringBufferEx03 {
    public static void main(String[] args) {
        //concat : 문자열 뒤로 추가
        String str = new String("Java");

        System.out.println("원본 문자열 : " + str);
        System.out.println(str.concat("수업"));
        System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str);

        // 특정 위치에 있는 문자(char)
        String str1 = new String("해피썬데이");

        char ch = str1.charAt(2);
        System.out.println(str1 + "의 charAt(2) : " + ch);

        // 문자열의 일부분을 발췌
        // 3번 인덱스 ~ 끝까지
        String str2 = str1.substring(3);
        System.out.println(str1 + "의 substring(3) : " + str2);

        // 2번 ~ (4 - 1)번 인덱스
        String str3 = str1.substring(2, 4);
        System.out.println(str1 + "의 substring(2, 4) : " + str3);

        //contains : 문자열 포함 여부
        str = "my java test";
        System.out.println(str.contains("java"));
        System.out.println(str.contains(" my"));
        System.out.println(str.contains("JAVA"));
        System.out.println(str.contains("java test"));


        //문자열 치환 : replace , replaceAll(정규표현식 사용가능)
        String b = "Welcome to Java World ";
        System.out.println(b.replace("Java", "Computer"));
        System.out.println(b.replaceAll("Java", "Computer"));

        str = "abcdefghijk";
        System.out.println("result ===> " + str.replaceAll("[abchij]", "굿"));
        System.out.println("result ===> " + str.replaceAll("[^abchij]", "굿"));

        System.out.println("result ===> " + str.replace("a", "굿").replace("b", "굿").replace("c", "굿").replace("h", "굿").replace("i", "굿").replace("j", "굿"));
        System.out.println("result ===> " + str.replace("abc", "굿굿굿").replace("hij", "굿굿굿"));

        String a = "Welcome to Java World ";
        System.out.println(a.replaceAll("Java", "Computer"));
        System.out.println(a.substring(0, 4));
        System.out.println(a.substring(4));
        System.out.println(a.substring(1, 8));

        //대소문자 변경 : toUpperCase() , toLowerCase()
        a = "Welcome to Java World ";
        System.out.println(a.replaceAll("Java", "Computer"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        //공백  제거: trim()
        String str4 = "   공백  제거    공백  제거   ";
        System.out.println("[" + str4 + "]");
        System.out.println("[" + str4.trim() + "]"); //맨 왼쪽, 오른쪽의 공백 제거만 가능
        System.out.println("[" + str4.replace(" ", "") + "]"); //문자열치환으로 가운데 공백 제거

        //문자열 인덱스 indexOf
        a = "Good Afternoon!!";
        System.out.println(a.indexOf("noon"));
        System.out.println(a.indexOf(" Af"));

        String hello = "HelloWorld_MyWorld";
        System.out.println("1: " + hello.indexOf("World"));
        System.out.println("2: " + hello.lastIndexOf("World"));
        System.out.println("3: " + hello.indexOf("World", 10));
        System.out.println("4: " + hello.lastIndexOf("World", 13));

        hello = "AaBbCc"; //아스키코드 값으로 인덱스 찾기
        System.out.println(hello.indexOf(65));
        System.out.println(hello.indexOf(99));
    }
}
