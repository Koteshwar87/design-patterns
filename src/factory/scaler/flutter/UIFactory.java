package factory.scaler.flutter;

import practice.designpatterns.factory.scaler.flutter.components.button.Button;
import practice.designpatterns.factory.scaler.flutter.components.menu.Menu;

public interface UIFactory {
    Button createButton();

    Menu createMenu();
}
