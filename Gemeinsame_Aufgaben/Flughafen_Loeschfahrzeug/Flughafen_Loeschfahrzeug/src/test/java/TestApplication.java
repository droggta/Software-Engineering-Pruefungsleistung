import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestApplication {
    private FLF aFLF;

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
    private DoorButton[] aDoorButton;
    private Doors[] aDoors;
    private Driver aDriver;
    private Display aDisplay;
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
    //Komplexaufgaben
    private ReceiverModule[] aReceivverModule;

    @BeforeEach
    public void init() {
        aFLF = FLF.init(false);
        FLF.Builder aBuilder = aFLF.getaBuilder();
        aFLF.setaBuilder(null);
        aPowerUnit = aBuilder.bPowerUnit;
        aGroundSprayNoozle = aBuilder.bGroundSprayNoozle;
        aFrontCannon = aBuilder.bFrontCannon;
        aRoofCannon = aBuilder.bRoofCannon;
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
        //Komplexaufgaben
        aReceivverModule = aBuilder.bReceiverModule;
    }

    @Test
    @Order(1)
    @DisplayName("buildComplete")
    public void sum() {
        assertNotNull(aBackPivot);
        assertNotNull(aBattery);
        assertNotNull(aBatteryBox);
        assertNotNull(aBlueLight);
        assertNotNull(aBreakDisc);
        assertNotNull(aBreakingLight);
        assertNotNull(aBreakPedal);
        assertNotNull(aCabine);
        assertNotNull(aCentralUnit);
        assertNotNull(aControlPanel);
        assertNotNull(aDirectionIndicator);
        assertNotNull(aDoorButton);
        assertNotNull(aDoors);
        assertNotNull(aDriver);
        assertNotNull(aElectricMotor);
        assertNotNull(aEnergyDisplay);
        assertNotNull(aFLF);
        assertNotNull(aFoamTank);
        assertNotNull(aFrontCannon);
        assertNotNull(aFrontPivot);
        assertNotNull(aGasMask);
        assertNotNull(aGasPedal);
        assertNotNull(aGroundSprayNoozle);
        assertNotNull(aHeadLamp);
        assertNotNull(aJoystickFrontCannon);
        assertNotNull(aJoystickRoofCannon);
        assertNotNull(aKeyButton);
        assertNotNull(aKnobFrontCannon);
        assertNotNull(aKnobRoofCannon);
        assertNotNull(aLED);
        assertNotNull(aMixingUnit);
        assertNotNull(aOperator);
        assertNotNull(aPieceSegment);
        assertNotNull(aPowerUnit);
        assertNotNull(aPressButton);
        assertNotNull(aRoofCannon);
        assertNotNull(aSeats);
        assertNotNull(aSegment1);
        assertNotNull(aSegment2);
        assertNotNull(aSpeedDisplay);
        assertNotNull(aSterringWheel);
        assertNotNull(aSwitch);
        assertNotNull(aWarningLight);
        assertNotNull(aWaterTank);
        assertNotNull(aWheel);

    }

    @Test
    @Order(2)
    @DisplayName("usageControlPanel")
    public void usageControlPanel(){        //checks if the controlPanel
        //Driver does not use the control panel so nothing happens. Operator is responsible for the control panel. Although behaviour of controlPanel is tested
        if(aElectricMotor[0].getaMotorStatus() == MotorStatus.off){
            aControlPanel.useSwitch(SwitchType.electricEngines, SwitchStatus.on);           //if motors are off turn them on by using the switch
            for (ElectricMotor electricMotor : aElectricMotor) {
                assertEquals(MotorStatus.on, electricMotor.getaMotorStatus());
            }
        }
        else{
            aControlPanel.useSwitch(SwitchType.electricEngines, SwitchStatus.off);
            for (ElectricMotor electricMotor : aElectricMotor) {
                assertEquals(MotorStatus.off, electricMotor.getaMotorStatus());
            }
        }
        if(aWarningLight[0].getaLightStatus() == LightStatus.off){
            aControlPanel.useSwitch(SwitchType.warningLight, SwitchStatus.on);              //if warninglights are off turn them on by using the switch
            for (WarningLight warningLight : aWarningLight) {
                assertEquals(LightStatus.on, warningLight.getaLightStatus());
            }
        }
        else{
            aControlPanel.useSwitch(SwitchType.warningLight, SwitchStatus.off);
            for (WarningLight warningLight : aWarningLight) {
                assertEquals(LightStatus.off, warningLight.getaLightStatus());
            }
        }
        if(aBlueLight[0].getaLightStatus() == LightStatus.off){
            aControlPanel.useSwitch(SwitchType.blueLight, SwitchStatus.on);              //if bluelights are off turn them on by using the switch
            for (BlueLight blueLight : aBlueLight) {
                assertEquals(LightStatus.on, blueLight.getaLightStatus());
            }
        }
        else{
            aControlPanel.useSwitch(SwitchType.blueLight, SwitchStatus.off);
            for (BlueLight blueLight : aBlueLight) {
                assertEquals(LightStatus.off, blueLight.getaLightStatus());
            }
        }
        if(aHeadLamp[0].getaLightStatus() == LightStatus.off){
            aControlPanel.useSwitch(SwitchType.headLamp, SwitchStatus.on);              //if frontlights are off turn them on by using the switch
            for(int i = 0; i < 2; i++){
                assertEquals(LightStatus.on, aHeadLamp[i].getaLightStatus());
            }
        }
        else{
            aControlPanel.useSwitch(SwitchType.headLamp, SwitchStatus.off);
            for(int i = 0; i < 2; i++){
                assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());
            }
        }
        if(aHeadLamp[2].getaLightStatus() == LightStatus.off){
            aControlPanel.useSwitch(SwitchType.roofMountedLight, SwitchStatus.on);              //if rooflights are off turn them on by using the switch
            for(int i = 2; i < 4; i++){
                assertEquals(LightStatus.on, aHeadLamp[i].getaLightStatus());
            }
        }
        else{
            aControlPanel.useSwitch(SwitchType.roofMountedLight, SwitchStatus.off);
            for(int i = 2; i < 4; i++){
                assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());
            }
        }
        if(aHeadLamp[4].getaLightStatus() == LightStatus.off){
            aControlPanel.useSwitch(SwitchType.sideLamp, SwitchStatus.on);              //if sidelamps are off turn them on by using the switch
            for(int i = 4; i < 10; i++){
                assertEquals(LightStatus.on, aHeadLamp[i].getaLightStatus());
            }
        }
        else{
            aControlPanel.useSwitch(SwitchType.sideLamp, SwitchStatus.off);
            for(int i = 4; i < 10; i++){
                assertEquals(LightStatus.off, aHeadLamp[i].getaLightStatus());
            }
        }
    }

    @Test
    @Order(3)
    @DisplayName("handleParking - s01")
    public void handleParking(){
        assertEquals(MotorStatus.off, aElectricMotor[0].getaMotorStatus());       //check if electric motors are turned off
        assertEquals(MotorStatus.off, aElectricMotor[1].getaMotorStatus());
        for(int i = 0; i < 4; i++){
            assertNull(aSeats[i].getPerson());                       //Check if all seats are free
        }
        for (Doors aDoor : aDoors) {
            if (aDoor.getaDoorStatus() == DoorStatus.closed) {
                aDoor.changeDoorstatus();
            }
        }
        assertEquals(DoorStatus.open, aDoors[0].getaDoorStatus());                //check if doors are open
        assertEquals(DoorStatus.open, aDoors[1].getaDoorStatus());
        aRoofCannon.getaSegment1().changeSegmentAngle(90);
        assertEquals(90, aRoofCannon.getaSegment1().getAngle());       //check roofcannon
        aRoofCannon.getaSegment2().changeSegmentAngle(90);
        assertEquals(90, aRoofCannon.getaSegment2().getAngle());
        assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus());
        //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
        for (HeadLamp headLamp : aHeadLamp) {
            assertEquals(LightStatus.off, headLamp.getaLightStatus());            //check HeadLights
        }
        for (DirectionIndicator directionIndicator : aDirectionIndicator) {
            assertEquals(LightStatus.off, directionIndicator.getaLightStatus());            //check DirectionIndicatorlights
        }
        //assertEquals(LightStatus.off, aWarningLight[].getaLightStatus());                     //Check if Warninglight is off
        //assertEquals(LightStatus.off, aBlueLight[].getaLightStatus());                     //Check if BlueLight is off
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                            //check if watertank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                            //check if foamtank is 100% full
        for (Battery battery : aBattery) {
            assertEquals(100000, battery.getaSoC());                      //Check if Batteries are 100% full (SoC=State of Charge)
        }
        assertEquals(CannonSteps.fuenfhundert, aKnobFrontCannon.getaCannonStep());             //Check Knob for FrontCannon
        assertEquals(CannonModes.modeA, aKnobRoofCannon.getaCannonMode());       //Check Knob for RoofCannon
    }

    @Test
    @Order(4)
    @DisplayName("handleInspektionDrive - s02")
    public void handleInspectionDrive(){
        for(int i = 0; i < 2; i++){
            aElectricMotor[i].setaMotorStatus(MotorStatus.on);
            assertEquals(MotorStatus.on, aElectricMotor[i].getaMotorStatus());   //Check if electric motors are on
        }
        aSeats[0].setaPerson(aDriver);
        aSeats[1].setaPerson(aOperator);
        for(int i = 0; i < 2; i++){
            assertNotNull(aSeats[i].getPerson());                            //Check if both front seats are taken
        }
        assertEquals(DoorStatus.closed, aDoors[0].getaDoorStatus());                //check if doors are closed
        assertEquals(DoorStatus.closed, aDoors[1].getaDoorStatus());
        aRoofCannon.getaSegment1().changeSegmentAngle(90);
        assertEquals(90, aRoofCannon.getaSegment1().getAngle());       //check roofcannon
        aRoofCannon.getaSegment2().changeSegmentAngle(90);
        assertEquals(90, aRoofCannon.getaSegment2().getAngle());
        assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus());
        // TODO: Was sind die Seitenlampen?
        // Dachscheinwerfer
        for (HeadLamp lamp : aHeadLamp) {
            if (lamp.getaPosition() == Position.frontRoof) {
                lamp.setaLightStatus(LightStatus.off);
                assertEquals(LightStatus.off, lamp.getaLightStatus());
            }
        }
        //Seitenlampen sind hier Fahrtrichtungsanzeiger & Bremslicht
        for (BreakingLight breakingLight : aBreakingLight) {
            breakingLight.setaLightStatus(LightStatus.off);
            assertEquals(LightStatus.off, breakingLight.getaLightStatus());
        }
        for (DirectionIndicator directionIndicator : aDirectionIndicator) {
            directionIndicator.setaLightStatus(LightStatus.off);
            assertEquals(LightStatus.off, directionIndicator.getaLightStatus());
        }
        // Frontscheinwerfer
        for (HeadLamp headLamp : aHeadLamp) {
            if (headLamp.getaPosition() != Position.frontRoof) {
                headLamp.setaLightStatus(LightStatus.on);
                assertEquals(LightStatus.on, headLamp.getaLightStatus());
            }
        }
        // Warnlicht
        for (WarningLight warningLight : aWarningLight) {                                      //Check if warning light is turned on
            warningLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, warningLight.getaLightStatus());
        }
        // Blaulicht
        for (BlueLight blueLight : aBlueLight) {                                        //Check if Bluelight is turned off
            blueLight.setaLightStatus(LightStatus.off);
            assertEquals(LightStatus.off, blueLight.getaLightStatus());
        }
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                  //Check if water tank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                    //Check if foam tank is 100% full
        assertEquals(CannonSteps.fuenfhundert ,aKnobFrontCannon.getaCannonStep());          //Check if knob for front cannon is set to step one
        assertEquals(CannonModes.modeA, aKnobRoofCannon.getaCannonMode());                  //Check if knob for roof cannon is set to mode one

        int startEnergieVolume = aBatteryBox.getallSoC();           //Energylevel before driving
        int consumedEnergy = 0;

        for (int i = 1; i <= 7; i++){                                                   //accelerate the FLF to 28km/h in 4km/h steps
            aDriver.accelerate();
            consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(i*4, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
            assertEquals(startEnergieVolume-consumedEnergy, aBatteryBox.getallSoC());
        }
        assertEquals(startEnergieVolume-consumedEnergy, aBatteryBox.getallSoC());
        //FLF fährt fünf Interationen mit konstant 28km/h geradeaus
        for (int i = 0; i < 5; i++){
           // consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(28, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
        }

        //FLF fährt fünf Interationen mit konstant 28km/h nach 5% links
        aDriver.steer(-5);                                            //change steeringangle to -5% (left)
        for (int i = 0; i < 3; i++){
           // consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(28, aFLF.getaVelocity());                                    //check if the velocity is actually 28km/h
            assertEquals(-5, aFLF.getSteeringAngleFrontPivot());                        //check if the steering angle of the front pivots is -5%
        }

        //FLF fährt fünf Interationen mit konstant 28km/h geradeaus
        aDriver.steer(5);
        for (int i = 0; i < 5; i++){
           // consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(28, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
            assertEquals(0, aFLF.getSteeringAngleFrontPivot());
        }

        //FLF fährt fünf Interationen mit konstant 28km/h nach 5% rechts
        aDriver.steer(5);                                            //change steeringangle to -5% (left)
        for (int i = 0; i < 3; i++){
           // consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(28, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
            assertEquals(5, aFLF.getSteeringAngleFrontPivot());                        //check if the steering angle of the front pivots is -5%
        }
        aDriver.steer(-5);

        //FLF bremst in sieben Iterationen
        aDriver.steer(5);
        for (int i = 1; i <= 7; i++){
            aDriver.slowDown();
            consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(28-(i*4), aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
        }
        assertEquals(startEnergieVolume-consumedEnergy, aBatteryBox.getallSoC());
    }

    @Test
    @Order(5)
    @DisplayName("handleEmergencyService - s03")
    public void handleEmergencyService(){
        for(int i = 0; i < 2; i++){
            aElectricMotor[i].setaMotorStatus(MotorStatus.on);
            assertEquals(MotorStatus.on, aElectricMotor[i].getaMotorStatus());   //Check if electric motors are on
        }
        assertEquals(DoorStatus.closed, aDoors[0].getaDoorStatus());                //check if doors are closed
        assertEquals(DoorStatus.closed, aDoors[1].getaDoorStatus());

        assertEquals(0, aRoofCannon.getaSegment1().getAngle());
        assertEquals(0, aRoofCannon.getaSegment2().getAngle());
        assertEquals(CannonStatus.deactivated, aFrontCannon.getaCannonStatus());
        // TODO: Was sind die Seitenlampen?
        // Dachscheinwerfer
        for (HeadLamp lamp : aHeadLamp) {
            if (lamp.getaPosition() == Position.frontRoof) {
                lamp.setaLightStatus(LightStatus.on);
                assertEquals(LightStatus.on, lamp.getaLightStatus());
            }
        }
        //Seitenlampen sind hier Fahrtrichtungsanzeiger & Bremslicht
        for (BreakingLight breakingLight : aBreakingLight) {
            assertEquals(LightStatus.off, breakingLight.getaLightStatus());
        }
        for (DirectionIndicator directionIndicator : aDirectionIndicator) {
            assertEquals(LightStatus.off, directionIndicator.getaLightStatus());
        }
        // Frontscheinwerfer
        for (HeadLamp headLamp : aHeadLamp) {
            if (headLamp.getaPosition() != Position.frontRoof) {
                headLamp.setaLightStatus(LightStatus.on);
                assertEquals(LightStatus.on, headLamp.getaLightStatus());
            }
        }
        // Warnlicht
        for (WarningLight warningLight : aWarningLight) {                                      //Check if warning light is turned on
            warningLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, warningLight.getaLightStatus());
        }
        // Blaulicht
        for (BlueLight blueLight : aBlueLight) {                                        //Check if Bluelight is turned off
            blueLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, blueLight.getaLightStatus());
        }

        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                  //Check if water tank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                    //Check if foam tank is 100% full
        assertEquals(CannonSteps.fuenfhundert ,aKnobFrontCannon.getaCannonStep());          //Check if knob for front cannon is set to step one
        assertEquals(CannonModes.modeA, aKnobRoofCannon.getaCannonMode());                  //Check if knob for roof cannon is set to mode one

        int startEnergieVolume = aBatteryBox.getallSoC();                                   //saves current energy level in order to check if consumption is right
        int consumedEnergy = 0;

        for (int i = 1; i <= 20; i++){                                                   //accelerate the FLF to 28km/h in 4km/h steps
            aDriver.accelerate();
            consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(i*4, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
        }
        //FLF fährt fünf Interationen mit konstant 28km/h geradeaus
        for (int i = 0; i < 10; i++){
            //consumedEnergy += aFLF.getaVelocity()*25;
            assertEquals(80, aFLF.getaVelocity());                                      //check if the velocity is actually 28km/h
        }
        assertEquals(startEnergieVolume-consumedEnergy, aBatteryBox.getallSoC());
    }

    @Test
    @Order(6)
    @DisplayName("handleFuelTruckOnFire - s04")
    public void handleFuelTruckOnFire(){
        for(int i = 0; i < 2; i++){
            aElectricMotor[i].setaMotorStatus(MotorStatus.on);
            assertEquals(MotorStatus.on, aElectricMotor[i].getaMotorStatus());   //Check if electric motors are on
        }
        aSeats[0].setaPerson(aDriver);
        aSeats[1].setaPerson(aOperator);
        for(int i = 0; i < 2; i++){
            assertNotNull(aSeats[i].getPerson());                            //Check if both front seats are taken
        }
        assertEquals(DoorStatus.closed, aDoors[0].getaDoorStatus());                //check if doors are closed
        assertEquals(DoorStatus.closed, aDoors[1].getaDoorStatus());

        // TODO: Was sind die Seitenlampen?
        // Dachscheinwerfer
        for (HeadLamp lamp : aHeadLamp) {
            if (lamp.getaPosition() == Position.frontRoof) {
                lamp.setaLightStatus(LightStatus.on);
                assertEquals(LightStatus.on, lamp.getaLightStatus());
            }
        }
        //Seitenlampen sind hier Fahrtrichtungsanzeiger & Bremslicht
        for (BreakingLight breakingLight : aBreakingLight) {
            breakingLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, breakingLight.getaLightStatus());
        }
        for (DirectionIndicator directionIndicator : aDirectionIndicator) {
            directionIndicator.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, directionIndicator.getaLightStatus());
        }
        // Frontscheinwerfer
        for (HeadLamp headLamp : aHeadLamp) {
            if (headLamp.getaPosition() != Position.frontRoof) {
                headLamp.setaLightStatus(LightStatus.on);
                assertEquals(LightStatus.on, headLamp.getaLightStatus());
            }
        }
        // Warnlicht
        for (WarningLight warningLight : aWarningLight) {                                      //Check if warning light is turned on
            warningLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, warningLight.getaLightStatus());
        }
        // Blaulicht
        for (BlueLight blueLight : aBlueLight) {                                        //Check if Bluelight is turned off
            blueLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, blueLight.getaLightStatus());
        }
        // TODO: Ist Tank initial bei 100%?
        assertEquals(new WaterTank().getVolume(), aWaterTank.getVolume());                  //Check if water tank is 100% full
        assertEquals(new FoamTank().getVolume(), aFoamTank.getVolume());                    //Check if foam tank is 100% full

        int startVolumeWater = aWaterTank.getVolume();
        aFLF.activateGroundSprayNozzles();
        assertEquals(startVolumeWater-(100* aGroundSprayNoozle.length), aWaterTank.getVolume()); //Check if Waterconsumption from GroundNozzles is correct

        if(aFrontCannon.getaCannonStatus() != CannonStatus.activated) {         //Check if frontcannon ist activated
            aDriver.useJoystickPressButton(Position.left);                      //if not press button in order to activate
        }
        assertEquals(CannonStatus.activated, aFrontCannon.getaCannonStatus());  //Check if frontcannon is now activated
        assertEquals(90, aFrontCannon.getAngle());                      //Check if angle is turned to 90 degrees
        aOperator.useKnobJoystickFrontCannon(CannonSteps.dreitausend); //Set volume being emitted to 3500units
        while(aMixingUnit.getaFoamRate() != FoamRate.fuenf){
            aDriver.useJoystickPressButton(Position.right);
        }
        assertEquals(CannonSteps.dreitausend, aKnobFrontCannon.getaCannonStep());   //Check if volume is successfully set to 3500units
        assertEquals(FoamRate.fuenf ,aMixingUnit.getaFoamRate());                //Check if FoamRate is successfully set to 10%
        for(int i=0; i < 3; i++){
            checkEmitConsumptionCannon(3000, 5, aJoystickFrontCannon);      //Emit mixture and check if consumption works according to the set parameters
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
        for (int i = 0; i < 5; i++){ //Check if current FoamRate equals 10% if not 10%...
            if (aMixingUnit.getaFoamRate() != FoamRate.drei){
                aDriver.useJoystickPressButton(Position.right); //...repeat pressing the Button unit FoamRate is set to 10%
            }
        }
        if (aMixingUnit.getaFoamRate() != FoamRate.drei) {
            fail(); //error: changing the foamRate seems not to work!
        }
        assertEquals(FoamRate.drei, aMixingUnit.getaFoamRate());               //check if foamRate is successfully set to 5%
        assertEquals(90, aRoofCannon.getaSegment1().getAngle());        //check if angle of segment1 is 90degreee
        assertEquals(90, aRoofCannon.getaSegment2().getAngle());        //check if angle of segment2 is 90degreee
        for(int i=0; i<3; i++){
            checkEmitConsumptionCannon(2500, 3, aJoystickRoofCannon);   //emit mixture and check consumption
        }
    }

    @Test
    @Order(7)
    @DisplayName("handlePushbackVehicleOnFire - s05")
    public void handlePushbackVehicleOnFire(){
        int p = 0;
        int initWaterVolume = aWaterTank.getVolume();
        int initFoamVolume = aFoamTank.getVolume();
        for(int i = 0; i < 2; i++){
            aElectricMotor[i].setaMotorStatus(MotorStatus.on);
            assertEquals(MotorStatus.on, aElectricMotor[i].getaMotorStatus());   //Check if electric motors are on
        }
        aSeats[0].setaPerson(aDriver);
        aSeats[1].setaPerson(aOperator);
        assertEquals("Driver", aSeats[0].getPerson());                  //Check if the Driver sits on seat 0
        assertEquals("Operator", aSeats[1].getPerson());                //Check if the Operator sits on seat 1
        for (Doors aDoor : aDoors) {
            aDoor.setaDoorStatus(DoorStatus.closed);
            assertEquals(DoorStatus.closed, aDoor.getaDoorStatus());        //Check if all doors are closed
        }
        for (HeadLamp headLamp : aHeadLamp) {                                //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
            headLamp.setaLightStatus(LightStatus.off);
            assertEquals(LightStatus.off, headLamp.getaLightStatus());      //check headlights(roof and side)
        }
        for (WarningLight warningLight : aWarningLight) {
            warningLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, warningLight.getaLightStatus());   //Check if Warninglight is on
        }
        for (BlueLight blueLight : aBlueLight) {
            blueLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, blueLight.getaLightStatus());      //Check if BlueLight is on
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
                fail();                                      //error: changing the foamRate seems not to work!
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
                fail();                                      //error: changing the foamRate seems not to work!
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
                fail();                                      //error: changing the foamRate seems not to work!
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
    @DisplayName("handleAirplaneEngineFire - s06")
    public void handleAirplaneEngineFire(){
        for(int i = 0; i < 2; i++){
            aElectricMotor[i].setaMotorStatus(MotorStatus.on);
            assertEquals(MotorStatus.on, aElectricMotor[i].getaMotorStatus());   //Check if electric motors are on
        }
        aSeats[0].setaPerson(aDriver);
        aSeats[1].setaPerson(aOperator);
        assertEquals("Driver", aSeats[0].getPerson());                  //Check if driver sits on seat 0
        assertEquals("Operator", aSeats[1].getPerson());                //Check if operator sits on sear 1
        assertEquals(DoorStatus.closed, aDoors[0].getaDoorStatus());            //Check if both doors are closed
        assertEquals(DoorStatus.closed, aDoors[1].getaDoorStatus());
        aRoofCannon.setaCannonStatus(CannonStatus.activated);
        assertEquals(CannonStatus.activated, aRoofCannon.getaCannonStatus());   //Check if rootcannon is activated
        //check Headlamp. FLF has in total 10 headlamps => Array(3 headlamps on each side and 4 on the roof)
        for (HeadLamp headLamp : aHeadLamp) {
            headLamp.setaLightStatus(LightStatus.off);
            assertEquals(LightStatus.off, headLamp.getaLightStatus());            //check headlights(roof and side)
        }
        for (WarningLight warningLight : aWarningLight) {
            warningLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, warningLight.getaLightStatus());              //check if warninglight is on
        }
        for (BlueLight blueLight : aBlueLight) {
            blueLight.setaLightStatus(LightStatus.on);
            assertEquals(LightStatus.on, blueLight.getaLightStatus());                 //check if bluelight is on
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
                fail();                                              //error: changing the foamRate doesn't work as it should!
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
                fail();                                              //error: changing the foamRate doesn't work as it should!
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
                fail();                                              //error: changing the foamRate doesn't work as it should!
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
                fail();                                              //error: changing the foamRate doesn't work as it should!
            }
        }
        for(int i=0; i<5; i++){
            checkEmitConsumptionCannon(1000, 3, aJoystickRoofCannon);
        }
        //end of test
    }


    private void behaviorJoystick2() {
        if(aRoofCannon.getaCannonStatus() == CannonStatus.activated){          //if current JoystickStatus
            aRoofCannon.getaSegment1().changeSegmentAngle(90);
            assertEquals(90, aRoofCannon.getaSegment1().getAngle());       //check roofcannon
            aRoofCannon.getaSegment2().changeSegmentAngle(90);
            assertEquals(90, aRoofCannon.getaSegment2().getAngle());              //check if second segment is horizontal
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
        switch (tempMix) {
            case 0 -> {
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
            }
            case 3 -> {
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
            }
            case 5 -> {
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
            }
            case 10 -> {
                joystick.pushPressButton(Position.right);
                assertEquals(0, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(3, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(5, aMixingUnit.getaFoamRateAsInt());
                joystick.pushPressButton(Position.right);
                assertEquals(10, aMixingUnit.getaFoamRateAsInt());
            }
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

    // K O M P L E X - T E S T S

    private void checkParkingComplex() throws Exception{
        aDoors[1].setaDoorStatus(DoorStatus.closed);      //initial the door is closed and operator inside the FLF
        aDoors[0].setaDoorStatus(DoorStatus.closed);
        IdCard idCardSam = new IdCard("FT-DUS-FLF-5-Sam-6072", "Sam", aCentralUnit.getaKey());      //Create IdCardSam
        aOperator.useDoorButton(Position.indoor, 1);        //Operator opens the rightdoor=1 from the inside and leaves the FLF
        aDriver.useDoorButton(Position.indoor, 0);          //Driver opens the leftdoor=0 from the inside and leaves the FLF
        aReceivverModule[0].readIdCard(idCardSam);                   //Driver Sam hold his Card at the ReceiverModule of the left door



    }

    private void checkInspectionDriveComplex() throws Exception{
        aDoors[1].setaDoorStatus(DoorStatus.locked);      //initial the door is closed and operator inside the FLF
        aDoors[0].setaDoorStatus(DoorStatus.locked);
        IdCard idCardSam = new IdCard("FT-DUS-FLF-5-Sam-6072", "Sam", aCentralUnit.getaKey());      //Create IdCardSam (Driver)
        aReceivverModule[0].readIdCard(idCardSam);                  //Driver Sam uses his idCard
        aOperator.useDoorButton(Position.indoor, 1);
        aDriver.useDoorButton(Position.indoor, 1);
    }

}