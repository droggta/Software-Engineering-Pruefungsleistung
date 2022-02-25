public interface IntState {
        void pushButton(IntJoystick pJoystick);
        void pushHoldButton(IntJoystick pJoystick);
        void releaseHoldButton(IntJoystick pJoystick);
        void changeCannonPosition(IntJoystick pJoystick);
}
