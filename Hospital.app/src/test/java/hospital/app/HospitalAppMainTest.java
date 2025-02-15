package hospital.app;

import hospital.ui.UIComponents;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HospitalAppMainTest {

    @Test
    void testMainMethod() {
        assertDoesNotThrow(() -> HospitalAppMain.main(new String[]{}));
    }

}
