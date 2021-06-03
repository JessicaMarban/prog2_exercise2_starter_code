package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.observer.Observer;
import trafficlight.states.State;

//implement Singleton Pattern here
public class TrafficLightCtrl {

    private State greenState;

    private State redState;

    private State yellowState;

    private State currentState;

    private State previousState;

    private final TrafficLightGui gui;

    private boolean doRun = true;

    //implement controller as Singleton
    private static TrafficLightCtrl ctrl;

    //getInstance methode for Singleton
    //if there isn't a controller, it creates a new one and returns it
    public static TrafficLightCtrl getInstance() {
        if (ctrl == null) {
            ctrl = new TrafficLightCtrl();
        }
        return ctrl;
    }

    //needs to be private so it doesn't return the same stuff every time and notify observer about the current state
    private TrafficLightCtrl() {
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
        //TODO useful to update the current state
        //currentstate change notifies the observers
        currentState.notifyObserver();
    }

    //when each state (color) changes, the observers need to be notified
    private void initStates() {
        greenState = new State() {
            @Override
            public State getNextState() {
                previousState = currentState;
                //TODO useful to update the current state and the old one
                //current state is updated and it changes into next (yellow) state -> Observers are notified
                currentState.notifyObserver();
                yellowState.notifyObserver();
                return yellowState;
            }
            @Override
            public String getColor() {
                return "green";
            }
        };

        redState = new State() {
            @Override
            public State getNextState() {
                previousState = currentState;
                //TODO useful to update the current state and the old one
                //current state is updated and it changes from red to yellow -> Observers are notified
                yellowState.notifyObserver();
                currentState.notifyObserver();
                return yellowState;
            }
            @Override
            public String getColor() {
                return "red";
            }
        };

        yellowState = new State() {
            @Override
            public State getNextState() {
                if (previousState.equals(greenState)) {
                    previousState = currentState;
                    //TODO useful to update the current state and the old one
                    //yellow state can go both ways - either green or red
                    //in both cases, observers need to be notified
                    currentState.notifyObserver();
                    redState.notifyObserver();

                    return redState;
                }else {
                    previousState = currentState;
                    //TODO useful to update the current state and the old one
                    currentState.notifyObserver();
                    greenState.notifyObserver();
                    return greenState;
                }
            }
            @Override
            public String getColor() {
                return "yellow";
            }
        };
        currentState = greenState;
        previousState = yellowState;
    }

    public State getGreenState() {
        return greenState;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public void run()  {
        int intervall = 1500;
        while (doRun) {
            try {
                Thread.sleep(intervall);
                nextState();
            } catch (InterruptedException e) {
                gui.showErrorMessage(e);
            }
        }
        System.out.println("Stopped");
        System.exit(0);
    }

    public void nextState() {
        currentState = currentState.getNextState();
    }

    public void stop() {
        doRun = false;
    }
}