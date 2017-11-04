
package kata4.main;

import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String filename = new String(".\\src\\kata4\\emailsfile.txt");
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
       
        
        
    }
    
}
    

