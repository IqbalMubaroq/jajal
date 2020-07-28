/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into identitas values('" + nim + "','" + nama + "','" + alamat + "','"+ jk + "')";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
