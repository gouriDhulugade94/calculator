package calculator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajinkya\\Desktop\\javaselenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		WebElement search=driver.findElement(By.name("calcSearchTerm"));
		search.sendKeys("MATH");
		WebElement math=driver.findElement(By.xpath("//*[@id=\"calcSearchOut\"]/div/a"));
		math.click();
		WebElement digit1=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit1.click();
		WebElement digit2=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit2.click();
		WebElement digit3=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit3.click();
		WebElement multiplication=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[4]"));
		multiplication.click();
		WebElement digit4=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[2]"));
		digit4.click();
		WebElement digit5=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[2]"));
		digit5.click();
		WebElement digit6=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[2]"));
		digit6.click();
		WebElement equals=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[4]"));
		equals.click();
		
		WebElement AC=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[3]"));
		AC.click();
		
		WebElement digit7=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit7.click();
		WebElement digit8=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[1]"));
		digit8.click();
		WebElement digit9=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[1]"));
		digit9.click();
		WebElement digit10=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[1]"));
		digit10.click();
		WebElement division=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[4]"));
		division.click();
		WebElement digit11=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit11.click();
		WebElement digit12=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[1]"));
		digit12.click();
		WebElement digit13=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[1]"));
		digit13.click();
		WebElement equals1=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[4]"));
		equals1.click();
		
		WebElement AC1=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[3]"));
		AC1.click();
		
		WebElement minus=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[4]"));
		minus.click();
		WebElement digit14=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit14.click();
		WebElement digit15=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit15.click();
		WebElement digit16=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit16.click();
		WebElement digit17=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit17.click();
		WebElement digit18=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit18.click();
		WebElement digit19=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit19.click();
		WebElement addition=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[1]/span[4]"));
		addition.click();
		WebElement digit20=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit20.click();
		WebElement digit21=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit21.click();
		WebElement digit22=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[2]"));
		digit22.click();
		WebElement digit23=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit23.click();
		WebElement digit24=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit24.click();
		WebElement digit25=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[2]"));
		digit25.click();
		WebElement equals2=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[4]"));
		equals2.click();
		WebElement AC2=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[3]"));
		AC2.click();
		
		
		WebElement digit26=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit26.click();
		WebElement digit27=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit27.click();
		WebElement digit28=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit28.click();
		WebElement digit29=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[1]/span[2]"));
		digit29.click();
		WebElement digit30=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit30.click();
		WebElement digit31=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit31.click();
		WebElement substraction=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[4]"));
		substraction.click();
		WebElement minus1=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[4]"));
		minus1.click();
		WebElement digit32=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit32.click();
		WebElement digit33=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit33.click();
		WebElement digit34=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[4]/span[1]"));
		digit34.click();
		WebElement digit35=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[1]/span[3]"));
		digit35.click();
		WebElement digit36=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[2]/span[1]"));
		digit36.click();
		WebElement digit37=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[1]/span[2]"));
		digit37.click();
		WebElement digit38=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[2]"));
		digit38.click();
		WebElement digit39=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[3]/span[3]"));
		digit39.click();
		WebElement equals3=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[4]"));
		equals3.click();
		WebElement AC3=driver.findElement(By.xpath("//*[@id=\"sciout\"]/div[2]/div[5]/span[3]"));
		AC3.click();
		driver.close();
		driver.quit();
		
	}

}