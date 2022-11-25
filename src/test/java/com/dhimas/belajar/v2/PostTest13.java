package com.dhimas.belajar.v2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;	 
	public class PostTest13 {
	    @Test
	    public void posttest13() throws InterruptedException {
	        System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe" );
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://formy-project.herokuapp.com/form");
	 
	        WebElement firstName = driver.findElement(By.id("first-name"));
	        firstName.sendKeys("Dhimas");
	        Thread.sleep(1500);
	        WebElement lastName = driver.findElement(By.id("last-name"));
	        lastName.sendKeys("Marwahyu");
	        Thread.sleep(1500);
	        WebElement jobTitle = driver.findElement(By.id("job-title"));
	        jobTitle.sendKeys("Staff IT Programmer");
	        Thread.sleep(1500);
	        WebElement levelEdu = driver.findElement(By.id("radio-button-1"));
	        levelEdu.click();
	        Thread.sleep(1500);
	        WebElement levelEdu2 = driver.findElement(By.id("radio-button-3"));
	        levelEdu2.click();
	        Thread.sleep(1500);
	        WebElement sex1 = driver.findElement(By.id("checkbox-1"));
	        sex1.click();
	        Thread.sleep(1500);
	        Select experience = new Select(driver.findElement(By.id("select-menu")));
	        experience.selectByValue("1");
	        Thread.sleep(1500);
	        WebElement date = driver.findElement(By.id("datepicker"));
	        date.click();
	        Thread.sleep(1500);
	        List<WebElement> dates = driver.findElements(By.className("day"));
	 
	        int count = driver.findElements(By.className("day")).size();
	 
	        for (int i=0; i<count;i++){
	            String text = driver.findElements(By.className("day")).get(i).getText();
	            if (text.equalsIgnoreCase("21")){
	                driver.findElements(By.className("day")).get(i).click();
	                break;
	            }
	        }
	        Thread.sleep(1500);
	        WebElement submit = driver.findElement(By.xpath("//a[@role='button']"));
	        submit.click();
	}
}
