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
        assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getRedState());
    }





}
