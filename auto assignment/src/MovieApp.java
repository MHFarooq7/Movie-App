import java.io.PrintStream;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MovieApp {
  

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hasan\\Desktop\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    String WebUrl = ("http://www.tcm.com/tcmdb/");
    driver.get(WebUrl);
    System.out.print(WebUrl);
    WebElement movieList = driver.findElement(By.xpath(".//*[@id='movieSearchList']"));
    if (movieList.isDisplayed()) {
        driver.findElement(By.linkText("To Have and Have Not (1944)")).click();
        System.out.println("Click on To Have and Have not Movie link");
        
          boolean movieTitle = driver.getPageSource().contains("To Have and Have Not");
         
          if (movieTitle == true)
          {
           System.out.print("Movie Title is displayed"  + "\n");
          }
          else
          {
           System.out.print("Movie Title is missing"  + "\n");
          }
          Thread.sleep(5000);
          boolean overview = driver.getPageSource().contains("A skipper-for-hire's romance with a beautiful drifter is complicated by his growing involvement with the French resistance. ");
          
          if (overview != true)
          {
           System.out.print("Movie overview  is displayed" + "\n" );
           
          }
          else
          {
           System.out.print("Movie overview is missing" + "\n");
          }
          Thread.sleep(5000);
         String crew1 = driver.findElement(By.xpath(".//*[@id='overViewbox']/div[6]/div[2]/div[2]/strong/a")).getText();
         System.out.println(crew1 + "is one of the crew member" );
         
         Thread.sleep(5000);
         String crew2 = driver.findElement(By.xpath(".//*[@id='overViewbox']/div[6]/div[3]/div[3]/strong/a")).getText();
         System.out.println(crew2 + "is another of the crew member" );

         Thread.sleep(5000);
         String VerifyReleaseDate = driver.findElement(By.xpath(".//*[@id='additional']/table/tbody/tr[2]/td[2]")).getText();
          
         Object releasedate = 1944 ;
         if (VerifyReleaseDate == releasedate) {
        	 System.out.println("The release date is " + releasedate);
         } else {
        	 System.out.println("The release date is " + VerifyReleaseDate);
         }
          
          driver.quit();
          System.out.println("All steps passed");
          
          
          
        
  
    }
}

  }