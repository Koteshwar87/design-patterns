package factory.scaler.flutter;

import factory.scaler.flutter.factory.AndroidUIFactory;
import factory.scaler.flutter.factory.IOSUIFactory;
import factory.scaler.flutter.factory.UIFactory;
import factory.scaler.flutter.factory.WindowsUIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platforms){
        if (platforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        } else if (platforms.equals(SupportedPlatforms.IOS)) {
            return new IOSUIFactory();
        } else if (platforms.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
