package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class sources {
WebDriver driver;
public sources(WebDriver driver){
 this.driver = driver;
 PageFactory.initElements( driver, this);
}
public void LoginSteps(String firstname,String lasstname,String password) {
 driver.findElement(By.id("gender-male")).click();
 driver.findElement(By.id("FirstName")).sendKeys(firstname);
 driver.findElement(By.id("LastName")).sendKeys(lasstname);
 Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
 day.selectByValue("4");
 Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
 month.selectByValue("8");
 Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
 year.selectByValue("2005");
 driver.findElement(By.id("Email")).sendKeys("2e0405f580@mailmaxy.one");
 driver.findElement(By.id("Company")).sendKeys("None");
 driver.findElement(By.id("Password")).sendKeys(password);
 driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
 driver.findElement(By.name("register-button")).click();


}
}
