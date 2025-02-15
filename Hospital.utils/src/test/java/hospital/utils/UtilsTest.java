package hospital.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    public void testCreateButton() {
        JButton button = Utils.createButton("Click Me");
        assertNotNull(button);
        assertEquals("Click Me", button.getText());
        assertEquals(new Color(59, 25, 25), button.getBackground());
        assertEquals(Color.WHITE, button.getForeground());
        assertEquals(new Font("Arial", Font.BOLD, 14), button.getFont());
    }


}
