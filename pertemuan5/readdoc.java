/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 *
 * @author iqbal
 */
public class readdoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File filenya = new File("D://input.doc");
        WordExtractor extractor = null;
        try {
            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String fileText = extractor.getText();
            System.out.println(fileText);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static class filenya {

        private static String getAbsolutePath() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String getabsolutefile() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public filenya() {
        }
    }

}
