package com.bluecrm.pages;

import com.bluecrm.utilities.ConfigurationReader;
import com.bluecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
   public WebElement loginButton;


   /* public void login(String username,String password){
      this.username.sendKeys(username);
      this.password.sendKeys(password);
      this.loginButton.click();
    }*/


}
