package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s ="|" + "a happy ".trim() + "|"; // trim 머리 꼬리에 있는 여백을 없애준다.
		s = s.concat(" dog"); //concat 문자를 붙일때 사용한다.
		s = s.substring(2); //substring 앞에 문자를 자를때 사용한다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));// charAt 데이터 안에 문자 하나를 가지고 올때 사용한다.
		
		int i = "apple".codePointAt(3); //codePoint 데이터의 유니코드값을 보여준다.
		i = "a".hashCode(); //hashCode
		i = "b".hashCode();
		i = "b".compareTo("a"); //compareTo hashCode의 차이를 보여준다.
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a"); //compareToIgnoreCase 대소문자 무시
		i = s.indexOf("l");
		i = s.lastIndexOf("l");
		i = s.length();
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-]*");
		System.out.println(b);
	}
}