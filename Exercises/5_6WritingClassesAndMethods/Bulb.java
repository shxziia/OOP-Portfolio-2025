public class Bulb {

    private boolean isOn;

    public Bulb() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb is turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb is turned off");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

}




