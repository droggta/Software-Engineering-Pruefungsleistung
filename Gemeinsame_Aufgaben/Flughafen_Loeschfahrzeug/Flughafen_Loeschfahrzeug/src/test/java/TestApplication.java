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
        //Driver does not use the control panel so nothing happens. Operator is responsible for the control panel
    }

    @Test
    @Order(3)
    public void handleParking(){
        assertEquals(MotorStatus.off, aElectricMotor[0].getaMotorStatus());       //check if electric motors are turned off
        assertEquals(MotorStatus.off, aElectricMotor[1].getaMotorStatus());
        for(int i = 0; i < 4; i++){
            assertEquals(null,aSeats[i].getPerson());                       //Check if all seats are free
        }
        assertEquals(DoorStatus.open, aDoors[0].getaDoorStatus());                //check if doors are open
        assertEquals(DoorStatus.open, aDoors[1].getaDoorStatus());
        assertEquals(90, aRoofCannon.getaSegment1().getAngle());       //check roofcannon
        assertEquals(90, aRoofCannon.getaSegment2().getAngle());
        assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus());
        //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
        for(int i=0; i < aHeadLamp.length; i++){
            assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());            //check HeadLights
        }
        for(int i=0; i < aDirectionIndicator.length; i++){
            assertEquals(LightStatus.off, aDirectionIndicator[i].getaLightStatus());            //check DirectionIndicatorlights
        }
        //assertEquals(LightStatus.off, aWarningLight[].getaLightStatus());                     //Check if Warninglight is off
        //assertEquals(LightStatus.off, aBlueLight[].getaLightStatus());                     //Check if BlueLight is off
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                            //check if watertank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                            //check if foamtank is 100% full
        for(int i=0; i < aBattery.length; i++){
            assertEquals(100000, aBattery[i].getaSoC());                      //Check if Batteries are 100% full (SoC=State of Charge)
        }
        assertEquals(CannonModes.modeA, aKnobFrontCannon.getaCannonStep());             //Check Knob for FrontCannon
        assertEquals(CannonSteps.fuenfhundert, aKnobRoofCannon.getaCannonMode());       //Check Knob for RoofCannon
    }

    @Test
    @Order(4)
    public void handleInspectionDrive(){
        assertEquals(MotorStatus.on, aElectricMotor[0].getaMotorStatus());          //Check if electric motors are on
        assertEquals(MotorStatus.on, aElectricMotor[1].getaMotorStatus());
        for(int i = 0; i < 2; i++){
            assertEquals(null,aSeats[i].getPerson());                       //Check if both front seats are taken
        }
        assertEquals(DoorStatus.closed, aDoors[0].getaDoorStatus());                //check if doors are closed
        assertEquals(DoorStatus.closed, aDoors[1].getaDoorStatus());
        assertEquals(0, aRoofCannon.getaSegment1().getAngle());
        assertEquals(0, aRoofCannon.getaSegment2().getAngle());
        for(int i = 0; i < aRoofCannon.getaSegment2().getaPiecesegment().length; i++){      //check if segments of roof arm are retracted
            assertEquals(0, aRoofCannon.getaSegment2().getaPiecesegment()[i]);
        }
        assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus());
        for(int i = 0+aLights.length; i < aLights.length; i++) {
            assertEquals(LightStatus.off, aLights[i].getaLightStatus());
        }
        for(int i = 0; i < aLights.length-8; i++){
            assertEquals(LightStatus.off, aLights[i].getaLightStatus());
        }
        //Dachscheinwerfer ausgeschalten, Seitenleuchten ausgeschalten, Frontscheinwerfer eingeschalten
        for(int i = 0; i < aWarningLight.length; i++){                                      //Check if warning light is turned on
            assertEquals(LightStatus.on, aWarningLight[i].getaLightStatus());
        }
        for(int i = 0 ; i < aBlueLight.length; i++){                                        //Check if Bluelight is turned off
            assertEquals(LightStatus.off, aBlueLight[i].getaLightStatus());
        }
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                  //Check if water tank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                    //Check if foam tank is 100% full
        assertEquals(CannonSteps.fuenfhundert ,aKnobFrontCannon.getaCannonStep());          //Check if knob for front cannon is set to step one
        assertEquals(CannonModes.modeA, aKnobRoofCannon.getaCannonMode());                  //Check if knob for roof cannon is set to mode one

        for (int i = 0; i < (28/4); i++){                                                   //accelerate the FLF to 28km/h in 4km/h steps
            aDriver.accelerate();
        }
        assertEquals(28, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
        //FLF fährt fünf Interationen mit konstant 28km/h geradeaus
        aDriver.steer(-5);                                                       //change steeringangle to -5% (left)
        //FLF fährt fünf Interationen mit konstant 28km/h nach 5% links
        assertEquals(-5, aFLF.getSteeringAngleFrontPivot());                        //check if the steering angle of the front pivots is -5%


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
        int p = 0;
        int initWaterVolume = aWaterTank.getVolume();
        int initFoamVolume = aFoamTank.getVolume();
        assertEquals(MotorStatus.on,aElectricMotor[0].getaMotorStatus());       //Check if electric motors are turned on
        assertEquals(MotorStatus.on,aElectricMotor[1].getaMotorStatus());
        assertEquals("Driver", aSeats[0].getPerson());                  //Check if the Driver sits on seat 0
        assertEquals("Operator", aSeats[1].getPerson());                //Check if the Operator sits on seat 1
        for (int i = 0; i < aDoors.length; i++){
            assertEquals(DoorStatus.closed, aDoors[i].getaDoorStatus());        //Check if all doors are closed
        }
        for(int i=0; i < aHeadLamp.length; i++){                                //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
            assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());      //check headlights(roof and side)
        }
        for(int i = 0; i < aWarningLight.length; i++) {
            assertEquals(LightStatus.on, aWarningLight[i].getaLightStatus());   //Check if Warninglight is on
        }
        for(int i = 0; i < aBackPivot.length; i++) {
            assertEquals(LightStatus.on, aBlueLight[i].getaLightStatus());      //Check if BlueLight is on
        }
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());      //Check if water tank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());        //Check if foam tank is 100% full
        if(aFrontCannon.getaCannonStatus() != CannonStatus.activated) {         //Check if frontcannon ist activated
            aDriver.useJoystickPressButton(Position.left);                      //if not press button in order to activate
        }
        assertEquals(CannonStatus.activated, aFrontCannon.getaCannonStatus());  //Check if frontcannon is now activated
        assertEquals(90, aFrontCannon.getAngle());                      //Check if angle is turned to 90 degrees
        aOperator.useKnobJoystickFrontCannon(CannonSteps.dreitausendfuenfhundert); //Set volume being emitted to 3500units
        p=0;
        while (aMixingUnit.getaFoamRate() != FoamRate.zehn)      //Check if current FoamRate equals 10% if not 10%...
        {
            aDriver.useJoystickPressButton(Position.right);                     //...repeat pressing the Button unit FoamRate is set to 10%
            if(p>5){
                assertTrue(false);                                      //error: changing the foamRate seems not to work!
            }
        }
        assertEquals(CannonSteps.dreitausendfuenfhundert, aKnobFrontCannon.getaCannonStep());   //Check if volume is successfully set to 3500units
        assertEquals(FoamRate.zehn ,aMixingUnit.getaFoamRate());                //Check if FoamRate is successfully set to 10%
        for(int i=0; i < 3; i++){
            checkEmitConsumptionCannon(3500, 10, aJoystickFrontCannon);      //Emit mixture and check if consumption works according to the set parameters
        }
        behaviorJoystick1();                                                    //Check behavior of the 1.Joystick responsible for controlling the frontcannon
        if(aRoofCannon.getaCannonStatus() != CannonStatus.activated){           //check if roof cannon is activated
            aOperator.useJoystickPressButton(Position.left);                    //if not press button in order to activate the roof cannon
        }
        assertEquals(CannonStatus.activated, aRoofCannon.getaCannonStatus());   //Check if the roof cannon is activated
        assertEquals(90, aRoofCannon.getaSegment1().getAngle());        //Check angle of roof cannon segment1
        assertEquals(90, aRoofCannon.getaSegment2().getAngle());        //Check angle of roof cannon segment2
        aOperator.useKnobJoystickRoofCannon(CannonModes.modeC);                 //set to ModeC (2500units)
        assertEquals(CannonModes.modeC, aKnobRoofCannon.getaCannonMode());      //check if the set units is 2500units (ModeC)
        p=0;
        while(aMixingUnit.getaFoamRate() != FoamRate.fuenf){                    //check if foamrate is 5%
            aOperator.useJoystickPressButton(Position.right);                   //if not press button in order to change foamRate
            if(p>5){
                assertTrue(false);                                      //error: changing the foamRate seems not to work!
            }
        }
        assertEquals(FoamRate.fuenf, aMixingUnit.getaFoamRate());               //check if foamRate is successfully set to 5%
        assertEquals(90, aRoofCannon.getaSegment1().getAngle());        //check if angle of segment1 is 90degreee
        assertEquals(90, aRoofCannon.getaSegment2().getAngle());        //check if angle of segment2 is 90degreee
        for(int i=0; i<5; i++){
                checkEmitConsumptionCannon(2500, 5, aJoystickRoofCannon);   //emit mixture and check consumption
        }
        aOperator.useKnobJoystickFrontCannon(CannonSteps.tausend);              //Set volume being emitted to 1000units
        p=0;
        while (aMixingUnit.getaFoamRate() != FoamRate.drei)                     //Check if current FoamRate equals 3% if not 10%...
        {
            aDriver.useJoystickPressButton(Position.right);                     //...repeat pressing the Button unit FoamRate is set to 10%
            if(p>5){
                assertTrue(false);                                      //error: changing the foamRate seems not to work!
            }
        }
        assertEquals(CannonSteps.tausend, aKnobFrontCannon.getaCannonStep());   //Check if volume is successfully set to 3500units
        assertEquals(FoamRate.drei ,aMixingUnit.getaFoamRate());                //Check if FoamRate is successfully set to 10%
        for(int i=0; i < 3; i++){
            checkEmitConsumptionCannon(1000, 3, aJoystickFrontCannon);      //Emit mixture and check if consumption works according to the set parameters
        }
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
        for(int i = 0; i < aWarningLight.length; i++) {
            assertEquals(LightStatus.on, aWarningLight[i].getaLightStatus());              //check if warninglight is on
        }
        for(int i = 0; i < aBlueLight.length; i++) {
            assertEquals(LightStatus.on, aBlueLight[i].getaLightStatus());                 //check if bluelight is on
        }
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                  //Check if water tank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                    //Check if foam tank is 100% full
        if(aFrontCannon.getaCannonStatus() != CannonStatus.activated){
            aJoystickFrontCannon.pushPressButton(Position.left);                            //if front cannon not activated activate
        }
        aFrontCannon.setFrontCannonAngle(90);                                           //set angle of front cannon to 90
        aKnobFrontCannon.setaCannonStep(CannonSteps.dreitausendfuenfhundert);           //set to 3500units
        int p = 0;
        while(aMixingUnit.getaFoamRate() != FoamRate.zehn){
            aJoystickFrontCannon.pushPressButton(Position.right);                       //as long as foamRate!=10 press right button
            p++;
            if(p>5){
                assertTrue(false);                                              //error: changing the foamRate doesn't work as it should!
            }
        }
        for(int i=0; i<5; i++){
            checkEmitConsumptionCannon(3500, 10, aJoystickFrontCannon);       //check if in each iteration consumption behaves properly
        }
        behaviorJoystick1();
        behaviorJoystick2();
        if(aRoofCannon.getaCannonStatus() != CannonStatus.activated) {                 //check if CannonStatus is active, if not activate RoofCannon
            aJoystickRoofCannon.pushPressButton(Position.left);
        }
        aKnobRoofCannon.setaCannonMode(CannonModes.modeC);                             //set units to 2500units (CannonMode.modeC)
        p=0;
        while(aMixingUnit.getaFoamRate() != FoamRate.zehn){
            aJoystickFrontCannon.pushPressButton(Position.right);                       //as long as foamRate!=10 press right button
            p++;
            if(p>5){
                assertTrue(false);                                              //error: changing the foamRate doesn't work as it should!
            }
        }
        for(int i=0; i<5; i++){
            checkEmitConsumptionCannon(2500, 10, aJoystickRoofCannon);
        }
        aKnobFrontCannon.setaCannonStep(CannonSteps.zweitausendfuenfhundert);           //set to 2500units
        p = 0;
        while(aMixingUnit.getaFoamRate() != FoamRate.zehn){
            aJoystickFrontCannon.pushPressButton(Position.right);                       //as long as foamRate!=10 press right button
            p++;
            if(p>5){
                assertTrue(false);                                              //error: changing the foamRate doesn't work as it should!
            }
        }
        for(int i=0; i<5; i++){
            checkEmitConsumptionCannon(2500, 10, aJoystickFrontCannon);       //check if in each iteration consumption behaves properly
        }
        aKnobRoofCannon.setaCannonMode(CannonModes.modeB);                             //set units to 1000units (CannonMode.modeC)
        p=0;
        while(aMixingUnit.getaFoamRate() != FoamRate.drei){
            aJoystickFrontCannon.pushPressButton(Position.right);                       //as long as foamRate!=3 press right button
            p++;
            if(p>5){
                assertTrue(false);                                              //error: changing the foamRate doesn't work as it should!
            }
        }
        for(int i=0; i<5; i++){
            checkEmitConsumptionCannon(1000, 3, aJoystickRoofCannon);
        }
        //end of test
    }


    private void behaviorJoystick2() {
        if(aRoofCannon.getaCannonStatus() == CannonStatus.activated){          //if current JoystickStatus
            assertEquals(90, aRoofCannon.getaSegment1().getAngle());                //check if the angle of the first segment is 90degreee
            assertEquals(90, aRoofCannon.getaSegment2().getAngle());                //check if second segment is horizontal
            behaviorJoystickFaomRate(aMixingUnit.getaFoamRateAsInt(), aJoystickRoofCannon);     //check if the foamRate is properly changed by the right button of aJoystickRoofCannon
            int tempVolume = aWaterTank.getVolume() + aFoamTank.getVolume();                            //saves the current volume of foam and water
            aJoystickRoofCannon.pushKeyButton();                                                   //emit
            assertEquals(aKnobRoofCannon.getaCannonModeAsInt(), tempVolume - aFoamTank.getVolume() - aWaterTank.getVolume());      //if the volume difference is right after emitting mixture
            aWaterTank.fillVolume((int) (aKnobRoofCannon.getaCannonModeAsInt() * (1 - (aMixingUnit.getaFoamRateAsInt()*0.01))));         //adds the consumed water for the test to the Watertank that the volume euqals the volume before testing
            aFoamTank.fillVolume((int) (aKnobRoofCannon.getaCannonModeAsInt() * (aMixingUnit.getaFoamRateAsInt()*0.01)));                //adds the consumed foam for the test to the FoamTank that the volume euqals the volume before testing
            aJoystickRoofCannon.pushPressButton(Position.left);                                                                          //By pressing button deactivate RoofCannon
            assertEquals(CannonStatus.deactivated, aRoofCannon.getaCannonStatus());                                                      //Now check if CannonStatus is deactivated
            int tempMix = aMixingUnit.getaFoamRateAsInt();                                                                               //save current foamRate
            aJoystickRoofCannon.pushPressButton(Position.right);                                //press right button which is normally used to change the foamRate (because cannon deactivated => foamRate should stay the same!)
            assertEquals(tempMix, aMixingUnit.getaFoamRateAsInt());                             //now check if foamRate is still the same

        }
        else{ //if deactivated
            int tempMix = aMixingUnit.getaFoamRateAsInt();                              //save current foamRate
            aJoystickRoofCannon.pushPressButton(Position.right);                        //press right button which is normally used to change the foamRate (because cannon deactivated => foamRate should stay the same!)
            assertEquals(tempMix, aMixingUnit.getaFoamRateAsInt());                     //now check if foamRate is still the same
            aJoystickRoofCannon.pushPressButton(Position.left);                         //press left button in order to activate RoofCannon
            assertEquals(CannonStatus.activated, aRoofCannon.getaCannonStatus());           //check if cannon status is now activated
            assertEquals(90, aRoofCannon.getaSegment1().getAngle());                //check if the angle of the first segment is 90degreee
            assertEquals(90, aRoofCannon.getaSegment2().getAngle());                //check if second segment is horizontal
            behaviorJoystickFaomRate(aMixingUnit.getaFoamRateAsInt(), aJoystickRoofCannon);     //check if the foamRate is properly changed by the right button of aJoystickRoofCannon
            int tempVolume = aWaterTank.getVolume() + aFoamTank.getVolume();                            //saves the current volume of foam and water
            aJoystickRoofCannon.pushKeyButton();                                                   //emit
            assertEquals(aKnobRoofCannon.getaCannonModeAsInt(), tempVolume - aFoamTank.getVolume() - aWaterTank.getVolume());      //if the volume difference is right after emitting mixture
            aWaterTank.fillVolume((int) (aKnobRoofCannon.getaCannonModeAsInt() * (1 - (aMixingUnit.getaFoamRateAsInt()*0.01))));         //adds the consumed water for the test to the Watertank that the volume euqals the volume before testing
            aFoamTank.fillVolume((int) (aKnobRoofCannon.getaCannonModeAsInt() * (aMixingUnit.getaFoamRateAsInt()*0.01)));                //adds the consumed foam for the test to the FoamTank that the volume euqals the volume before testing
        }
    }


    private void behaviorJoystick1() {
        if(aFrontCannon.getaCannonStatus() == CannonStatus.activated){          //if current JoystickStatus
            aJoystickFrontCannon.pushPressButton(Position.left);
            assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus()); //check if after pressing button is deactivated
            assertEquals(0, aFrontCannon.getAngle());                       //and angle is 0
            int tempMix = aMixingUnit.getaFoamRateAsInt();                          //foam rate
            aJoystickFrontCannon.pushPressButton(Position.right);                     //Press right button (nothing should happen!)
            assertEquals(tempMix, aMixingUnit.getaFoamRateAsInt());                 //check if foamrate is the same => nothing happend as it should
            aJoystickFrontCannon.pushPressButton(Position.left);
            assertEquals(CannonStatus.activated, aFrontCannon.getaCannonStatus()); //check if after pressing button roofcannon is activated
            assertEquals(90, aFrontCannon.getAngle());                      //and angle is 90
            behaviorJoystickFaomRate(aMixingUnit.getaFoamRateAsInt(), aJoystickFrontCannon);  //check if the foamRate is propberly changed by the right button of aJoystickFrontCannon
            int tempVolume = aWaterTank.getVolume() + aFoamTank.getVolume();
            aJoystickFrontCannon.pushKeyButton();       //emit
            assertEquals(aKnobFrontCannon.getaCannonStepAsInt(), tempVolume - aFoamTank.getVolume() - aWaterTank.getVolume());      //if the volume difference is right after emitting mixture
            aWaterTank.fillVolume((int) (aKnobFrontCannon.getaCannonStepAsInt() * (1 - (aMixingUnit.getaFoamRateAsInt()*0.01))));
            aFoamTank.fillVolume((int) (aKnobFrontCannon.getaCannonStepAsInt() * (aMixingUnit.getaFoamRateAsInt()*0.01)));

        }
        else{ //if deactivated
            aJoystickFrontCannon.pushPressButton(Position.left);
            assertEquals(CannonStatus.activated, aFrontCannon.getaCannonStatus()); //check if after pressing button is activated
            assertEquals(90, aFrontCannon.getAngle());
            behaviorJoystickFaomRate(aMixingUnit.getaFoamRateAsInt(), aJoystickFrontCannon);
            int tempVolume = aWaterTank.getVolume() + aFoamTank.getVolume();
            aJoystickFrontCannon.pushKeyButton();       //emit
            assertEquals(aKnobFrontCannon.getaCannonStepAsInt(), tempVolume - aFoamTank.getVolume() - aWaterTank.getVolume());      //if the volume difference is right after emitting mixture
            aWaterTank.fillVolume((int) (aKnobFrontCannon.getaCannonStepAsInt() * (1 - (aMixingUnit.getaFoamRateAsInt()*0.01))));
            aFoamTank.fillVolume((int) (aKnobFrontCannon.getaCannonStepAsInt() * (aMixingUnit.getaFoamRateAsInt()*0.01)));
            aJoystickFrontCannon.pushPressButton(Position.left);
            assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus()); //check if after pressing button is deactivated
            assertEquals(0, aFrontCannon.getAngle());
            int tempMix = aMixingUnit.getaFoamRateAsInt();
            aJoystickFrontCannon.pushPressButton(Position.right);
            assertEquals(tempMix, aMixingUnit.getaFoamRateAsInt());     //check if foam rate stays the same (it should!)
            int tempWVolume = aWaterTank.getVolume();
            int tempFVolume = aFoamTank.getVolume();
            aJoystickFrontCannon.pushKeyButton();
            assertEquals(tempFVolume, aFoamTank.getVolume());
            assertEquals(tempWVolume, aWaterTank.getVolume());

        }

    }

    /**
     * Check if through the right click of the button the foam rate is properly changed
     * @param tempMix current foamrate
     */
    private void behaviorJoystickFaomRate(int tempMix, Joystick joystick) {
        switch (tempMix){
            case 0:
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                break;
            case 3:
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                break;
            case 5:
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                break;
            case 10:
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                break;
        }

    }

    /**
     * IMPORTANT: units and foamRate are not configured with this function. Parameters are only used for checking. Before calling this method make sure your desired unit and FoamRate are properly set through the corresponding functions
     * @param units the volume of units
     * @param fRate the current configured foamRate
     * @param jStick the joystick in order to know which keybutton should be pushed
     */
    private void checkEmitConsumptionCannon(int units, int fRate, Joystick jStick){

        int initFoamVolume = aFoamTank.getVolume();     //initial values which are later used for comparison
        int initWaterVolume = aWaterTank.getVolume();

        int diffFoamVolume = (int) (units * (fRate * 0.01));
        int diffWaterVolume = (int) (units * (1 - (fRate * 0.01)));

        jStick.pushKeyButton();                   //emit mixture with the set parameters

        assertEquals(initFoamVolume-diffFoamVolume, aFoamTank.getVolume());         //check if the new fill level equals the expected one
        assertEquals(initWaterVolume-diffWaterVolume, aWaterTank.getVolume());      //check if the new fill level equals the expected one
    }

}