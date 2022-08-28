package Inheritance;

public class RunTest {
    public static void main (String[] args) {
        Bus b = new Bus ();
        b.StoptheBus();
        b.GetInToBus();
        b.TakeYourseat();
        b.numberOfPassenger();
        b.numberOfWheels();
        b.speedOfVehicle();
        b.TicketPricePerPassenger();

        System.out.println("Mercedes");
        Mercedes m = new Mercedes();
        m.StoptheBus();
        m.GetInToBus();
        m.TakeYourseat();
        m.numberOfPassenger();
        m.numberOfWheels();
        m.speedOfVehicle();
        m.TicketPricePerPassenger();
        m.ColorOfMIsBlue();


        System.out.println("Volvo");
        Volvo v = new Volvo();
        v.StoptheBus();
        v.GetInToBus();
        v.TakeYourseat();
        v.numberOfPassenger();
        v.numberOfWheels();
        v.speedOfVehicle();
        v.TicketPricePerPassenger();
        v.ColorOfVIsRed();
    }
}
