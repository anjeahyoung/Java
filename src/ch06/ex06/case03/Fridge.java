package ch06.ex06.case03;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	@Override
	public void off() {}
}
//추상 메서드를 오버라이드 하면 일반 클래스로 되기 때문에 생성자 사용 가능