package hospital.utils;

import org.junit.Test;
import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    @Test
    public void testCreateLabel() {

    }

}
