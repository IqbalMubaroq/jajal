/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author iqbal
 */
public class writedocx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Properties properti = new Properties();
        properti.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(properti);
        
        String teks = "iqbal mubaroq"
                + "ilmu komputer";
        
        XWPFDocument dokumen = new XWPFDocument();
        
        String out = "D:\\writerdocx.docx";
        FileOutputStream outdocx = new FileOutputStream(new File(out));
        XWPFParagraph paragraf = dokumen.createParagraph();
        XWPFRun rundocx = paragraf.createRun();
        rundocx.setText(teks);
        
        dokumen.write(outdocx);
        outdocx.close();
        System.out.println("sukses");
        
    }
}
