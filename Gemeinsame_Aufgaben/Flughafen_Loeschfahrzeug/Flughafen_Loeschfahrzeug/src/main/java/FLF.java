public class FLF {

    private final PowerUnit aPowerUnit;
    private final GroundSprayNozzle[] aGroundSprayNoozle;
    private final FrontCannon aFrontCannon;
    private final RoofCannon aRoofCannon;
    private final Lights[] aLights;
    private final WarningLight[] aWarningLights;
    private final BlueLight[] aBlueLights;
    private final HeadLamp[] aHeadLamps;
    private final CentralUnit aCentralUnit;
    private final FrontPivot[] aFrontPivot;
    private final BackPivot[] aBackPivot;
    private final Cabine aCabine;
    private Builder aBuilder;
    private int aVelocity = 0;

    public static FLF init(){
        FLF Flughafen_Loeschfahrzeug = new FLF.Builder()
                .createeverything()
                .createPowerUnit()
                .createGroundSprayNozzle()
                .createFrontCannon()
                .createRoofCannon()
                .createLights()
                .createCentralUnit()
                .createFrontPivot()
                .createBackPivot()
                .createCabine()
                .build();
        System.out.println("FLF initialisiert.");
        return Flughafen_Loeschfahrzeug;
    }

    public Builder getaBuilder() {
        return aBuilder;
    }
    public void setaBuilder(Builder pbuilder) {
        aBuilder = pbuilder;
    }

    private FLF(Builder builder){
        aPowerUnit = builder.bPowerUnit;
        aGroundSprayNoozle = builder.bGroundSprayNoozle;
        aFrontCannon = builder.bFrontCannon;
        aRoofCannon = builder.bRoofCannon;
        aLights = builder.bLights;
        aWarningLights = builder.bWarningLights;
        aBlueLights = builder.bBlueLights;
        aHeadLamps = builder.bHeadLamps;
        aCentralUnit = builder.bCentralUnit;
        aFrontPivot = builder.bFrontPivot;
        aBackPivot = builder.bBackPivot;
        aCabine = builder.bCabine;
        aBuilder = builder;
    }

    public void setaRoofCannonStatus(CannonStatus cStatus) {
        aRoofCannon.setaCannonStatus(cStatus);
    }

    public void setRoofCannonAngle(int angle) {
        aRoofCannon.setRoofCannonAngle(angle);
    }

    public void activateFrontCannon() {
        switch (aFrontCannon.getaCannonStatus()){
            case activated:     //if current status is activated roof cannon is being deactivated
                aFrontCannon.setaCannonStatus(CannonStatus.deactivated);
                aFrontCannon.setFrontCannonAngle(0);      //set angle of segment1 of roof cannon
                break;
            case deactivated:   //if current status is deactivated roof cannon is being activated
                aFrontCannon.setaCannonStatus(CannonStatus.activated);
                aFrontCannon.setFrontCannonAngle(90);     //set angle of segment1 of roof cannon
                break;
        }
    }

    public void activateRoofCannon() {
        switch (aRoofCannon.getaCannonStatus()){
            case activated:
                aRoofCannon.setaCannonStatus(CannonStatus.deactivated);
                aRoofCannon.setSegment1Angle(0);
                aRoofCannon.setSegment2Angle(0);
                break;
            case deactivated:
                aRoofCannon.setaCannonStatus(CannonStatus.activated);
                aRoofCannon.setSegment1Angle(90);
                aRoofCannon.setSegment2Angle(90);
                break;
        }
    }

    /**
     * Adjusts the mixture of foam and water for both all cannons
     */
    public void adjustMixture() {
        aRoofCannon.adjustMixture();
    }

    /**
     * emits the extinguishing agent
     * @param units units per interation controls how much is emitted
     * @param cannon value can either be roof or front and describes which cannon is meant
     */
    public void emitExtinguishingAgentCannon(int units, String cannon) {
        switch (cannon){
            case "front":
                aFrontCannon.emit(units);
                break;
            case "roof":
                aRoofCannon.emit(units);
            default:
                System.out.println("Cannon does not exits!");
        }
    }

    /**
     * Activates all electric motors
     * @param status true=on    false=off
     */
    public void activateElectricEngine(boolean status) {
       aPowerUnit.activateElectricMotor(status);
    }


    /**
     * Turns the WarningLights on or off
     * @param status true=on
     */
    public void activateWarningLight(boolean status) {
        LightStatus lStatus = LightStatus.off;
        if(status){
            lStatus = LightStatus.on;
        }

        for (int i = 0; i < aWarningLights.length; i++){
            aWarningLights[i].setaLightStatus(lStatus);
        }
    }

    public void activateBlueLight(boolean status) {
        LightStatus lStatus = LightStatus.off;
        if(status){
            lStatus = LightStatus.on;
        }

        for (int i = 0; i < aBlueLights.length; i++){
            aBlueLights[i].setaLightStatus(lStatus);
        }
    }

    /**
     * Activate Headlights. In total 10 HeadLights exist. 4 in the front area on the roof and 3 on each side of the FLF.
     * With from and to you can set which lights should be affected by the call of the method
     * @param status The LightsStatus the lights should be set to
     * @param from Number of the first light
     * @param to Number of the last ligt
     */
    public void activateHeadLights(boolean status, int from, int to) {
        LightStatus lStatus = LightStatus.off;
        if(status){
            lStatus = LightStatus.on;
        }

        for(int i = from; i <= to; i++){
            aHeadLamps[i].setaLightStatus(lStatus);
        }
    }

    public static class Builder{
        // Klassen mit Verbindung zum FLF
        public PowerUnit bPowerUnit;
        public GroundSprayNozzle[] bGroundSprayNoozle;
        public FrontCannon bFrontCannon;
        public RoofCannon bRoofCannon;
        public Lights[] bLights;
        public CentralUnit bCentralUnit;
        public FrontPivot[] bFrontPivot;
        public BackPivot[] bBackPivot;
        public Cabine bCabine;
        // Alle Klassen
        public Battery[] bBattery;
        public BatteryBox bBatteryBox;
        public BlueLight[] bBlueLights;
        public BreakDisc[] bBreakDisc;
        public BreakingLight[] bBreakingLights;
        public BreakPedal bBreakPedal;
        public ControlPanel bControlPanel;
        public DirectionIndicator[] bDirectionIndicators;
        public Display bDisplay;
        public DoorButton[] bDoorButton;
        public Doors[] bDoors;
        public Driver bDriver;
        public ElectricMotor[] bElectricMotor;
        public EnergyDisplay bEnergyDisplay;
        public FoamTank bFoamTank;
        public GasMask bGasMask;
        public GasPedal bGasPedal;
        public HeadLamp[] bHeadLamps;   //10 Headlamps: left 3x right 3x roof 4x
        public Joystick bJoystick;
        public JoystickFrontCannon bJoystickFrontCannon;
        public JoystickRoofCannon bJoystickRoofCannon;
        public KeyButton[] bKeyButton;
        public KnobFrontCannon bKnobFrontCannon;
        public KnobRoofCannon bKnobRoofCannon;
        public LED bLED;
        //public LeftPressButton bLeftPressButton;
        public MixingUnit bMixingUnit;
        public Operator bOperator;
        public PieceSegment[] bPieceSegment;
        public Pivot bPivot;
        public PressButton[] bPressButton;
        //public RightPressButton bRightPressButton;
        public Seats[] bSeats;
        public Segment1 bSegment1;
        public Segment2 bSegment2;
        public SpeedDisplay bSpeedDisplay;
        public SterringWheel bSterringWheel;
        public Switch[] bSwitch;
        public Tank bTank;
        public WarningLight[] bWarningLights;
        public WaterTank bWaterTank;
        public Wheel[] bWheel;
        //Enumerations
        public BatteryManagement bBatteryManagement;
        public BatteryStatus bBatteryStatus;
        public CannonModes bCannonModes;
        public CannonSteps bCannonSteps;
        public DoorStatus bDoorStatus;
        public FoamRate bFoamRate;
        public LEDColor bLEDColor;
        public LightSize bLightSize;
        public LightStatus bLightStatus;
        public Position bPosition;
        public SwitchStatus bSwitchStatus;
        public SwitchType bSwitchType;
        public TankSubstance bTankSubstance;

        // Erstellen der Klassen am FLF und deren Unterklassen
        public Builder createPowerUnit(){
            bPowerUnit = new PowerUnit();
            bPowerUnit.setaElectricMotor(bElectricMotor);
            return this;
        }

        public Builder createGroundSprayNozzle(){
            bGroundSprayNoozle = new GroundSprayNozzle[7];
            for (int i = 0; i < 7; i++)
            {
                bGroundSprayNoozle[i] = new GroundSprayNozzle();
                bGroundSprayNoozle[i].setaWaterTank(bWaterTank);
            }
            return this;
        }

        public Builder createFrontCannon(){
            bFrontCannon = new FrontCannon();
            bFrontCannon.setaMixingUnit(bMixingUnit);
            return this;
        }

        public Builder createRoofCannon(){
            bRoofCannon = new RoofCannon();
            bRoofCannon.setaMixingUnit(bMixingUnit);
            bRoofCannon.setaSegment1(bSegment1);
            bRoofCannon.setaSegment2(bSegment2);
            return this;
        }

        public Builder createLights(){
            bWarningLights = new WarningLight[]{new WarningLight(LightSize.small, Position.frontRoofLeft), new WarningLight(LightSize.small, Position.backRoofRight)};
            bHeadLamps = new HeadLamp[]{new HeadLamp(LightSize.medium, Position.frontLeft), new HeadLamp(LightSize.medium, Position.frontLeft), new HeadLamp(LightSize.medium, Position.frontLeft), new HeadLamp(LightSize.medium, Position.frontRight), new HeadLamp(LightSize.medium, Position.frontRight), new HeadLamp(LightSize.medium, Position.frontRight), new HeadLamp(LightSize.medium, Position.frontRoof), new HeadLamp(LightSize.medium, Position.frontRoof), new HeadLamp(LightSize.medium, Position.frontRoof), new HeadLamp(LightSize.medium, Position.frontRoof),};
            bDirectionIndicators = new DirectionIndicator[]{new DirectionIndicator(LightSize.medium, Position.frontLeft), new DirectionIndicator(LightSize.medium, Position.frontRight), new DirectionIndicator(LightSize.medium, Position.backLeft), new DirectionIndicator(LightSize.medium, Position.backRight)};
            bBreakingLights = new BreakingLight[]{new BreakingLight(LightSize.medium, Position.backLeft), new BreakingLight(LightSize.medium, Position.backRight)};
            bBlueLights = new BlueLight[]{new BlueLight(LightSize.small, Position.frontLeft), new BlueLight(LightSize.small, Position.frontRight), new BlueLight(LightSize.big, Position.frontRoofLeft), new BlueLight(LightSize.big, Position.frontRoofRight), new BlueLight(LightSize.medium, Position.backLeft), new BlueLight(LightSize.medium, Position.backLeft), new BlueLight(LightSize.medium, Position.backRight), new BlueLight(LightSize.medium, Position.backRight)};
            return this;
        }

        public Builder createCentralUnit(){
            bCentralUnit = new CentralUnit();
            bControlPanel.setaCentralUnit(bCentralUnit);
            bBreakPedal.setaCentralUnit(bCentralUnit);
            bGasPedal.setaCentralUnit(bCentralUnit);
            bSterringWheel.setaCentralUnit(bCentralUnit);
            bJoystickFrontCannon.setaCentralUnit(bCentralUnit);
            bJoystickRoofCannon.setaCentralUnit(bCentralUnit);
            return this;
        }

        public Builder createFrontPivot(){
            bFrontPivot = new FrontPivot[]{new FrontPivot(), new FrontPivot()};
            for(int i = 0; i < 2; i++)
            {
                bWheel = new Wheel[]{new Wheel(), new Wheel()};
                for (int j = 0; j < 2; j++){
                    bBreakDisc = new BreakDisc[]{new BreakDisc(), new BreakDisc(), new BreakDisc()};
                    bWheel[j].setaBreakDisc(bBreakDisc);
                }
                bFrontPivot[i].setaWheel(bWheel);
            }
            return this;
        }

        public Builder createBackPivot(){
            bBackPivot = new BackPivot[]{new BackPivot(), new BackPivot()};
            for (int i = 0; i < 2; i++) {
                bWheel = new Wheel[]{new Wheel(), new Wheel()};
                for (int j = 0; j < 2; j++) {
                    bBreakDisc = new BreakDisc[]{new BreakDisc(), new BreakDisc(), new BreakDisc()};
                    bWheel[j].setaBreakDisc(bBreakDisc);
                }
                bBackPivot[i].setaWheel(bWheel);
            }
            return this;
        }

        public Builder createCabine(){
            bCabine = new Cabine();
            bCabine.setaControlPanel(bControlPanel);
            bCabine.setaDoors(bDoors);
            bCabine.setaEnergyDisplay(bEnergyDisplay);
            bCabine.setaSpeedDisplay(bSpeedDisplay);
            bCabine.setaJoystickFrontCannon(bJoystickFrontCannon);
            bCabine.setaJoystickRoofCannon(bJoystickRoofCannon);
            bCabine.setaSeats(bSeats);
            bCabine.setaGasPedal(bGasPedal);
            bCabine.setaBreakPedal(bBreakPedal);
            bCabine.setaSterringWheel(bSterringWheel);
            return this;
        }

        //Methoden der Unterklassen
        public Builder createeverything()
        {
            // Alle Klassen
            bBattery = new Battery[]{new Battery(), new Battery(), new Battery(), new Battery()};
            bBatteryBox = new BatteryBox();
            bBreakPedal = new BreakPedal();
            bCentralUnit = new CentralUnit();
            bControlPanel = new ControlPanel();
            bDoors = new Doors[]{new Doors(), new Doors()};
            bDriver = new Driver();
            bElectricMotor = new ElectricMotor[]{new ElectricMotor(), new ElectricMotor()};
            bEnergyDisplay = new EnergyDisplay();
            bFoamTank = new FoamTank();
            bFrontCannon = new FrontCannon();
            bGasPedal = new GasPedal();
            bJoystickFrontCannon = new JoystickFrontCannon(bCentralUnit);
            bJoystickRoofCannon = new JoystickRoofCannon(bCentralUnit);
            bKeyButton[0] = new KeyButton(bJoystickFrontCannon);
            bKeyButton[1] = new KeyButton(bJoystickRoofCannon);
            bKnobFrontCannon = new KnobFrontCannon();
            bKnobRoofCannon = new KnobRoofCannon();
            bLED = new LED();
            //bLeftPressButton = new LeftPressButton();
            bMixingUnit = new MixingUnit();
            bOperator = new Operator();
            bPieceSegment = new PieceSegment[]{new PieceSegment(), new PieceSegment(), new PieceSegment()};
            //bRightPressButton = new RightPressButton();
            bPressButton = new PressButton[4];
            bPressButton[0] = new LeftPressButton(bJoystickFrontCannon);
            bPressButton[1] = new LeftPressButton(bJoystickRoofCannon);
            bPressButton[2] = new RightPressButton(bJoystickFrontCannon);
            bPressButton[3] = new RightPressButton(bJoystickRoofCannon);
            bRoofCannon = new RoofCannon();
            bSeats = new Seats[]{new Seats(), new Seats(), new Seats(), new Seats()};
            bSegment1 = new Segment1();
            bSegment2 = new Segment2();
            bSpeedDisplay = new SpeedDisplay();
            bSterringWheel = new SterringWheel();
            bSwitch = new Switch[]{new Switch(SwitchType.electricEngines), new Switch(SwitchType.warningLight), new Switch(SwitchType.blueLight), new Switch(SwitchType.headLamp), new Switch(SwitchType.roofMountedLight), new Switch(SwitchType.sideLamp)};       //Switches are initialized with their SwitchType
            bWaterTank = new WaterTank();

            //Zuweisungen
            bBatteryBox.setaBattery(bBattery);

            bMixingUnit.setaWaterTank(bWaterTank);
            bMixingUnit.setaFoamTank(bFoamTank);

            bSegment2.setaPiecesegment(bPieceSegment);

            bFrontCannon.setaMixingUnit(bMixingUnit);
            bRoofCannon.setaMixingUnit(bMixingUnit);

            bDriver.setaBreakPedal(bBreakPedal);
            bDriver.setaGasPedal(bGasPedal);
            bDriver.setaSterringWheel(bSterringWheel);
            bDriver.setaJoyStickFrontCannon(bJoystickFrontCannon);

            bOperator.setaControlPanel(bControlPanel);
            bOperator.setaJoystickRoofCannon(bJoystickRoofCannon);
            bOperator.setbKnobFrontCannon(bKnobFrontCannon);
            bOperator.setbKnobRoofCannon(bKnobRoofCannon);

            bControlPanel.setaSwitch(bSwitch);
            bControlPanel.setaKnobFrontCannon(bKnobFrontCannon);
            bControlPanel.setaKnobRoofCannon(bKnobRoofCannon);
            bKnobFrontCannon.setaControlPanel(bControlPanel);
            bKnobRoofCannon.setaControlPanel(bControlPanel);


            bJoystickFrontCannon.setaKeyButton(bKeyButton[0]);
            bJoystickRoofCannon.setaKeyButton(bKeyButton[1]);

            bJoystickFrontCannon.setaLeftPressButton((LeftPressButton) bPressButton[0]);
            bJoystickFrontCannon.setaRightPressButton((RightPressButton) bPressButton[2]);
            bJoystickRoofCannon.setaLeftPressButton((LeftPressButton) bPressButton[1]);
            bJoystickRoofCannon.setaRightPressButton((RightPressButton) bPressButton[3]);

            for (int i = 0; i < bSwitch.length; i++){
                bSwitch[i].setaControlPanel(bControlPanel);
            }
            //bJoystick.setaLeftPressButton(bPressButton[0]);  Das hier war die Alte Version. Nun sind die PressButtons in einem Array angelegt
            //bJoystick.setaRightPressButton(bPressButton[2]);

            for (int i = 0; i < 4; i++){
                bGasMask = new GasMask();
                bSeats[i].setaGasMask(bGasMask);
            }

            for (int i = 0; i < 2; i++){
                bDoorButton = new DoorButton[]{new DoorButton(), new DoorButton()};
                bDoors[i].setaDoorButton(bDoorButton);
            }

            // Enum BatteryManagement
            bBatteryManagement.setaBatteryBox(bBatteryBox);

            return this;
        }

        public FLF build() {

            return new FLF(this);
        }
    }

    /**
     * Changes the current velocity if the FLF and sends info to speed display and power unit
     * @param i change of velocity in km/h
     */
    public void updateaVelocity(int i) {
        aVelocity = aVelocity + i;
        aCabine.setaSpeedDisplayValue(aVelocity);       //handles the visualization of the velocity by sending the value to cabine
        //aPowerUnit.provide(aVelocity); still in implementation
    }

    /**
     * Sends the steering angle to both front pivots and direction indicators
     * @param aSteeringAngle Parameter given in % (minus=left, positiv=right)
     */
    public void steerFLF(int aSteeringAngle) {
        for(int i = 0; i < aFrontPivot.length; i++){
            aFrontPivot[0].updateaSteerAngle(aSteeringAngle);   //steering angle is send to both front pivots
        }

        //send information to direction indicators
    }

    /**
     * Returns the angle both front pivots are currently set to
     * @return angle given in % (minus=left, positiv=right)
     */
    public int getSteeringAngleFrontPivot(){
        if(aFrontPivot[0].getSteerAngle() == aFrontPivot[1].getSteerAngle()){
            return  aFrontPivot[0].getSteerAngle();
        }
        else {
            return -9999;
        }
    }

    /**
     * returns the current velocity of the FLF
     * @return veloctiy stored in the FLF class
     */
    public int getaVelocity() {
        return aVelocity;
    }


}
