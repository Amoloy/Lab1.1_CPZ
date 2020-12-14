public class Program {
    public static void main(String args[]) {
        try {
            Cashier_Bank cashier = new Cashier_Bank(100);
            Director_Bank director = new Director_Bank(4000);

            Bank_Employee employee3 = new Bank_Employee("Zhack", "Fresko", "Male", 101,  cashier);
            Bank_Employee employee2 = new Bank_Employee("Petro", "Dyshlevyy", "Male", 40, director);
            Bank_Employee employee1 = new Bank_Employee("Stepa", "Neponyatnych", "Male", 21, cashier);

            System.out.println(employee1.getEmployeeInfo());
            System.out.println(employee2.getEmployeeInfo());
            System.out.println(employee3.getEmployeeInfo());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
