package transport;

public enum TransportType {
    MOTORCYCLE("Мотоцикл"),
    SCOOTER("Самокат"),
    CAR("Автомобиль"),
    BUS("Автобус"),
    ;

    private String value;

    TransportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }

}
