import org.junit.Test;
import transport.*;

import java.util.Calendar;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    VehicleFactory vehicleFactory;
    Vehicle vehicle;

    public VehicleFactoryTest() {
        vehicleFactory = new VehicleFactory();
    }

    @Test
    public void getMotorcycle() {
        vehicle = vehicleFactory.getTransport(TransportType.MOTORCYCLE);
        assertTrue(vehicle instanceof Motorcycle);
    }

    @Test
    public void getScooter() {
        vehicle = vehicleFactory.getTransport(TransportType.SCOOTER);
        assertTrue(vehicle instanceof Scooter);
    }

    @Test
    public void getCar() {
        vehicle = vehicleFactory.getTransport(TransportType.CAR);
        assertTrue(vehicle instanceof Car);
    }

    @Test
    public void getBus() {
        vehicle = vehicleFactory.getTransport(TransportType.BUS);
        assertTrue(vehicle instanceof Bus);
    }
}