import java.io.File; 
import java.io.IOException;
  
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream; 
import org.apache.pdfbox.pdmodel.font.PDType1Font;
  
public class PDFBoxTest {
   public static void main (String args[]) throws IOException {
	   
      PDDocument document = new PDDocument();
      PDPage page = new PDPage();
      PDPageContentStream contentStream = new PDPageContentStream(document, page);
      contentStream.beginText(); 
       
      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
      contentStream.newLineAtOffset(25, 50);
      String text = "This is the sample document and we are adding content to it.";
      contentStream.showText(text);      

      //Ending the content stream
      contentStream.endText();

      System.out.println("Content added");

      //Closing the content stream
      contentStream.close();

      //Saving the document
      document.addPage(page);
      document.save(new File("D:/my_doc.pdf"));

      //Closing the document
      document.close();
   }
}