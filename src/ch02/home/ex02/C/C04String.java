package ch02.home.ex02.C;

public class C04String {
	public static void main(String[] args)	{
		String s = "|" + "a happy".trim() + "|";
		s = s.concat("dog");
		s = s.substring(2);
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));
		
		int i = "apple".codePointAt(0);
		i = "a".hashCode();
		System.out.println(i);
		i = "b".hashCode();
		System.out.println(i);
		i = "b".compareTo("a");
		System.out.println(i);
		i = "a".compareTo("b");
		System.out.println(i);
		i = "A".compareTo("a");
		System.out.println(i);
		i = "A".compareToIgnoreCase("a"); //IgnoreCase 대소문자를 무시한다.
		System.out.println(i);
		i = s.indexOf("l");
		System.out.println(i);
		i = s.lastIndexOf("l");
		System.out.println(i);
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
		b = s.matches("[0-9]");
		System.out.println(b);
	}
}
