package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class ProductShortByHighToLaw extends Utils{


    public void priceHighToLaw(){

        // code to perform hovering task
        hoverElement( By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));

        // click on cell phone
        clickElement( By.xpath("/html/body/div[6]/did[2]/ul[1]/li[3]/ul/li[2]/a") );

        //Click on Sort order

        clickElement( By.xpath( "//*[@id=\"products-orderby\"]" ) );

        // click hig to law
        selectTextByValue(By.xpath("//*[@id=\"products-orderby\"]" ),"Price:High To Law");

        //Get text of $ value
        ArrayList<Float>priceList = new ArrayList<>(  );
        ArrayList<Float> sortList = new ArrayList<>(  );

        List<WebElement> activeList = driver.findElements( By.className( "actul-price" ) );
        //List<WebElement> activeList = driver.findElements( By.cssSelector( "span.actul-price" ) );

        for (WebElement element : activeList){
            String str = element.getText();
            str = str.replaceAll( "[^\\d.]" ,"");
            priceList.add(Float.valueOf( str));
            sortList.add(Float.valueOf( str));

        }
System.out.println( priceList);
//sorting in decending /decrising order
        Collections.sort( sortList,Collections.reverseOrder());

//Array .sort (PriceList)
System.out.println( sortList);
System.out.println( priceList.equals( sortList));
}}