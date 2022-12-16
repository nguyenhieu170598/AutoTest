package electric_Test;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;

        import java.io.IOException;
        import java.time.Duration;
        import General.url;
        import okhttp3.HttpUrl;
        import okhttp3.MediaType;
        import okhttp3.OkHttpClient;
        import okhttp3.Request;
        import okhttp3.RequestBody;
        import okhttp3.Response;
public class BaseTest {
    protected WebDriver webDriver;
    private static OkHttpClient client;
    public static final String API_URL = "https://appay-rc.cloudcms.vn";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public void main(String[] args) {
    }
    @BeforeMethod
    public void beforeMethod() {
        client = new OkHttpClient();
        url b = new url();

        System.out.println("----- Before Method -----");
        webDriver = WebDriverManager.getInstance("Chrome").create();
        WebDriverManager.chromedriver().setup();
        webDriver.quit();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        //ImplicitWait - Which applied for all Element
        //SHOUD NOT use both ImplicitWait and ExplicitWait
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://appay-rc.cloudcms.vn/Test_nt/get_only_session_by/0938058692")
                .newBuilder();
        String url = urlBuilder.build().toString();
        Request request = new Request.Builder().url(url).build();
        String result = null;
        try (Response response = client.newCall(request).execute()) {
            result = response.body().string();
            System.out.println("createOrder: " + result);

            webDriver.navigate().to(b.a + "/baokim/payment?serviceType=electric&accessToken="+ result);
        } catch (IOException e) {
            System.out.println("fail: " + e);
        }



    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("----- After Method -----");
        if (webDriver != null) {
            System.out.println("Closing Browser...");
            webDriver.quit();
        }
        Thread.sleep(5000);
    }
}
