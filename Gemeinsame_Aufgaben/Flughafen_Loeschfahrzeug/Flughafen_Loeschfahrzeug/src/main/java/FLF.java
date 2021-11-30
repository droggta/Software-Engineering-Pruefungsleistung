public class FLF {

    private final PowerUnit aPowerUnit;
    private final GroundSprayNozzle aGroundSprayNoozle;
    private final FrontPivot aFrontPivot;
    private final BackPivot aBackPivot;
    private final Cabine aCabine;

    public static void main(String... args){
        FLF Flughafen_Loeschfahrzeug = new FLF.Builder()
                .createeverything()
                .createPowerUnit()
                .createGroundSprayNozzle()
                .createFrontPivot()
                .createBackPivot()
                .createCabine()
                .build();
        System.out.println("Test");
    }

    private FLF(Builder builder){
        aPowerUnit = builder.bPowerUnit;
        aGroundSprayNoozle = builder.bGroundSprayNoozle;
        aFrontPivot = builder.bFrontPivot;
        aBackPivot = builder.bBackPivot;
        aCabine = builder.bCabine;
    }

    public static class Builder{
        // Klassen mit Verbindung zum FLF
        private PowerUnit bPowerUnit;
        private GroundSprayNozzle bGroundSprayNoozle;
        private FrontPivot bFrontPivot;
        private BackPivot bBackPivot;
        private Cabine bCabine;
        // Alle Klassen
        private Battery[] bBattery;
        private BatteryBox bBatteryBox;
        private BlueLight bBlueLight;
        private BreakDisc[] bBreakDisc;
        private BreakingLight bBreakingLight;
        private BreakPedal bBreakPedal;
        private CentralUnit bCentralUnit;
        private ControlPanel bControlPanel;
        private DirectionIndicator bDirectionIndicator;
        private Display bDisplay;
        private DoorButton[] bDoorButton;
        private Doors[] bDoors;
        private Driver bDriver;
        private ElectricMotor[] bElectricMotor;
        private EnergyDisplay bEnergyDisplay;
        private FoamTank bFoamTank;
        private FrontCannon bFrontCannon;
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
        private Lights bLights;
        private MixingUnit bMixingUnit;
        private Operator bOperator;
        private Pivot bPivot;
        private PressButton bPressButton;
        private RightPressButton bRightPressButton;
        private RoofCannon bRoofCannon;
        private Seats[] bSeats;
        private SpeedDisplay bSpeedDisplay;
        private SterringWheel bSterringWheel;
        private Switch[] bSwitch;
        private Tank bTank;
        private TurningKnob bTuningKnob;
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
            bGroundSprayNoozle = new GroundSprayNozzle();
            bGroundSprayNoozle.setaWaterTank(bWaterTank);
            return this;
        }

        public Builder createFrontPivot(){
            bFrontPivot = new FrontPivot();
            bWheel = new Wheel[]{new Wheel(), new Wheel()};
            for (int i = 0; i < 2; i++){
                bBreakDisc = new BreakDisc[]{new BreakDisc(), new BreakDisc(), new BreakDisc()};
                bWheel[i].setaBreakDisc(bBreakDisc);
            }
            bFrontPivot.setaWheel(bWheel);
            return this;
        }

        public Builder createBackPivot(){
            bBackPivot = new BackPivot();
            bWheel = new Wheel[]{new Wheel(), new Wheel()};
            for (int i = 0; i < 2; i++){
                bBreakDisc = new BreakDisc[]{new BreakDisc(), new BreakDisc(), new BreakDisc()};
                bWheel[i].setaBreakDisc(bBreakDisc);
            }
            bBackPivot.setaWheel(bWheel);
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
            bCabine.setaKnobFrontCannon(bKnobFrontCannon);
            bCabine.setaKnobRoofCannon(bKnobRoofCannon);
            bCabine.setaTurningKnob(bTuningKnob);
            bCabine.setaSeats(bSeats);
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
            bRightPressButton = new RightPressButton();
            bRoofCannon = new RoofCannon();
            bSeats = new Seats[]{new Seats(), new Seats(), new Seats(), new Seats()};
            bSpeedDisplay = new SpeedDisplay();
            bSterringWheel = new SterringWheel();
            bSwitch = new Switch[]{new Switch(), new Switch(), new Switch(), new Switch(), new Switch(), new Switch()};
            bTuningKnob = new TurningKnob();
            bWarningLight = new WarningLight();
            bWaterTank = new WaterTank();

            //Zuweisungen
            bBatteryBox.setaBattery(bBattery);

            bMixingUnit.setaWaterTank(bWaterTank);
            bMixingUnit.setaFoamTank(bFoamTank);

            bFrontCannon.setaMixingUnit(bMixingUnit);
            bRoofCannon.setaMixingUnit(bMixingUnit);

            bCentralUnit.setaFrontCannon(bFrontCannon);
            bCentralUnit.setaRoofCannon(bRoofCannon);
            bCentralUnit.setaControlPanel(bControlPanel);
            bCentralUnit.setaBreakPedal(bBreakPedal);
            bCentralUnit.setaGasPedal(bGasPedal);
            bCentralUnit.setaSteeringWheel(bSterringWheel);

            bDriver.setaBreakPedal(bBreakPedal);
            bDriver.setaGasPedal(bGasPedal);
            bDriver.setaJoyStickFrontCannon(bJoystickFrontCannon);

            bOperator.setaControlPanel(bControlPanel);
            bOperator.setaJoystickRoofCannon(bJoystickRoofCannon);

            bControlPanel.setaSwitch(bSwitch);

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
