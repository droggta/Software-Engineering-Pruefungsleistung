public class FLF {

    private final PowerUnit aPowerUnit;
    private final GroundSprayNozzle[] aGroundSprayNoozle;
    private final FrontCannon aFrontCannon;
    private final RoofCannon aRoofCannon;
    private final Lights[] aLights;
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
        }
    }

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
        public HeadLamp[] bHeadLamps;
        public Joystick bJoystick;
        public JoystickFrontCannon bJoystickFrontCannon;
        public JoystickRoofCannon bJoystickRoofCannon;
        public KeyButton bKeyButton;
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
            bKeyButton = new KeyButton();
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
            bSwitch = new Switch[]{new Switch(), new Switch(), new Switch(), new Switch(), new Switch(), new Switch()};
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


            bJoystickFrontCannon.setaLeftPressButton((LeftPressButton) bPressButton[0]);
            bJoystickFrontCannon.setaRightPressButton((RightPressButton) bPressButton[2]);
            bJoystickRoofCannon.setaLeftPressButton((LeftPressButton) bPressButton[1]);
            bJoystickRoofCannon.setaRightPressButton((RightPressButton) bPressButton[3]);
            //bJoystick.setaLeftPressButton(bPressButton[0]);
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


}
