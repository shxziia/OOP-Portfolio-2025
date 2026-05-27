public class Nurse {
    public String name;
    public int patients;

    public Nurse(String name, int patients) {
        this.name = name;
        this.patients = patients;

        System.out.println("Nurse " + this.name + " has " + this.patients + " patients");
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", patients=" + patients +
                '}';
    }
}

