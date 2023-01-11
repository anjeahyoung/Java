package home.ex05.case06;

public class Man {
	private String manName;
	private Phone phone;

	public void game() {
		phone.game();
	}	

	public void msg()	{
		phone.msg();
	}

	public void call()	{
		phone.call();
	}

	public final String getManName() {
		return manName;
	}

	public final Phone getPhone() {
		return phone;
	}

	public final void setManName(String manName) {
		this.manName = manName;
	}

	public final void setPhone(Phone phone) {
		this.phone = phone;
	}
}