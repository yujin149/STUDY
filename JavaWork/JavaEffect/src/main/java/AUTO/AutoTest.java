package AUTO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoTest {
    public static void main(String[] args) throws InterruptedException {
        String url= "https://www.daum.net/";
        //현재 PC에 있는 chromedriver을 가지고 와서 setup
        WebDriverManager.chromedriver().setup();
        //selenium -> setup 이 되었기 때문에 chromedriver 객체를 생성
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // driver를 이용해서 윈도우창 최대로 해줘
        driver.get(url); //그 driver에 url값이 나오게 해줘
        //다음 입력창을 객체 빼줘
        WebElement input = driver.findElement(By.cssSelector("input.tf_keyword"));
        //그 입력창에다 이를 넣어줘
        input.sendKeys("이");
        //0.5초 기다려
        Thread.sleep(500);
        input.sendKeys("병");
        Thread.sleep(500);
        input.sendKeys("헌");
        Thread.sleep(500);
        input.sendKeys(" ");
        Thread.sleep(500);
        input.sendKeys("건");
        Thread.sleep(500);
        input.sendKeys("치");
        Thread.sleep(500);
        //엔터키 입력해
        input.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        //똑같은 이름에 태그가 여러개일 때 findElements를 사용
        //결과 값을 List로 받아야합니다. List가 관리하는 클래스 WebElement
        List<WebElement> thumbs = driver.findElements(By.cssSelector("a.thumb_bf"));
        //위 결과를 받은 List 중에 0번에 click을 실행
        thumbs.get(0).click();



    }
}
