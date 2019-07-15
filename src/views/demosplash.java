/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import javax.swing.JOptionPane;
/**
 *
 * @author zerefweismann
 */
public class demosplash {
    public static void main(String[] args) {
        splash s = new splash();
        s.setVisible(true);
        login l = new login();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                s.txt_persen.setText(Integer.toString(i)+"%");
                s.bar.setValue(i);
                if (i==100) {
                    s.setVisible(false);
                    l.setVisible(true);
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Splash Screen Error", "Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
