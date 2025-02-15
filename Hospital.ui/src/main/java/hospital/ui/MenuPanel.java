package hospital.ui;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {
    public static JPanel createMenuPanel(UIComponents app){

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(59, 25, 25));
        menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(59, 25, 25));

        JMenu menu = new JMenu("MENU");
        menu.setForeground(Color.WHITE);
        menu.setFont(new Font("Arial", Font.BOLD, 16));
    }

}
