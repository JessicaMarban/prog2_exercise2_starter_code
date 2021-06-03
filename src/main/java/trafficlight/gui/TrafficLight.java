package trafficlight.gui;


import trafficlight.observer.Observer;

import java.awt.*;

//the concreteObserver of the interface Observer
public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }


    //overridden method from observer interface
    @Override
    public void update() {
        //changes boolean state aka if it is turned on, it will turn off and vise versa
        this.turnOn(!isOn);
    }
}
//TODO implement a part of the pattern here

