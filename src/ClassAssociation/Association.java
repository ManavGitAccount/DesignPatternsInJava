package ClassAssociation;

public class Association {
    public static void main(String[] args) {
        Bank myBank = new Bank("SBI");
        Employee myEmployee = new Employee("Max Vialli");

        System.out.println(myEmployee.getEmployee() + " is an employee of "
        + myBank.getBankName());
    }
}
