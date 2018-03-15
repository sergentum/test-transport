package transport;

public abstract class Vehicle {
    String name;
    int maxSpeed;
    int wheelsCount;

    @Override
    public String toString() {
        return  "Наименование транспорта: " + name + "\n" +
                "Кол-во колес: " + wheelsCount + "\n" +
                "Максимальная скорость: " + maxSpeed + " км/ч"
                ;
    }

    public Vehicle(String name, int maxSpeed, int wheelsCount) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.wheelsCount = wheelsCount;
    }
}
