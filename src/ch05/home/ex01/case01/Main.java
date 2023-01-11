package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		
		flower flower1 = new flower();
		flower flower2 = new flower();
		
		flower1.flowerName = "창포꽃";
		flower1.PetalLength = 7;
		flower1.sepalLength = 2;
		
		flower2.flowerName  = "코스모스";
		flower2.PetalLength = 4;
		flower2.sepalLength = 1;
		
		System.out.printf("%s꽃잎 길이: %dcm %s꽃받침 길이: %dcm\n",flower1.flowerName, flower1.PetalLength ,flower1.flowerName, flower1.sepalLength);
		System.out.printf("%s꽃잎 길이: %dcm %s꽃받침 길이: %dcm\n",flower2.flowerName, flower2.PetalLength,flower2.flowerName, flower2.sepalLength);
	}
}
/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다.
코스모스는 꽃잎 길이가 4cm,꽃받침 길이가 1cm입니다.
*/