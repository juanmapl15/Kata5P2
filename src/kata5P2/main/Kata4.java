package kata5P2.main;

import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;
import java.io.IOException;
import java.util.List;
import kata5P2.model.Histogram;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        Kata4 kata = new Kata4();
        kata.execute();
       

    }

    private List<Mail> mailList;
    private Histogram<String> histogram;

    public void execute() throws IOException {
       
        input();
        process();
        output();

    }

    private void input() throws IOException {
        String filename = new String(".\\src\\kata4\\emailsfile.txt");
        mailList = MailListReader.read(filename);
        System.out.println("mailList");
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }

}
