package pages;

import base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.ConfigReader;


//1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
// Kullanıcı Hepsiburada.com sitesini ziyaret eder.
// Kullanıcı giriş işlemi yapılır.
// Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
// Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
// Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
// Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
// Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.
// 2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
// Kullanıcı Hepsiburada.com sitesini ziyaret eder.
//  Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
// Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
// Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.
public class UserDashboardPage extends BaseStepMethod {
    private static final Logger LOGGER= LogManager.getLogger(UserDashboardPage.class);

    private static final By TXTUSERDPAGEUSERNAME =By.xpath("((//a[@title='Hesabım'])//span)[2]");
    private static final By INPUTUSERDPAGESEARCHBOX =By.xpath("(//input[@type='text'])[1]");

    public void verifyValidLogin(String userName){
        //getTextElement(TXTUSERDPAGEUSERNAME);
        ContainsText(TXTUSERDPAGEUSERNAME,userName);
        LOGGER.info("User text is verified. "+userName);
    }

    public void searchProduct(String product){
        setTextElement(INPUTUSERDPAGESEARCHBOX,product+ Keys.ENTER);

    }
}
