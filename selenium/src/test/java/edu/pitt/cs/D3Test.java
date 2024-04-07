package edu.pitt.cs;
// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080//");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 4 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 5 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 6 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 7 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void dEFECT3FUNCATALOG() {
    // Test name: DEFECT3-FUN-CATALOG
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 3 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 4 | assertElementPresent | css=li:nth-child(1) > img | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(1) > img"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementPresent | css=li:nth-child(3) > img | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(3) > img"));
      assert(elements.size() > 0);
    }
    // 6 | assertElementPresent | css=li:nth-child(5) > img | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(5) > img"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | assertElementPresent | xpath=//div[@id='listing']/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 5 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | click | id=rentID | 
    driver.findElement(By.id("rentID")).click();
    // 5 | type | id=rentID | 1
    driver.findElement(By.id("rentID")).sendKeys("1");
    // 6 | click | css=.form-group:nth-child(3) .btn | 
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    // 7 | assertText | css=.list-group-item:nth-child(1) | Rented out
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("Rented out"));
    // 8 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 9 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertText | id=rentResult | Success!
    assertThat(driver.findElement(By.id("rentResult")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Feed')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Greet-A-Cat | 
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//*[contains(.,'Meow!Meow!Meow!')] | Meow!Meow!Meow!
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[contains(.,\'Meow!Meow!Meow!\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | storeAttribute | xpath=//a[contains(text(),'Reset')]@href | resetHref
    {
      WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Reset\')]"));
      String attribute = element.getAttribute("href");
      vars.put("resetHref", attribute);
    }
    // 4 | assert | resetHref | /reset
    assertEquals(vars.get("resetHref").toString(), "http://localhost:8080/reset");
  }
  @Test
  public void dEFECT1FUNFEED() {
    // Test name: DEFECT1-FUN-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | type | xpath=//input[@id='catnips'] | -3
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).sendKeys("-3");
    // 5 | click | xpath=//button[@onclick='feedSubmit()'] | 
    driver.findElement(By.xpath("//button[@onclick=\'feedSubmit()\']")).click();
    // 6 | assertText | xpath=//div[@id='feedResult'] | Cat fight!
    assertThat(driver.findElement(By.xpath("//div[@id=\'feedResult\']")).getText(), is("Cat fight!"));
  }
  @Test
  public void dEFECT2FUNGREETACAT() {
    // Test name: DEFECT2-FUN-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | type | xpath=//input[@id='rentID'] | 2
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).sendKeys("2");
    // 5 | click | xpath=//button[@onclick='rentSubmit()'] | 
    driver.findElement(By.xpath("//button[@onclick=\'rentSubmit()\']")).click();
    // 6 | click | linkText=Greet-A-Cat | 
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    // 7 | assertText | xpath=//div[@id='greeting']/h4 | Meow!Meow!
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow!Meow!"));
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | storeAttribute | xpath=//li[2]/img@src | secondImageSrc
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("secondImageSrc", attribute);
    }
    // 4 | assert | secondImageSrc | /images/cat2.jpg
    assertEquals(vars.get("secondImageSrc").toString(), "http://localhost:8080/images/cat2.jpg");
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Rent')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementPresent | xpath=//button[contains(.,'Return')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=true";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 5 | click | id=returnID | 
    driver.findElement(By.id("returnID")).click();
    // 6 | type | id=returnID | 2
    driver.findElement(By.id("returnID")).sendKeys("2");
    // 7 | click | xpath=//button[contains(.,'Return')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Return\')]")).click();
    // 8 | assertText | xpath=//div[@id='listing']/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 9 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | xpath=//div[@id='returnResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'returnResult\']")).getText(), is("Success!"));
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | type | xpath=//input[@id='catnips'] | 6
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).sendKeys("6");
    // 5 | click | xpath=//button[@onclick='feedSubmit()'] | 
    driver.findElement(By.xpath("//button[@onclick=\'feedSubmit()\']")).click();
    // 6 | assertText | xpath=//div[@id='feedResult'] | Nom, nom, nom.
    assertThat(driver.findElement(By.xpath("//div[@id=\'feedResult\']")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | open | /greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080//greet-a-cat/Jennyanydots");
    // 4 | assertElementPresent | xpath=//*[contains(.,'Meow! from Jennyanydots.')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[contains(.,\'Meow! from Jennyanydots.\')]"));
      assert(elements.size() > 0);
    }
  }
}
