package ch08.ex02.case05;

public class User {
	private String userName;
	private Level level;
	
	public User(String userName,Level level) {
		this.userName = userName;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		if(nextLevel != null) this.level = nextLevel;
	}
	//service에 들어갈 업무에 필요한 메서드이지만 domain내에서 처리 가능한 가벼운 메서드는 domain내에서 처리한다. 
	@Override
	public String toString() {
		return String.format("%s %s", userName, level);
	}
}
