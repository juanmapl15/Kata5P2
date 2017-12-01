package kata5P2.main;

import java.io.FileNotFoundException;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReaderDDBB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import kata5P2.model.Histogram;

public class Kata4 {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        Kata4 kata = new Kata4();
        kata.execute();
       

    }

    private ArrayList<String> mailList;
    private Histogram<String> histogram;

    public void execute() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
       
        input();
        process();
        output();

    }

    private void input() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        String filename = new String(".\\src\\kata4\\emailsfile.txt");
       ArrayList<String> mailList = MailListReaderDDBB.readDDBB();
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
