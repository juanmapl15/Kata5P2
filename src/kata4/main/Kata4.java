
package kata4.main;

import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;

public class Kata4 {
  
    public static void main(String[] args){
        Kata4 kata = new Kata4();
        
    }
      
    private List<Mail> mailList;
    private Histogram<String> histogram;
    public void execute() throws IOException{
        input();
        process();
        output();
         
    }
     
    private void input() throws IOException {
        String filename = new String(".\\src\\kata4\\emailsfile.txt");
        mailList = MailListReader.read(filename);
    }
 
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
 
    private void output() {
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
    
     
}