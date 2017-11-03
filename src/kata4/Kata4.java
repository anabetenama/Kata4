/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {
    private List<Mail> mailList;
    private Histogram<String> histogram;    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }

    public void execute() throws IOException{
      input();
      process();
      output();
    }
    
    public void input() throws IOException{
        String filename = new String("C:\\Users\\Entrar\\Documents\\NetBeansProjects\\Kata4\\src\\emails.txt");
        mailList = MailListReader.read(filename);
    }
    
    public void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output(){
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
}