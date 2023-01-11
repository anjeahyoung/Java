package ch05.ex09.case01;

import ch05.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;

	static {
		Init.s = 1;
		//this.i = 1;
		Console.info("static{}");
	}

	{
		this.i = 1;
		//Init.s = 1; 할수 있지만 가독성을 위해 안함
		Console.info("{}");
	}

	{
		Console.info("{}2");
	}

	public Init() {
		Console.info("Init()");
	}

	public Init(int i) {
		Console.info("Init(int)");
	}
}