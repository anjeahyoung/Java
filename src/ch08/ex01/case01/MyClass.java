package ch08.ex01.case01;

@Universal
@Type(name="class", value=1)
public class MyClass {
	@Field(value=1) @Universal // "value =" 생략가능 
	private String myName;
	
	
//	@Constructor
	public MyClass() {};
	
	@Method
	public void play(@Param String userName, @Param int age) {
		@Local int i = 0;
	}
}
