package test.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelsTest {

    @BeforeEach
    public void setUp(){
//        loginPage = open(baseUrl, LoginPage.class);
    }
    @AfterEach
    public void clean() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }

    @Test
    public void exampleTest(){

    }

}
