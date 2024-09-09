package co.com.banistmo.certification.userinterfaces;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/empresas")
public class BanistmoUrlPage extends PageObject {

    public static final Target BTN_ENTENDIDO = Target.the("Boton Inicial").located(By.xpath("//strong[contains(text(),'Entendido')]"));
    public static final Target BTN_PRODUCTOS_Y_SERVICIOS = Target.the("Productos y servicios").located(By.xpath("//a[contains(text(),'Productos & Servicios')]"));
    public static final Target BTN_DEPOSITOS = Target.the("Depositos").located(By.xpath("//a[contains(text(),'Depósitos')]"));
    public static final Target BTN_CUENTA_AHORRO_COMERCIAL = Target.the("CAC").located(By.xpath("//a[contains(text(),'Cuenta de Ahorro Comercial')]"));
    public static final Target BTN_DOCUMENTOS = Target.the("Boton Documento").located(By.xpath("//a[contains(text(),'Documentos')]"));
    public static final Target BTN_PDF_DOCUMENTOS = Target.the("Documento PDF").located(By.xpath("(//a[@title='Contrato Único de Productos y Servicios Bancarios']//child::img[@alt='Descargar PDF'])[1]"));
}
