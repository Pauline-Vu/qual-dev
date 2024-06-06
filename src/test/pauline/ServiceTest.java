package pauline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    @Test
    public void testService() {
        Service s = new Service();
        Voiture v = new Voiture("Volvo",40000);
        s.ajouter(v);

    }

    @Test
    public void testPrix() {
        Service s = new Service();
        Voiture v = new Voiture("Volvo",40000);

    }
}
