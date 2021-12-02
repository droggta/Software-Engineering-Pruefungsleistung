import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestApplication {
    private FLF aFLF;
    private FLF.Builder aBuilder;

    // Klassen mit Verbindung zum FLF
    private PowerUnit aPowerUnit;
    private GroundSprayNozzle[] aGroundSprayNoozle;
    private FrontCannon aFrontCannon;
    private RoofCannon aRoofCannon;
    private Lights[] aLights;
    private CentralUnit aCentralUnit;
    private FrontPivot[] aFrontPivot;
    private BackPivot[] aBackPivot;
    private Cabine aCabine;
    // Alle Klassen
    private Battery[] aBattery;
    private BatteryBox aBatteryBox;
    private BlueLight aBlueLight;
    private BreakDisc[] aBreakDisc;
    private BreakingLight aBreakingLight;
    private BreakPedal aBreakPedal;
    private ControlPanel aControlPanel;
    private DirectionIndicator aDirectionIndicator;
    private Display aDisplay;
    private DoorButton[] aDoorButton;
    private Doors[] aDoors;
    private Driver aDriver;
    private ElectricMotor[] aElectricMotor;
    private EnergyDisplay aEnergyDisplay;
    private FoamTank aFoamTank;
    private GasMask aGasMask;
    private GasPedal aGasPedal;
    private HeadLamp aHeadLamp;
    private Joystick aJoystick;
    private JoystickFrontCannon aJoystickFrontCannon;
    private JoystickRoofCannon aJoystickRoofCannon;
    private KeyButton aKeyButton;
    private KnobFrontCannon aKnobFrontCannon;
    private KnobRoofCannon aKnobRoofCannon;
    private LED aLED;
    private LeftPressButton aLeftPressButton;
    private MixingUnit aMixingUnit;
    private Operator aOperator;
    private PieceSegment[] aPieceSegment;
    private Pivot aPivot;
    private PressButton aPressButton;
    private RightPressButton aRightPressButton;
    private Seats[] aSeats;
    private Segment1 aSegment1;
    private Segment2 aSegment2;
    private SpeedDisplay aSpeedDisplay;
    private SterringWheel aSterringWheel;
    private Switch[] aSwitch;
    private Tank aTank;
    private WarningLight aWarningLight;
    private WaterTank aWaterTank;
    private Wheel[] aWheel;
    //Enumerations
    private BatteryManagement aBatteryManagement;
    private BatteryStatus aBatteryStatus;
    private CannonModes aCannonModes;
    private CannonSteps aCannonSteps;
    private DoorStatus aDoorStatus;
    private FoamRate aFoamRate;
    private LEDColor aLEDColor;
    private LightSize aLightSize;
    private LightStatus aLightStatus;
    private Position aPosition;
    private SwitchStatus aSwitchStatus;
    private SwitchType aSwitchType;
    private TankSubstance aTankSubstance;

    @BeforeEach
    public void init() {
        aFLF = FLF.init();
        aBuilder = aFLF.getaBuilder();
        aFLF.setaBuilder(null);
        aPowerUnit = aBuilder.bPowerUnit;
        aGroundSprayNoozle = aBuilder.bGroundSprayNoozle;
        aFrontCannon = aBuilder.bFrontCannon;
        aRoofCannon = aBuilder.bRoofCannon;
        aLights = aBuilder.bLights;
        aCentralUnit = aBuilder.bCentralUnit;
        aFrontPivot = aBuilder.bFrontPivot;
        aBackPivot = aBuilder.bBackPivot;
        aCabine = aBuilder.bCabine;
        // Alle Klassen
        aBattery = aBuilder.bBattery;
        aBatteryBox = aBuilder.bBatteryBox;
        aBlueLight = aBuilder.bBlueLight;
        aBreakDisc = aBuilder.bBreakDisc;
        aBreakingLight = aBuilder.bBreakingLight;
        aBreakPedal = aBuilder.bBreakPedal;
        aControlPanel = aBuilder.bControlPanel;
        aDirectionIndicator = aBuilder.bDirectionIndicator;
        aDisplay = aBuilder.bDisplay;
        aDoorButton = aBuilder.bDoorButton;
        aDoors = aBuilder.bDoors;
        aDriver = aBuilder.bDriver;
        aElectricMotor = aBuilder.bElectricMotor;
        aEnergyDisplay = aBuilder.bEnergyDisplay;
        aFoamTank = aBuilder.bFoamTank;
        aGasMask = aBuilder.bGasMask;
        aGasPedal = aBuilder.bGasPedal;
        aHeadLamp = aBuilder.bHeadLamp;
        aJoystick = aBuilder.bJoystick;
        aJoystickFrontCannon = aBuilder.bJoystickFrontCannon;
        aJoystickRoofCannon = aBuilder.bJoystickRoofCannon;
        aKeyButton = aBuilder.bKeyButton;
        aKnobFrontCannon = aBuilder.bKnobFrontCannon;
        aKnobRoofCannon = aBuilder.bKnobRoofCannon;
        aLED = aBuilder.bLED;
        aLeftPressButton = aBuilder.bLeftPressButton;
        aMixingUnit = aBuilder.bMixingUnit;
        aOperator = aBuilder.bOperator;
        aPieceSegment = aBuilder.bPieceSegment;
        aPivot = aBuilder.bPivot;
        aPressButton = aBuilder.bPressButton;
        aRightPressButton = aBuilder.bRightPressButton;
        aSeats = aBuilder.bSeats;
        aSegment1 = aBuilder.bSegment1;
        aSegment2 = aBuilder.bSegment2;
        aSpeedDisplay = aBuilder.bSpeedDisplay;
        aSterringWheel = aBuilder.bSterringWheel;
        aSwitch = aBuilder.bSwitch;
        aTank = aBuilder.bTank;
        aWarningLight = aBuilder.bWarningLight;
        aWaterTank = aBuilder.bWaterTank;
        aWheel = aBuilder.bWheel;
        //Enumerations
        aBatteryManagement = aBuilder.bBatteryManagement;
        aBatteryStatus = aBuilder.bBatteryStatus;
        aCannonModes = aBuilder.bCannonModes;
        aCannonSteps = aBuilder.bCannonSteps;
        aDoorStatus = aBuilder.bDoorStatus;
        aFoamRate = aBuilder.bFoamRate;
        aLEDColor = aBuilder.bLEDColor;
        aLightSize = aBuilder.bLightSize;
        aLightStatus = aBuilder.bLightStatus;
        aPosition = aBuilder.bPosition;
        aSwitchStatus = aBuilder.bSwitchStatus;
        aSwitchType = aBuilder.bSwitchType;
        aTankSubstance = aBuilder.bTankSubstance;
    }

    @Test
    @Order(1)
    public void sum() {
        //int result = calculator.sum(3, 4);
        assertEquals(7, 7);
    }
}