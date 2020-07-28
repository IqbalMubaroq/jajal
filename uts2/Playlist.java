/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author iqbal
 */
public class Playlist {

    JFileChooser fc = new JFileChooser();
//    fc.setFileFilter(new FileTypeFilter(".mp3", "open file mp3"));
       ArrayList ls = new ArrayList();

    void add(JFrame frame) {
        fc.setMultiSelectionEnabled(true);
        int filevalid = fc.showOpenDialog(frame);
        if (filevalid == javax.swing.JFileChooser.CANCEL_OPTION) {
            return;
        } else if (filevalid == javax.swing.JFileChooser.APPROVE_OPTION) {
            File[] file = fc.getSelectedFiles();
            ls.addAll(Arrays.asList(file));

        }

    }
    ArrayList getlistsong(){
    return ls;
    }
    
    }

