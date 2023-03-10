import base.BaseTest;
import org.testng.annotations.Test;
import pages.AllPages;
import pages.MainPage;
import utilities.ConfigReader;
/*
Some of the HTTP status codes are :
200 – valid Link
404 – Link Not Found
400 – Bad Request
401 – Unauthorized
500 – Internal error
 */

//1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
// Kullanıcı Hepsiburada.com sitesini ziyaret eder.
// Kullanıcı giriş işlemi yapılır.
// Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
// Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
// Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
// Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
// Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

//2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
// Kullanıcı Hepsiburada.com sitesini ziyaret eder.
//  Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
// Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
// Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

public class TC001 extends BaseTest {
    AllPages allPages=new AllPages();
    @Test
    public void test01() throws InterruptedException {
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        Thread.sleep(2000);
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.userDashboardPage().verifyValidLogin("Sumeyye");
        allPages.userDashboardPage().searchProduct("robot supurge");
    }

    }



