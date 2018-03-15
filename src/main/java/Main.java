import transport.TransportType;
import transport.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle;
        for (String str: args) {
            int type = Integer.parseInt(str);
            if (type >= 0 && type < TransportType.values().length) {
                vehicle = vehicleFactory.getTransport(TransportType.values()[type]);
                System.out.println(vehicle);
            }
            else {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }

        }
    }
}
