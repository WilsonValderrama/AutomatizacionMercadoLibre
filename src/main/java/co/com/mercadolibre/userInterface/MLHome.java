package co.com.mercadolibre.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class MLHome {

    public static final Target IMG_LOGO = Target.the("Image logo")
            .locatedBy("//a[@class='nav-logo']");

    public static final Target IMB_IMAGE_PRODUCT = Target.the("Image product")
            .locatedBy("//div[@class= 'slick-slide slick-active']");

    public static final Target LBL_CHECK = Target.the("Label check")
            .locatedBy("//p[@class='ui-item__title']");

    public static final Target IMG_PRODUCT_TEXT = Target.the("Image product extract text")
            .locatedBy("//div[@class= 'slick-slide slick-active']");

}
