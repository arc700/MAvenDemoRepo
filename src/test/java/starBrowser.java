import java.util.List;

import org.omg.CORBA.SystemException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class starBrowser {

	@Test
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement newAcc = driver
				.findElement(By.cssSelector("a[role='button'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		newAcc.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.cssSelector("#day"));
		// day.click();
		Select selectDay = new Select(day);
		selectDay.selectByIndex(0);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("4");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("2022");
		
		Thread.sleep(2000);
		
		System.out.println(selectYear.getFirstSelectedOption().getText());
		List<WebElement> mon = selectMonth.getOptions();
		for (WebElement ele : mon) {
			System.out.println(ele.getText()+"---- size "+mon.size());
		}
		

	}

}
