package pages;

import base.BaseStepMethod;
import utilities.ConfigReader;

import static base.BaseTest.driver;

public class MainPage extends BaseStepMethod {
    public void go_To_Url(String url){
        driver.get(url);
    }


}
