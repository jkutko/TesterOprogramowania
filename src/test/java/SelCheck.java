import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

class SelectCheck {
    // napisz metode ktora przyjmuje string jako parmetr i zwraca typ boolean
// metoda sprawdza czy paramter String jest jedna z opcji w select




public  boolean checkOption (String optionText, WebElement element) {
            Select select = new Select(element);
            List<WebElement> options = select.getOptions();
            for(WebElement option : options) {
               if (option.getText().equals(optionText))
                   return true;
            }
        return false;
        }




    }




