package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {

//  //private By _currencyId = By.xpath(*[contains(@id, "customerCurrency")] );
//          // private By _clothingLink = By.linkText( "Clothing" );
//
//        public  void selectCurrencyDoller() {
//
//           // selectFromVisibleText((  ),"US Dollar");
//        }
//
//    public  void selectCurrencyEuro() {
//
//        selectFromVisibleText( By.id( "customerCurrency" ),"US Euro");
//    }

        public void clickApparel(){
            clickElement( By.linkText("Apparel") );
        }
        public void clickOnClothingLinks(){
            clickElement( By.linkText("Clothing" ));
        }

        public void UserShouldBeAbleToClickRegisterButtonSuccessfully() {

            clickElement( By.xpath( "//a[@class=\"ico-register\"]" ) );
        }





}
