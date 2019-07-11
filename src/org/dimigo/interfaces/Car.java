package org.dimigo.interfaces;


public class Car {
    private IEngine engine; //차가 엔진 갖고있는거

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }
    public void stop() {
        engine.stopEngine();
    }
}
