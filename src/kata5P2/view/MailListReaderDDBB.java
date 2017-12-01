
package kata5P2.view;

import kata5P2.model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.io.*;

/**
public class MailListReader {
    public static List<Mail> read(String fileName)throws FileNotFoundException, IOException{
        List<Mail> mailList = new ArrayList<>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(new File(fileName)));
        String mail;
        while((mail=reader.readLine())!= null){
            if(!mail.contains("@"))continue;
            mailList.add(new Mail(mail));
        }
        reader.close();
        return mailList;
    }
}
**/

public class MailListReaderDDBB {
    public static ArrayList<String> readDDBB()throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        ArrayList<String> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:.C:\\Users\\Entrar\\Documents\\NetBeansProjects\\Kata4\\KATA.sDB");
        Statement st =con.createStatement();
        ResultSet rs= st.executeQuery("SELECT mail FROM MAIL");
        
        while (rs.next()){
            String mail = rs.getString("mail");
            if(!mail.contains("@"))continue;
            mailList.add(mail);
        }
        
        rs.close();
        st.close();
        con.close();
        return mailList;
       
    }
      
}