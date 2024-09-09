package co.com.banistmo.certification.interactions;


import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.IOException;

public class ReadPdf implements Interaction {
    private final String filePath;

    public ReadPdf(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            PdfReader reader = new PdfReader(filePath);
            StringBuilder text = new StringBuilder();
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                text.append(PdfTextExtractor.getTextFromPage(reader, i));
            }
            reader.close();

            String pdfContent = text.toString();
            actor.remember("pdfContent", pdfContent);

            System.out.println("PDF Content: " + pdfContent);

        } catch (IOException e) {
            throw new RuntimeException("Failed to read the PDF file.", e);
        }
    }

    public static ReadPdf from(String filePath) {
        return new ReadPdf(filePath);
    }
}
