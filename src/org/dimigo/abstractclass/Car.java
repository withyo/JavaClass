package org.dimigo.abstractclass;

public class Car {
    private Engine engine; //차가 엔진 갖고있는거

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }
    public void stop() {
        engine.stopEngine();
    }
}
