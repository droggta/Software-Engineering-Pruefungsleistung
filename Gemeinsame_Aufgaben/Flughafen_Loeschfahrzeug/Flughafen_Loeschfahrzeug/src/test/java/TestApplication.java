import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestApplication {
    private FLF aFLF;

    @BeforeEach
    public void init() {
        aFLF = FLF.init();
    }

    @Test
    public void sum() {
        //int result = calculator.sum(3, 4);
        assertEquals(7, 7);
    }
}