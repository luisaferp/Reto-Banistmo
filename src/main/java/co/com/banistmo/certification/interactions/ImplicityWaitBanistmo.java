package co.com.banistmo.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ImplicityWaitBanistmo implements Interaction {
    private int seg;

    public ImplicityWaitBanistmo(int seg) {
        this.seg = seg*1000;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(seg);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static ImplicityWaitBanistmo time(int seg){
        return new ImplicityWaitBanistmo(seg);
    }
}
