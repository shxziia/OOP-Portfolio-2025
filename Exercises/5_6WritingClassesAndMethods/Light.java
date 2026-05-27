public class Light {
    public static void main(String[] args) {

        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        System.out.println("Initial Status: ");
        System.out.println("bulb1: " + bulb1.getStatus());
        System.out.println("bulb2: " + bulb2.getStatus());

        bulb1.turnOn();
        bulb2.turnOn();

        System.out.println("\nAfter Bulbs Turned On: ");
        System.out.println("bulb1: " + bulb1.getStatus());
        System.out.println("bulb2: " + bulb2.getStatus());

        bulb1.turnOff();

        System.out.println("\nAfter Bulb1 Turned Off: ");
        System.out.println("bulb1: " + bulb1.getStatus());
        System.out.println("bulb2: " + bulb2.getStatus());

    }
}
