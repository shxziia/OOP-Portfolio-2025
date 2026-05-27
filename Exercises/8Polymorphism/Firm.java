public class Firm {
    public static void main(String[] args) {

        Employee manager = new Employee("Elisa", "Manager");
        Employee developer = new Employee("Hannah", "Developer");
        Employee assistant = new Employee("Nevra", "Assistant");


        System.out.println(manager.getName() + " is a " + manager.getRole() + " and has " + manager.getVacationDaysRemaining() + " vacation days.");
        System.out.println(developer.getName() + " is a " + developer.getRole() + " and has " + developer.getVacationDaysRemaining() + " vacation days.");
        System.out.println(assistant.getName() + " is an " + assistant.getRole() + " and has " + assistant.getVacationDaysRemaining() + " vacation days.");

        System.out.println(manager.takeVacation(5));
        System.out.println(developer.takeVacation(12));
        System.out.println(assistant.takeVacation(14));
        System.out.println(assistant.takeVacation(7));

        System.out.println("After vacation, " + manager.getName() + " has " + manager.getVacationDaysRemaining() + " vacation days left.");
        System.out.println("After vacation, " + developer.getName() + " has " + developer.getVacationDaysRemaining() + " vacation days left.");
        System.out.println("After vacation, " + assistant.getName() + " has " + assistant.getVacationDaysRemaining() + " vacation days left.");
    }
}

