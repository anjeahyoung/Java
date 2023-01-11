package ch06.ex07.case02;

public sealed class Pet permits Dog, Bird{

}
//sealed 와 permits은 세트 둘중 하나만 있으면 컴파일 에러