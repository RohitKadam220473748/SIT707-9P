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
        
        driver.get("http://127.0.0.1:8888/login");

        
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dobInput = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameInput.sendKeys("ahsan");
        passwordInput.sendKeys("ahsan_pass");
        dobInput.sendKeys("10-12-1997");
        
     
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     
        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1Input.sendKeys("5");
        number2Input.sendKeys("3");
        resultInput.sendKeys("8");
        
       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        q1SubmitButton.click();

        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     String currentUrl = driver.getCurrentUrl();

     
     Assert.assertEquals("http://127.0.0.1:8888/q2", currentUrl);

     WebElement q2number1Input = driver.findElement(By.name("number1"));
     WebElement q2number2Input = driver.findElement(By.name("number2"));
     WebElement q2resultInput = driver.findElement(By.name("result"));
     WebElement q2SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

     q2number1Input.sendKeys("5");
     q2number2Input.sendKeys("3");
     q2resultInput.sendKeys("2");
     
    
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     q2SubmitButton.click();

     
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();  
     }

    
     String current1Url = driver.getCurrentUrl();

    
     Assert.assertEquals("http://127.0.0.1:8888/q3", current1Url);
     
     WebElement q3number1Input = driver.findElement(By.name("number1"));
     WebElement q3number2Input = driver.findElement(By.name("number2"));
     WebElement q3resultInput = driver.findElement(By.name("result"));
     WebElement q3SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

     q3number1Input.sendKeys("5");
     q3number2Input.sendKeys("3");
     q3resultInput.sendKeys("15");
     
     
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     q3SubmitButton.click();

    
     try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         e.printStackTrace();  
     }

     String pageSource = driver.getPageSource();
     
     Assert.assertTrue(pageSource.contains("Congrats all answers are correct."));
    
      driver.quit();



    }
        @Test
        public void testloginSuccessandfirstquestionansswerblank() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
        
        driver.get("http://127.0.0.1:8888/login");

        
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dobInput = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameInput.sendKeys("ahsan");
        passwordInput.sendKeys("ahsan_pass");
        dobInput.sendKeys("10-12-1997");
        
     
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1Input.sendKeys("");
        number2Input.sendKeys("");
        resultInput.sendKeys("");
        
      
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        q1SubmitButton.click();

        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        String pageSource = driver.getPageSource();
        
        Assert.assertTrue(pageSource.contains("Please provide values for both numbers."));

      driver.quit();



    }
        
        
        @Test
        public void testloginSuccessandfirstquestionansswerwrong() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
        
        driver.get("http://127.0.0.1:8888/login");

       
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dobInput = driver.findElement(By.id("dob"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameInput.sendKeys("ahsan");
        passwordInput.sendKeys("ahsan_pass");
        dobInput.sendKeys("10-12-1997");
        
    
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        submitButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1Input.sendKeys("5");
        number2Input.sendKeys("2");
        resultInput.sendKeys("3");
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        q1SubmitButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        String pageSource = driver.getPageSource();
                
        Assert.assertTrue(pageSource.contains("Wrong answer, try again."));       

        driver.quit();



    }
        
        
        @Test
        public void testloginSuccessFirstgiveemptyanswersinq1andthanallthreeSuccessfullAnswers() {
        	
        	System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
            WebDriver driver = new ChromeDriver();		
    		System.out.println("Driver info: " + driver);

            driver.get("http://127.0.0.1:8888/login");

            
            WebElement usernameInput = driver.findElement(By.id("username"));
            WebElement passwordInput = driver.findElement(By.id("passwd"));
            WebElement dobInput = driver.findElement(By.id("dob"));
            WebElement submitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

            usernameInput.sendKeys("ahsan");
            passwordInput.sendKeys("ahsan_pass");
            dobInput.sendKeys("10-12-1997");
            
         
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            submitButton.click();

           
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

       
            WebElement number1Input = driver.findElement(By.name("number1"));
            WebElement number2Input = driver.findElement(By.name("number2"));
            WebElement resultInput = driver.findElement(By.name("result"));
            WebElement q1SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

            number1Input.sendKeys("");
            number2Input.sendKeys("");
            resultInput.sendKeys("");
            
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            q1SubmitButton.click();

           
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            String pageSource = driver.getPageSource();
            
            Assert.assertTrue(pageSource.contains("Please provide values for both numbers."));
            
            WebElement number1InputT2 = driver.findElement(By.name("number1"));
            WebElement number2InputT2 = driver.findElement(By.name("number2"));
            WebElement resultInputT2 = driver.findElement(By.name("result"));
            WebElement q1SubmitButtonT2 = driver.findElement(By.xpath("/html/body/form/input[4]"));

            number1InputT2.sendKeys("6");
            number2InputT2.sendKeys("2");
            resultInputT2.sendKeys("8");
            
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            q1SubmitButtonT2.click();

           
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

       
         String currentUrl = driver.getCurrentUrl();

        
         Assert.assertEquals("http://127.0.0.1:8888/q2", currentUrl);
         
      
         WebElement q2number1Input = driver.findElement(By.name("number1"));
         WebElement q2number2Input = driver.findElement(By.name("number2"));
         WebElement q2resultInput = driver.findElement(By.name("result"));
         WebElement q2SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

         q2number1Input.sendKeys("5");
         q2number2Input.sendKeys("3");
         q2resultInput.sendKeys("2");
         
        
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         q2SubmitButton.click();

         
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();  
         }

        
         String current1Url = driver.getCurrentUrl();

        
         Assert.assertEquals("http://127.0.0.1:8888/q3", current1Url);
         
         WebElement q3number1Input = driver.findElement(By.name("number1"));
         WebElement q3number2Input = driver.findElement(By.name("number2"));
         WebElement q3resultInput = driver.findElement(By.name("result"));
         WebElement q3SubmitButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

         q3number1Input.sendKeys("5");
         q3number2Input.sendKeys("3");
         q3resultInput.sendKeys("15");
         
         
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         q3SubmitButton.click();

         
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();  
         }

         String pageSource1 = driver.getPageSource();
         
         Assert.assertTrue(pageSource1.contains("Congrats all answers are correct."));
         
          driver.quit();



        }

   
}
