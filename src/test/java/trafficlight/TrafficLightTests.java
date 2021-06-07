package trafficlight;

import trafficlight.ctrl.TrafficLightCtrl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class TrafficLightTests {


    @Test
    @DisplayName("check Singleton1")
    public void SingletonTest() {
        //we compare the current state at the beginning with green state that it should start with
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        assertEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check Singleton2")
    public void SingletonTest2() {
        //we compare the current state at the beginning with green state that it should start with
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        assertNotEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check Singleton3")
    public void SingletonTest3() {
        //we compare the current state at the beginning with green state that it should start with
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        assertNotEquals(control.getCurrentState(), control.getRedState());

        // assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getRedState());
    }

    @Test
    @DisplayName("check green to yellow1")
    public void ChangeFromGreenToYellow() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check green to yellow2")
    public void ChangeFromGreenToYellow2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check green to yellow3")
    public void ChangeFromGreenToYellow3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check yellow to red1")
    public void ChangeFromYellowtoRed() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check yellow to red2")
    public void ChangeFromYellowtoRed2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check yellow to red3")
    public void ChangeFromYellowtoRed3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check red to yellow1")
    public void ChangeFromRedToYellow() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check red to yellow2")
    public void ChangeFromRedToYellow2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check red to yellow3")
    public void ChangeFromRedToYellow3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check yellow to green1")
    public void ChangeFromYellowToGreen() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        control.nextState();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check yellow to green2")
    public void ChangeFromYellowToGreen2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check yellow to green3")
    public void ChangeFromYellowToGreen3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();
        control.nextState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getYellowState());
    }
}
