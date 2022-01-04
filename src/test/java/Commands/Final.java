package Commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.testng.annotations.*;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;



import com.sun.xml.bind.v2.model.core.TypeRef;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;

import com.codeborne.selenide.Condition;
import org.json.simple.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


import org.openqa.selenium.*;

import static io.restassured.RestAssured.given;

public class Final {

    @Test
    public void firstTest() {
        RestAssured.baseURI = "https://bookstore.toolsqa.com/Account/v1/User";
        RequestSpecification request = given().header("Content-type", "application/json");

        JSONObject requestParams = new JSONObject();
        requestParams.put("userName", "Virrrr"); // Cast
        requestParams.put("password", "Sin1ggggg23!");
        request.body(requestParams.toJSONString());
        Response response = request.post("https://bookstore.toolsqa.com/Account/v1/User");

        ResponseBody body = response.getBody();
        System.out.println(body.jsonPath().toString());
        Assert.assertEquals(response.statusCode(),201);
        // Deserialize the Response body into RegistrationSuccessResponse

    }
    @Test
    public void LoginForm() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chrome = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chrome);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
        WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/form/div[2]/div[2]/input"));
        userName.sendKeys("Virrrr");
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/form/div[3]/div[2]/input"));
        password.sendKeys("Sin1ggggg23!");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/form/div[4]/div/button"));
        login.click();

//        js.executeScript("window.scrollBy(0,300)", "");
//       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        JavascriptExecutor executor = (JavascriptExecutor)driver;
////        executor.executeScript("document.body.style.zoom = '0.5'");
//
//        Thread.sleep(2000);
        //WebElement deleteButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[3]/div[2]/button"));
        //WebElement deleteButton = driver.findElement((By.cssSelector("div#text-center button button")));
        //deleteButton.click();

// Before you try to switch to the so given alert, he needs to be present.




//        Alert alert = driver.switchTo().alert();
//        assert Objects.equals(alert.getText(), "User Deleted.");
//        alert.accept();
//        Helpers.FindAndScroll($(By.xpath("//button[text()='Delete Account']"))).click();
//        $("#closeSmallModal-ok").click();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        var deleteAccountSelectorString = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 >" +

                " div.profile-wrapper > div.mt-2.buttonWrap.row > div.text-center.button > button";

        $(deleteAccountSelectorString)

                .click();

        Thread.sleep(200);



        var okBtnSelector = "#closeSmallModal-ok";

        $(okBtnSelector).click();

    }


}