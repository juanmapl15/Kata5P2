
package kata5P2.view;

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
    
}

