package vn.edu.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InfoHomeTest {

    @Test
    public void testTitleContent() {
        // Tải về và cấu hình(phiên bản)
        WebDriverManager.edgedriver().setup();

        // Mở trình duyệt (Chrome, firefox, edge, ...)
        WebDriver driver = new EdgeDriver();

        // Mở trình duyệt toàn màn hình
        driver.manage().window().maximize();

        // Vào trang web https://ap.poly.edu.vn/
        String url = "https://ap.poly.edu.vn/";
        driver.get(url);

        String title = driver.getTitle();
        String titleExpected = "Trường Cao đẳng FPT Polytechnic1";
        if (title.equals(titleExpected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.close();
    }

}
