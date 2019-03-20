package links;  //Comenta aqui pq esse é o pacote
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class VerifyLinks {
 	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "c:\\Program Files\\geckodriver.exe"); //Poe onde ta seu gecko
		
		//Criando a instancia do Selenium		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://YOUR-SITE.com/"); //site para exemplo
		
		//Passando arrayList
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//Saida, pode alterar e colocar num arquivo ou banco de dados tipo o Mongo.
		System.out.println("Total links are "+links.size());
		
		//Laço de repeticao, aqui acontece a magica, ele chama o metodo ali em baixo.
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}
	
	//Filtrando as conexoes.
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	
	 
 
}
