package transport;

public abstract class Vehicle {
    String name;
    TransportType type;
    int maxSpeed;
    int wheelsCount;

    @Override
    public String toString() {
        return  "Наименование транспорта: " + type.toString() + "\n" +
                "Кол-во колес: " + wheelsCount + "\n" +
                "Максимальная скорость: " + maxSpeed + " км/ч"
                ;
    }

    public Vehicle(TransportType type, int maxSpeed, int wheelsCount) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.wheelsCount = wheelsCount;
    }
}
