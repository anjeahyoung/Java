package ch06.ex07.case01;

public sealed class Pet permits Dog, Cat{

}
//sealed 클래스는 부모클래스임을 전재로 한다.
//부모가 실드클래스라면 자식도 실드여야 한다.
//자식에서 실드를 마무리 하는 방법은 non-sealed, final 이 있다.
//non-sealed는 다음 상속때 문제가 없지만 final은 문제가 생긴다.
//non-sealed 사용