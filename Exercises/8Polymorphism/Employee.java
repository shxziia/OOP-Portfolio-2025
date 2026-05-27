public class Employee {
    private String name;
    private String role;
    private int vacationDays;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        this.vacationDays = getVacationDays();
    }
    private int getVacationDays() {
        switch (role) {
            case "Manager":
                return 30;
            case "Developer":
                return 20;
            case "Assistant":
                return 15;
            default:
                return 10;
        }
    }

    public String takeVacation(int days) {
        if (days <= vacationDays) {
            vacationDays -= days;
            return name + " is taking " + days + " days off. Remaining vacation days: " + vacationDays;
        } else {
            return name + " does not have enough vacation days. Available: " + vacationDays;
        }
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getVacationDaysRemaining() {
        return vacationDays;
    }
}
