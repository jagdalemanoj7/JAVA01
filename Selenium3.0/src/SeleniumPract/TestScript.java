package SeleniumPract;

public class TestScript extends BrowserSelection {

	public static void main(String[] args) {
		
		TestScript script=new TestScript();
		
		script.selectBrowser("firefox");
		driver.get("http://google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}