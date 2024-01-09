package factory.scaler.flutter;

public class Flutter {
    void refreshUI(){
        System.out.println("Refresh UI");
    }

    void setTheme(){
        System.out.println("Set Theme");
    }

    /**
     * Below these 2 methods will behave different behavior for different inputs like Android/Windows/IOS
     * So these are called as Factory methods.
     * These should be seperated in to a Factory interface and implement concrete classes. In our case UIFactory
     *
     */
    /**
     * void createButton(){}  --> Can create Android/IOS/Windows buttons
     * void createMenu(){}   --> Can create Android/IOS/Windows menus
     */

}
