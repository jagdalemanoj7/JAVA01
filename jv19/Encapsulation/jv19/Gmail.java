package jv19;

public class Gmail {
	private final String userName;
	private String password;
	
	Gmail(String userName, String password)
	{
		this.userName=userName;
		this.password=password;		
	}
	
	public String getUsername()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	//	Can't create setter for User Name...0
}
