package co.com.banistmo.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyPdf implements Question<Boolean> {
    private final String palabra;

    public VerifyPdf(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String contenidoPdf = actor.recall("pdfContent");
        return contenidoPdf != null && contenidoPdf.contains(palabra);
    }

    public static VerifyPdf file(String palabra) {
        return new VerifyPdf(palabra);
    }
}
