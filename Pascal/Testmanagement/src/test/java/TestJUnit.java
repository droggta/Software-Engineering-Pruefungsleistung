import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestJUnit {
    private Builder builder;
    private Camera camera;

    @BeforeEach
    public void setup() {
        builder = new Builder();
        builder.init();
        camera = builder.getCamera();
    }

    @Test
    @Order(1)
    public void allElementsinit() {
        // Test ob alle Elemente und Objekte initialisiert wurden.
        assertNotNull(camera);
        assertNotNull(camera.getChips());
        assertNotNull(camera.getSSD());
        assertNotNull(camera.getLeds());
    }

    

}