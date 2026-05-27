public class Cleaner {
    public String name;
    public String department;

    public Cleaner(String name, String department) {
        this.name = name;
        this.department = department;
        System.out.println("Cleaner " + this.name + " of " + this.department + " is sweeping");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
