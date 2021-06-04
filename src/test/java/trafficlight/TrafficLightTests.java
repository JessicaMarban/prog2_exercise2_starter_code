package trafficlight;

import trafficlight.ctrl.TrafficLightCtrl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class TrafficLightTests {


    @Test
    @DisplayName("check Singleton")
    public void SingletonTest() {
        //we compare the current state at the beginning with green state that it should start with
        assertEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getGreenState());
    }

    @Test
    @DisplayName("check Singleton")
    public void SingletonTest2() {
        //we compare the current state at the beginning with green state that it should start with
        assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getYellowState());
    }

    @Test
    @DisplayName("check Singleton")
    public void SingletonTest3() {
        //we compare the current state at the beginning with green state that it should start with
        assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getRedState());
    }

    @Test
    @DisplayName("check green to yellow")
    public void ChangeFromGreenToYellow() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check green to yellow")
    public void ChangeFromGreenToYellow2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check green to yellow")
    public void ChangeFromGreenToYellow3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check yellow to red")
    public void ChangeFromYellowtoRed() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check yellow to red")
    public void ChangeFromYellowtoRed2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check yellow to red")
    public void ChangeFromYellowtoRed3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getGreenState());
    }

    @Test
    @DisplayName("check red to yellow")
    public void ChangeFromRedToYellow() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        control.nextState();
        control.nextState();
        assertEquals(control.getCurrentState(), control.getYellowState());
    }

    @Test
    @DisplayName("check red to yellow")
    public void ChangeFromRedToYellow2() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getRedState());
    }

    @Test
    @DisplayName("check red to yellow")
    public void ChangeFromRedToYellow3() {
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.nextState();
        control.nextState();
        control.nextState();
        assertNotEquals(control.getCurrentState(), control.getGreenState());
    }


}
