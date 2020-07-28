/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import pertemuan4.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author iqbal
 */
public class txtfile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //membaca file
        String filename = "D://input.txt";   //path
        String line = null;

        FileReader pembacafile //filereader adalah class dan filereader selanjutnya adalah obyek
                = new FileReader(filename);

        BufferedReader bufferedreader
                = new BufferedReader(pembacafile);
        int bariske = 0;
        while ((line = bufferedreader.readLine()) != null) {
            System.out.println(line);
            if (bariske==0){
                System.out.println(line);
            }else if(bariske==1){
                System.out.println(line);}
            
        }
        bariske++;
        bufferedreader.close();
    }

}
