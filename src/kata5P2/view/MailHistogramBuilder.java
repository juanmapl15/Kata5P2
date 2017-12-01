
package kata5P2.view;

import java.util.ArrayList;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import java.util.List;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram<>();
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        
        return histo;
    }

    public static Histogram<String> build(ArrayList<String> mailList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

