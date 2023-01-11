package ch04.home.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too lone.";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know.";}
		case 2 -> {
			String message = comment + "is good.";
			yield message;
		}
		default -> {yield comment + "is too long.";}
		};
		System.out.println(msg);
		
		int yield = 1;
		System.out.println(yield);
	}
}
