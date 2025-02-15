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

        JPanel panel = new JPanel(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createLineBorder(new Color(59, 25, 25), 10));

        JLabel titleLabel = new JLabel("Patient Details", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField contactField = new JTextField();

        formPanel.add(Utils.createLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(Utils.createLabel("Age:"));
        formPanel.add(ageField);
        formPanel.add(Utils.createLabel("Address:"));
        formPanel.add(addressField);
        formPanel.add(Utils.createLabel("Contact:"));
        formPanel.add(contactField);
    }
}
