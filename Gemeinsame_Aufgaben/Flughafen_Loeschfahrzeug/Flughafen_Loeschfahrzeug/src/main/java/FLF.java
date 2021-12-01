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

    public static void main(String... args){
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
        System.out.println("Test");
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
    }

    public static class Builder{
        // Klassen mit Verbindung zum FLF
        private PowerUnit bPowerUnit;
        private GroundSprayNozzle[] bGroundSprayNoozle;
        private FrontCannon bFrontCannon;
        private RoofCannon bRoofCannon;
        private Lights[] bLights;
        private CentralUnit bCentralUnit;
        private FrontPivot[] bFrontPivot;
        private BackPivot[] bBackPivot;
        private Cabine bCabine;
        // Alle Klassen
        private Battery[] bBattery;
        private BatteryBox bBatteryBox;
        private BlueLight bBlueLight;
        private BreakDisc[] bBreakDisc;
        private BreakingLight bBreakingLight;
        private BreakPedal bBreakPedal;
        private ControlPanel bControlPanel;
        private DirectionIndicator bDirectionIndicator;
        private Display bDisplay;
        private DoorButton[] bDoorButton;
        private Doors[] bDoors;
        private Driver bDriver;
        private ElectricMotor[] bElectricMotor;
        private EnergyDisplay bEnergyDisplay;
        private FoamTank bFoamTank;
        private GasMask bGasMask;
        private GasPedal bGasPedal;
        private HeadLamp bHeadLamp;
        private Joystick bJoystick;
        private JoystickFrontCannon bJoystickFrontCannon;
        private JoystickRoofCannon bJoystickRoofCannon;
        private KeyButton bKeyButton;
        private KnobFrontCannon bKnobFrontCannon;
        private KnobRoofCannon bKnobRoofCannon;
        private LED bLED;
        private LeftPressButton bLeftPressButton;
        private MixingUnit bMixingUnit;
        private Operator bOperator;
        private PieceSegment[] bPieceSegment;
        private Pivot bPivot;
        private PressButton bPressButton;
        private RightPressButton bRightPressButton;
        private Seats[] bSeats;
        private Segment1 bSegment1;
        private Segment2 bSegment2;
        private SpeedDisplay bSpeedDisplay;
        private SterringWheel bSterringWheel;
        private Switch[] bSwitch;
        private Tank bTank;
        private WarningLight bWarningLight;
        private WaterTank bWaterTank;
        private Wheel[] bWheel;
        //Enumerations
        private BatteryManagement bBatteryManagement;
        private BatteryStatus bBatteryStatus;
        private CannonModes bCannonModes;
        private CannonSteps bCannonSteps;
        private DoorStatus bDoorStatus;
        private FoamRate bFoamRate;
        private LEDColor bLEDColor;
        private LightSize bLightSize;
        private LightStatus bLightStatus;
        private Position bPosition;
        private SwitchStatus bSwitchStatus;
        private SwitchType bSwitchType;
        private TankSubstance bTankSubstance;

        // Erstellen der Klassen am FLF und deren Unterklassen
        public Builder createPowerUnit(){
            bPowerUnit = new PowerUnit();
            bPowerUnit.setaElectricMotor(bElectricMotor);
            return this;
        }

        public Builder createGroundSprayNozzle(){
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
