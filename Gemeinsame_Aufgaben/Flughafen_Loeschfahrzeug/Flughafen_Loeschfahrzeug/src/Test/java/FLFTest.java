import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FLFTest {      //Test Klasse. Beinhaltet alle Tests

    private FLF flf;

    @Test
    @Order(2)
    public void usageControlPanel(){                //Prüft die Funktion der 6 Switche
        flf = new FLF.Builder()     //Create FLF
                .createeverything()
                .createPowerUnit()
                .createGroundSprayNozzle()
                .createFrontPivot()
                .createBackPivot()
                .createCabine()
                .build();

        Switch sw = flf.getaCabine().getaControlPanel().getaSwitch()[0];


    }

}

