package hospital.utils;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(59, 25, 25));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }
}
