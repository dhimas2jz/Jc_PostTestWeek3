package com.dhimas.belajar.v2;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public class PostTest11 {
	
	@Test
	public class Posttes11 {
	    public void PostTes11() {
	        System.setProperty("webdriver.edge.driver",
	                "C:\\msedgedriver.exe");
	 
	        WebDriver driver = new EdgeDriver();
	        String baseURL = "https://www.tokopedia.com";
	        driver.get(baseURL);
	        boolean state = true;
	        driver.findElement(By.xpath("//input[@class='css-1wc186l e110g5pc0']")).sendKeys("Iphone", Keys.ENTER);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        int hargaTampung = 0;
	        while (state) {
	            try {
	                List<WebElement> elements = driver.findElements(By.cssSelector("div[data-testid=\"spnSRPProdPrice\"]"));
	                for (WebElement harga : elements) {
	                    hargaTampung = Integer.parseInt(harga.getText().replaceAll("\\D+", ""));
	                    System.out.println(hargaTampung);
	                }
	                state = false;
	            } catch (Exception e) {
	                state = true;
	            }
	        }
	        assertTrue(hargaTampung > 0);
	        driver.quit();
	    
	    }
	}
}


