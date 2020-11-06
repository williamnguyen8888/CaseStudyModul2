package CaseStudy;

import CaseStudy.guiMenu;
import static CaseStudy.HotelManage.customerList;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        ProgressBar ProgressBar = new ProgressBar();
        ProgressBar.setResizable(false);
        ProgressBar.setVisible(true);
        
        try {
            for (int x = 0; x <= 100; x++) {
                Thread.sleep(120);
                
                ProgressBar.lbllord.setText(Integer.toString(x) + "%");
                ProgressBar.lordbar.setValue(x);
                
            }
            
            LoginForm LoginForm = new LoginForm();
            ProgressBar.dispose();
            LoginForm.setResizable(false);
            LoginForm.setVisible(true);
        } catch (Exception e) {
        }
    }
}
