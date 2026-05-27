public class Doctor {
    public String name;
    public String specialism;

    public Doctor(String name, String specialism){

        this.name = name;
        this.specialism = specialism;
        System.out.println("Doctor " + this.name + " specializes in " + this.specialism);

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialism='" + specialism + '\'' +
                '}';
    }
}
