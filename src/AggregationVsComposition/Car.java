package AggregationVsComposition;

public final class Car {

    //For a car to move, it needs to have an Engine
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void move(){
        engine.work();
        System.out.println("Car is moving");
    }
}
