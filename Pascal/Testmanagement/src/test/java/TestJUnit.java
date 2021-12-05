import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestJUnit {
    private Camera aCamera;

    @BeforeEach
    public void setup() {
        aCamera = Camera.Camerainit();
    }

    @Test
    @Order(1)
    public void allElementsinit() {
        // Test ob alle Elemente und Objekte initialisiert wurden.
        assertNotNull(aCamera);
        assertNotNull(aCamera.getChips());
        assertNotNull(aCamera.getSSD());
        assertNotNull(aCamera.getLeds());
        assertNotNull(aCamera.getCores(0));
        assertNotNull(aCamera.getCores(1));
    }

    @Test
    @Order(2)
    public void turnon() {
        // Test ob alle Elemente und Objekte initialisiert wurden.
        assertFalse(aCamera.getIsOn());
        aCamera.on();
        assertTrue(aCamera.getIsOn());
        aCamera.off();
        assertFalse(aCamera.getIsOn());
    }

    @Test
    @Order(3)
    public void getFaceArea(){
        int[] checkkoordinaten = aCamera.getFaceArea(aCamera.getRawFacePicture(1));
        assertEquals(2, checkkoordinaten[0]);
        assertEquals(1, checkkoordinaten[1]);
        assertEquals(11, checkkoordinaten[2]);
        assertEquals(12, checkkoordinaten[3]);
    }

    @Test      // Test schlägt fehl aufgrund der falschen Bilddateien welche kein b enthalten.
    @Order(4)  // Probeweise eine andere laden oder in Camera Zeile 139 - 145 auskommentieren.
    public void extractFace(){
        Picture pBild = aCamera.extractFace(1, aCamera.getRawFacePicture(1), aCamera.getFaceArea(aCamera.getRawFacePicture(1)));
        assertNotNull(pBild.getContent());
        assertEquals(pBild, aCamera.getMemoryStack().pop());
    }

    @Test      // Test schlägt fehl aufgrund der falschen Bilddateien welche kein b enthalten.
    @Order(5)  // Probeweise eine andere laden oder in Camera Zeile 139 - 145 auskommentieren.
    public void extractFacePic(){
        Picture pBild = aCamera.extractFace(1, aCamera.getRawFacePicture(1), aCamera.getFaceArea(aCamera.getRawFacePicture(1)));
        Boolean hasb = false;
        Boolean isvalid = true;

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){

                if (pBild.getContent(i, j) == 'b'){
                    hasb = true;
                }
                if(pBild.getContent(i, j) == ' ' || (pBild.getContent(i, j) != 'a' && pBild.getContent(i, j) != 'b' && pBild.getContent(i, j) != 'c' && pBild.getContent(i, j) != 'd' && pBild.getContent(i, j) != 'e' && pBild.getContent(i, j) != 'f')){
                    isvalid = false;
                }
            }

            if (!hasb || !isvalid){
                assertTrue(false);
            }
            else
            {
                hasb = false;
            }
        }

        assertTrue(true);

    }

}