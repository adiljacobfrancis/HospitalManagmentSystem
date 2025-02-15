package hospital.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class DataStorageTest {

    @Test
    void testAddAndGetPatients() {
        DataStorage.addPatient("John Doe", "30", "123 Main St", "555-1234");
        assertTrue(DataStorage.getPatients().get(0).contains("John Doe"));
    }

    @Test
    void testAddAndGetDoctors() {
        DataStorage.addDoctor("Dr. Smith", "Cardiology", "10", "555-5678");
        assertTrue(DataStorage.getDoctors().get(0).contains("Dr. Smith"));

    }

    @Test
    void testAddAndGetAppointments() {



    }
}
