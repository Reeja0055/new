import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //launching browser
		driver.get("https://www.flipkart.com");
		driver.navigate().to("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");

	}

}
