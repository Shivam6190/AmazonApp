package steps2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;




public class AmazonStep {
	
	WebDriver driver;

	@Given("I open the browser and enter URL")
	public void i_open_the_browser_and_enter_url() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
			
	}

	@Then("I click on mobiles")
	public void i_click_on_mobiles() {
		driver.findElement(By.linkText("Mobiles")).click();
	}

	@Then("I click on mobiles and accessories")
	public void i_click_on_mobiles_and_accessories() {
		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(mobile).build().perform();
	}

	@Then("I click on product")
	public void i_click_on_product() {
		driver.findElement(By.linkText("Apple")).click();
		// Click on apple phone link
		driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();
	
	}

	@Then("I click on add to cart")
	public void i_click_on_add_to_cart() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();

	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		driver.quit();
	}

}
