package hospital.ui;

import javax.swing.*;
import java.awt.*;

public class Panels {

    public static JPanel createHomePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createLineBorder(new Color(59, 25, 25), 20));


        JLabel label = new JLabel("<html><div style='text-align: center;'>WELCOME TO<br>HOSPITAL MANAGEMENT SYSTEM</div></html>", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 40));

        panel.add(label, BorderLayout.CENTER);
        return panel;
    }

    public static JPanel createPatientPanel() {


        
    }
}
