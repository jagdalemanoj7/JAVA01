package SeleniumPract;

public class TestBrowsing extends StartBrowsing {
	public static void main(String[] args) {
		
		TestBrowsing test = new TestBrowsing();
		test.SelectBrowser("firefox");
		
		driver.get("https:/google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}