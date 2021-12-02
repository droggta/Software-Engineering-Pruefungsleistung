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
        public BlueLight bBlueLight;
        public BreakDisc[] bBreakDisc;
        public BreakingLight bBreakingLight;
        public BreakPedal bBreakPedal;
        public ControlPanel bControlPanel;
        public DirectionIndicator bDirectionIndicator;
        public Display bDisplay;
        public DoorButton[] bDoorButton;
        public Doors[] bDoors;
        public Driver bDriver;
        public ElectricMotor[] bElectricMotor;
        public EnergyDisplay bEnergyDisplay;
        public FoamTank bFoamTank;
        public GasMask bGasMask;
        public GasPedal bGasPedal;
        public HeadLamp bHeadLamp;
        public Joystick bJoystick;
        public JoystickFrontCannon bJoystickFrontCannon;
        public JoystickRoofCannon bJoystickRoofCannon;
        public KeyButton bKeyButton;
        public KnobFrontCannon bKnobFrontCannon;
        public KnobRoofCannon bKnobRoofCannon;
        public LED bLED;
        public LeftPressButton bLeftPressButton;
        public MixingUnit bMixingUnit;
        public Operator bOperator;
        public PieceSegment[] bPieceSegment;
        public Pivot bPivot;
        public PressButton bPressButton;
        public RightPressButton bRightPressButton;
        public Seats[] bSeats;
        public Segment1 bSegment1;
        public Segment2 bSegment2;
        public SpeedDisplay bSpeedDisplay;
        public SterringWheel bSterringWheel;
        public Switch[] bSwitch;
        public Tank bTank;
        public WarningLight bWarningLight;
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
            bWarningLight = new WarningLight();
            bHeadLamp = new HeadLamp();
            bDirectionIndicator = new DirectionIndicator();
            bBreakingLight = new BreakingLight();
            bBlueLight = new BlueLight();
            bLights = new Lights[]{bWarningLight, bHeadLamp, bDirectionIndicator, bBreakingLight, bBlueLight};
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
            bBlueLight = new BlueLight();
            bBreakingLight = new BreakingLight();
            bBreakPedal = new BreakPedal();
            bCentralUnit = new CentralUnit();
            bControlPanel = new ControlPanel();
            bDirectionIndicator = new DirectionIndicator();
            bDoors = new Doors[]{new Doors(), new Doors()};
            bDriver = new Driver();
            bElectricMotor = new ElectricMotor[]{new ElectricMotor(), new ElectricMotor()};
            bEnergyDisplay = new EnergyDisplay();
            bFoamTank = new FoamTank();
            bFrontCannon = new FrontCannon();
            bGasPedal = new GasPedal();
            bHeadLamp = new HeadLamp();
            bJoystickFrontCannon = new JoystickFrontCannon();
            bJoystickRoofCannon = new JoystickRoofCannon();
            bKeyButton = new KeyButton();
            bKnobFrontCannon = new KnobFrontCannon();
            bKnobRoofCannon = new KnobRoofCannon();
            bLED = new LED();
            bLeftPressButton = new LeftPressButton();
            bMixingUnit = new MixingUnit();
            bOperator = new Operator();
            bPieceSegment = new PieceSegment[]{new PieceSegment(), new PieceSegment(), new PieceSegment()};
            bRightPressButton = new RightPressButton();
            bRoofCannon = new RoofCannon();
            bSeats = new Seats[]{new Seats(), new Seats(), new Seats(), new Seats()};
            bSegment1 = new Segment1();
            bSegment2 = new Segment2();
            bSpeedDisplay = new SpeedDisplay();
            bSterringWheel = new SterringWheel();
            bSwitch = new Switch[]{new Switch(), new Switch(), new Switch(), new Switch(), new Switch(), new Switch()};
            bWarningLight = new WarningLight();
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

            bJoystick.setaLeftPressButton(bLeftPressButton);
            bJoystick.setaRightPressButton(bRightPressButton);

            for (int i = 0; i < 4; i++){
                bGasMask = new GasMask();
                bSeats[i].setaGasMask(bGasMask);
            }

            for (int i = 0; i < 2; i++){
                bDoorButton = new DoorButton[]{new DoorButton(), new DoorButton()};
                bDoors[i].setaDoorButton(bDoorButton);
            }

            return this;
        }

        public FLF build() {

            return new FLF(this);
        }
    }
}
