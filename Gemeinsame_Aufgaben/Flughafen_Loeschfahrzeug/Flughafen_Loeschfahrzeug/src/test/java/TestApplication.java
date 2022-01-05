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
    private BlueLight[] aBlueLight;
    private BreakDisc[] aBreakDisc;
    private BreakingLight[] aBreakingLight;
    private BreakPedal aBreakPedal;
    private ControlPanel aControlPanel;
    private DirectionIndicator[] aDirectionIndicator;
    private Display aDisplay;
    private DoorButton[] aDoorButton;
    private Doors[] aDoors;
    private Driver aDriver;
    private ElectricMotor[] aElectricMotor;
    private EnergyDisplay aEnergyDisplay;
    private FoamTank aFoamTank;
    private GasMask aGasMask;
    private GasPedal aGasPedal;
    private HeadLamp[] aHeadLamp;
    private Joystick aJoystick;
    private JoystickFrontCannon aJoystickFrontCannon;
    private JoystickRoofCannon aJoystickRoofCannon;
    private KeyButton[] aKeyButton;
    private KnobFrontCannon aKnobFrontCannon;
    private KnobRoofCannon aKnobRoofCannon;
    private LED aLED;
    private MixingUnit aMixingUnit;
    private Operator aOperator;
    private PieceSegment[] aPieceSegment;
    private Pivot aPivot;
    private PressButton[] aPressButton;
    private Seats[] aSeats;
    private Segment1 aSegment1;
    private Segment2 aSegment2;
    private SpeedDisplay aSpeedDisplay;
    private SterringWheel aSterringWheel;
    private Switch[] aSwitch;
    private Tank aTank;
    private WarningLight[] aWarningLight;
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
        aBlueLight = aBuilder.bBlueLights;
        aBreakDisc = aBuilder.bBreakDisc;
        aBreakingLight = aBuilder.bBreakingLights;
        aBreakPedal = aBuilder.bBreakPedal;
        aControlPanel = aBuilder.bControlPanel;
        aDirectionIndicator = aBuilder.bDirectionIndicators;
        aDisplay = aBuilder.bDisplay;
        aDoorButton = aBuilder.bDoorButton;
        aDoors = aBuilder.bDoors;
        aDriver = aBuilder.bDriver;
        aElectricMotor = aBuilder.bElectricMotor;
        aEnergyDisplay = aBuilder.bEnergyDisplay;
        aFoamTank = aBuilder.bFoamTank;
        aGasMask = aBuilder.bGasMask;
        aGasPedal = aBuilder.bGasPedal;
        aHeadLamp = aBuilder.bHeadLamps;
        aJoystick = aBuilder.bJoystick;
        aJoystickFrontCannon = aBuilder.bJoystickFrontCannon;
        aJoystickRoofCannon = aBuilder.bJoystickRoofCannon;
        aKeyButton = aBuilder.bKeyButton;
        aKnobFrontCannon = aBuilder.bKnobFrontCannon;
        aKnobRoofCannon = aBuilder.bKnobRoofCannon;
        aLED = aBuilder.bLED;
        aMixingUnit = aBuilder.bMixingUnit;
        aOperator = aBuilder.bOperator;
        aPieceSegment = aBuilder.bPieceSegment;
        aPivot = aBuilder.bPivot;
        aPressButton = aBuilder.bPressButton;
        aSeats = aBuilder.bSeats;
        aSegment1 = aBuilder.bSegment1;
        aSegment2 = aBuilder.bSegment2;
        aSpeedDisplay = aBuilder.bSpeedDisplay;
        aSterringWheel = aBuilder.bSterringWheel;
        aSwitch = aBuilder.bSwitch;
        aTank = aBuilder.bTank;
        aWarningLight = aBuilder.bWarningLights;
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
        assertNotNull(aBackPivot);
        assertNotNull(aBattery);
        assertNotNull(aBatteryBox);
        assertNotNull(aBatteryManagement);
        assertNotNull(aBatteryStatus);
        assertNotNull(aBlueLight);
        assertNotNull(aBreakDisc);
        assertNotNull(aBreakingLight);
        assertNotNull(aBreakPedal);
        assertNotNull(aCabine);
        assertNotNull(aCannonModes);
        assertNotNull(aCannonSteps);
        assertNotNull(aCentralUnit);
        assertNotNull(aControlPanel);
        assertNotNull(aDirectionIndicator);
        assertNotNull(aDisplay);
        assertNotNull(aDoorButton);
        assertNotNull(aDoors);
        assertNotNull(aDoorStatus);
        assertNotNull(aDriver);
        assertNotNull(aElectricMotor);
        assertNotNull(aEnergyDisplay);
        assertNotNull(aFLF);
        assertNotNull(aFoamRate);
        assertNotNull(aFoamTank);
        assertNotNull(aFrontCannon);
        assertNotNull(aFrontPivot);
        assertNotNull(aGasMask);
        assertNotNull(aGasPedal);
        assertNotNull(aGroundSprayNoozle);
        assertNotNull(aHeadLamp);
        assertNotNull(aJoystick);
        assertNotNull(aJoystickFrontCannon);
        assertNotNull(aJoystickRoofCannon);
        assertNotNull(aKeyButton);
        assertNotNull(aKnobFrontCannon);
        assertNotNull(aKnobRoofCannon);
        assertNotNull(aLED);
        assertNotNull(aLEDColor);
        assertNotNull(aLights);
        assertNotNull(aLightSize);
        assertNotNull(aLightStatus);
        assertNotNull(aMixingUnit);
        assertNotNull(aOperator);
        assertNotNull(aPieceSegment);
        assertNotNull(aPivot);
        assertNotNull(aPosition);
        assertNotNull(aPowerUnit);
        assertNotNull(aPressButton);
        assertNotNull(aRoofCannon);
        assertNotNull(aSeats);
        assertNotNull(aSegment1);
        assertNotNull(aSegment2);
        assertNotNull(aSpeedDisplay);
        assertNotNull(aSterringWheel);
        assertNotNull(aSwitch);
        assertNotNull(aSwitchStatus);
        assertNotNull(aSwitchType);
        assertNotNull(aTank);
        assertNotNull(aTankSubstance);
        assertNotNull(aWarningLight);
        assertNotNull(aWaterTank);
        assertNotNull(aWheel);

    }

    @Test
    @Order(2)
    public void usageControlPanel(){        //checks if the controlPanel
        Switch[] tempaSwitch = aSwitch;

        //All Functions the driver is allowed to call

        for (int i=0;i < tempaSwitch.length; i++)
        {
          //  assertEquals(tempaSwitch[i].getaSwitchStatus(), aSwitch[i].getaSwitchStatus);     //get Method is required to make this code work
        }
    }

    @Test
    @Order(3)
    public void handleParking(){
        //assertEquals(MotorStatus.off, aElectricMotor[0].getaMotorStatus());       //check if electric motors are turned off
        //assertEquals(MotorStatus.off, aElectricMotor[1].getaMotorStatus());
        for(int i = 0; i < 4; i++){
            assertEquals(null,aSeats[i].getPerson());                       //Check if all seats are free
        }
        //assertEquals(DoorStatus.open, aDoors[0].getaDoorStatus());                //check if doors are open
        //assertEquals(DoorStatus.open, aDoors[1].getaDoorStatus());
        //assertEquals(CannonStatus.retracted, aRoofCannon.getaCannonStatus());       //check roofcannon
        assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus());
        //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
        for(int i=0; i < aHeadLamp.length; i++){
            assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());            //check HeadLights
        }
        for(int i=0; i < aDirectionIndicator.length; i++){
            assertEquals(LightStatus.off, aDirectionIndicator[i].getaLightStatus());            //check DirectionIndicatorlights
        }
        assertEquals(LightStatus.off, aWarningLight[].getaLightStatus());                     //Check if Warninglight is off
        assertEquals(LightStatus.off, aBlueLight[].getaLightStatus());                     //Check if BlueLight is off
        assertEquals(12500, aWaterTank.getVolume());                            //check if watertank is 100% full
        assertEquals(2500, aFoamTank.getVolume());                            //check if foamtank is 100% full
        for(int i=0; i < aBattery.length; i++){
            assertEquals(100000, aBattery[i].getaSoC());                      //Check if Batteries are 100% full (SoC=State of Charge)
        }
        assertEquals(CannonModes.modeA, aKnobFrontCannon.getaCannonModes());
        assertEquals(CannonSteps.fuenfhundert, aKnobRoofCannon.getaCannonSteps());

    }

    @Test
    @Order(4)
    public void handleInspectionDrive(){
    }

    @Test
    @Order(5)
    public void handleEmergencyService(){

    }

    @Test
    @Order(6)
    public void handleFuelTruckOnFire(){

    }

    @Test
    @Order(7)
    public void handlePushbackVehicleOnFire(){
        assertEquals(MotorStatus.on,aElectricMotor[0].getaMotorStatus());      //Check if electric motors are turned on
        assertEquals(MotorStatus.on,aElectricMotor[1].getaMotorStatus());
        assertEquals("Driver", aSeats[0].getPerson());                  //Check if the Driver sits on seat 0
        assertEquals("Operator", aSeats[1].getPerson());                //Check if the Operator sits on seat 1
        assertEquals(LightStatus.on, aWarningLight[].getaLightStatus());          //Check if Warninglight is on
        assertEquals(LightStatus.on, aBlueLight[].getaLightStatus());             //Check if BlueLight is on
        //Tank mit Wasser inital 100% gefüllt
        //Tank mit Schaum inital 100% gefüllt
        //!!!! JOYSTICK VERHALTEN + RICHTIGER VERBRAUCH  !!!!!

    }

    @Test
    @Order(8)
    public void handleAirplaneEngineFire(){
        assertEquals(MotorStatus.on, aElectricMotor[0].getaMotorStatus());       //Check if electric motors are turned on
        assertEquals(MotorStatus.on, aElectricMotor[1].getaMotorStatus());

        assertEquals("Driver", aSeats[0].getPerson());                  //Check if driver sits on seat 0
        assertEquals("Operator", aSeats[1].getPerson());                //Check if operator sits on sear 1
        assertEquals(DoorStatus.closed, aDoors[0].getaDoorStatus());            //Check if both doors are closed
        assertEquals(DoorStatus.closed, aDoors[1].getaDoorStatus());
        assertEquals(CannonStatus.activated, aRoofCannon.getaCannonStatus());   //Check if rootcannon is activated
        //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
        for(int i=0; i < aHeadLamp.length; i++){
            assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());            //check headlights(roof and side)
        }
        assertEquals(LightStatus.on, aWarningLight[].getaLightStatus());              //check if warninglight is on
        assertEquals(LightStatus.on, aBlueLight[].getaLightStatus());                 //check if bluelight is on
        //Tank mit Wasser inital 100% gefüllt
        //Tank mit Schaum inital 100% gefüllt
        //WEITERE SACHEN MÜSSEN HIER ZUM TEST HINZUGEFÜGT WERDEN
    }
}