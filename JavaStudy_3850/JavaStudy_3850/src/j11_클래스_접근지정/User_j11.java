package j11_클래스_접근지정;

public class User_j11 {
	private String username;
	private String password;
	private String name;
	private String eamil;
	
	public User_j11() {
	}
	
	

	public User_j11(String username, String password, String name, String eamil) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.eamil = eamil;
	}



	// getter = 값을 가져다 주는 것, setter = 대입
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

}
