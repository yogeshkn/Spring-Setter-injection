
public class WelcomeBean {
	
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show() {
		System.out.println("I am inside the Show Method");
		System.out.println(message);
	}

}
