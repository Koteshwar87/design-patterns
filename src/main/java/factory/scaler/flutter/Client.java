package factory.scaler.flutter;

import factory.scaler.flutter.components.button.Button;
import factory.scaler.flutter.components.menu.Menu;
import factory.scaler.flutter.factory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.WINDOWS);
        Menu menu = uiFactory.createMenu();
        menu.viewMenu();
        Button button = uiFactory.createButton();
        button.clickButton();
    }
}
