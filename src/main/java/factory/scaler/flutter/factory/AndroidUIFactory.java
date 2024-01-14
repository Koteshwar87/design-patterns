package factory.scaler.flutter.factory;

import factory.scaler.flutter.components.button.AndroidButton;
import factory.scaler.flutter.components.button.Button;
import factory.scaler.flutter.components.menu.AndroidMenu;
import factory.scaler.flutter.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
