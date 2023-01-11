package ch07.ex06.case04;

public class Box {
	public <T> T getLastval(T[] arr) {
		return arr[arr.length - 1];
	}
}
