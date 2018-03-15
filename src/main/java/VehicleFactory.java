import transport.*;

public class VehicleFactory {
    public Vehicle getTransport(TransportType type) {
        Vehicle vehicle = null;

        switch (type) {
            case MOTORCYCLE:
                vehicle = new Motorcycle(70, 2 );
                break;
            case SCOOTER:
                vehicle = new Scooter(20, 2);
                break;
            case CAR:
                vehicle = new Car(150, 4);
                break;
            case BUS:
                vehicle = new Bus(100, 6);
                break;
        }

        return vehicle;
    }
}
