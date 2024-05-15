package web.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.web.servlet.view.RedirectView;

import web.handler.RoutingServlet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
import org.mockito.Mockito;



public class RoutingServletFunctionalTest {

    private WebDriver driver;


    @Test
    public void testloginSuccessandallthreeSuccessfullAnswers() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
        // Load the login page
        driver.get("http://127.0.0.1:8888/login");

        // Log in with valid credentials
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dobInput = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameInput.sendKeys("ahsan");
        passwordInput.sendKeys("ahsan_pass");
        dobInput.sendKeys("10-12-1997");
        
     // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Answer question 1
        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1Input.sendKeys("5");
        number2Input.sendKeys("3");
        resultInput.sendKeys("8");
        
        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        q1SubmitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        String pageSource = driver.getPageSource();
//
//        // Verify that the error message text is present in the page source
//        Assert.assertTrue(pageSource.contains("Invalid input, Please enter numeric values.."));       

     // Get the current URL
     String currentUrl = driver.getCurrentUrl();

     // Assert the URL
     Assert.assertEquals("http://127.0.0.1:8888/q2", currentUrl);
//     
  // Answer question 2
     WebElement q2number1Input = driver.findElement(By.name("number1"));
     WebElement q2number2Input = driver.findElement(By.name("number2"));
     WebElement q2resultInput = driver.findElement(By.name("result"));
     WebElement q2SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

     q2number1Input.sendKeys("5");
     q2number2Input.sendKeys("3");
     q2resultInput.sendKeys("2");
     
     // Wait for the page to load
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     q2SubmitButton.click();

     // Wait for the page to load
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();  
     }

     // Get the current URL
     String current1Url = driver.getCurrentUrl();

     // Assert the URL
     Assert.assertEquals("http://127.0.0.1:8888/q3", current1Url);
     
     WebElement q3number1Input = driver.findElement(By.name("number1"));
     WebElement q3number2Input = driver.findElement(By.name("number2"));
     WebElement q3resultInput = driver.findElement(By.name("result"));
     WebElement q3SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

     q3number1Input.sendKeys("5");
     q3number2Input.sendKeys("3");
     q3resultInput.sendKeys("15");
     
     // Wait for the page to load
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     q3SubmitButton.click();

     // Wait for the page to load
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();  
     }

     // Get the current URL
     String current2Url = driver.getCurrentUrl();

     // Assert the URL
     Assert.assertEquals("http://127.0.0.1:8888/success", current2Url);
      driver.quit();



    }
        @Test
        public void testloginSuccessandfirstquestionansswerblank() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
        // Load the login page
        driver.get("http://127.0.0.1:8888/login");

        // Log in with valid credentials
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dobInput = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameInput.sendKeys("ahsan");
        passwordInput.sendKeys("ahsan_pass");
        dobInput.sendKeys("10-12-1997");
        
     // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Answer question 1
        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1Input.sendKeys("");
        number2Input.sendKeys("");
        resultInput.sendKeys("");
        
        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        q1SubmitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

     // Get the current URL
     String currentUrl = driver.getCurrentUrl();

     // Assert the URL
     Assert.assertEquals("http://127.0.0.1:8888/q1", currentUrl);

      driver.quit();



    }
        
        
        @Test
        public void testloginSuccessandfirstquestionansswerwrong() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
        // Load the login page
        driver.get("http://127.0.0.1:8888/login");

        // Log in with valid credentials
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dobInput = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameInput.sendKeys("ahsan");
        passwordInput.sendKeys("ahsan_pass");
        dobInput.sendKeys("10-12-1997");
        
     // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Answer question 1
        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1Input.sendKeys("5");
        number2Input.sendKeys("2");
        resultInput.sendKeys("3");
        
        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        q1SubmitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        String pageSource = driver.getPageSource();
                
        Assert.assertTrue(pageSource.contains("Wrong answer, try again."));       

     
        String currentUrl = driver.getCurrentUrl();

    
        Assert.assertEquals("http://127.0.0.1:8888/q1", currentUrl);

        driver.quit();



    }

   
}
