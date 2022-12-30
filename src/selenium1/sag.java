package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sag {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("sajidshikalgar10@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("9766915135");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		String ele = driver.getCurrentUrl();
		System.out.println(ele);
		driver.close();
		
}
