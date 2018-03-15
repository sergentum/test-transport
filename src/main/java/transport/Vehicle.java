package transport;

public abstract class Vehicle {
    private TransportType type;
    private int maxSpeed;
    private int wheelsCount;

    @Override
    public String toString() {
        return  "Наименование транспорта: " + type.toString() + "\n" +
                "Кол-во колес: " + wheelsCount + "\n" +
                "Максимальная скорость: " + maxSpeed + " км/ч"
                ;
    }

    Vehicle(TransportType type, int maxSpeed, int wheelsCount) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.wheelsCount = wheelsCount;
    }
}
