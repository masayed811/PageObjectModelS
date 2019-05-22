package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyChange extends Utils {

    public void priceCurrency(){
        //hovering task on apparel
        hoverElement( By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));

        // click on clothing
        clickElement( By.xpath("/html/body/div[6]/did[2]/ul[1]/li[3]/ul/li[2]/a") );

        //click on currecncy
        clickElement( By.xpath("//*[@id=\"customerCurency\"]") );

        // click on Euro

        selectTextByValue(By.xpath("//*[@id=\"customerCurency\"]"),"Euro");

        //Click on Sort Currency

        clickElement( By.xpath( "//*[@id=\"customerCurency\"]" ) );

        // click on USD

        selectTextByValue(By.xpath("//*[@id=\"customerCurency\"]"),"US Dillar");

        //Check for $ value
        // Get text of $ value

        boolean present = false;
        List<WebElement> activeList = driver.findElements( By.className( "actul-price" ) );
        //List<WebElement> activeList = driver.findElements( By.cssSelector( "span.actul-price" ) );
for (WebElement element : activeList){
    String str = element.getText();
    for(int i = 0; i<str.length() ; i++){
        char ch = str .charAt( i );
        if (ch == '$'){
            present = true;
//index=i
        }
    }
if (present ==true){
    System.out.println( ("$"+"is present in the array list") );
    // break

}
else{
    System.out.println( "The $ is not present at the array list" );
}
}


    }

}
