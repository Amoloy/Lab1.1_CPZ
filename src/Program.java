public class Program {
    public static void main(String args[]) {
        try {
            Cashier_Bank cashier = new Cashier_Bank(10);
            Director_Bank director = new Director_Bank(1000);

            Bank_Employee employee1 = new Bank_Employee("Petro", "Dyshlevyy", "Female", 300, cashier);
            Bank_Employee employee2 = new Bank_Employee("Stepa", "Duryk", "Male", 21, cashier);
//            Bank_Employee employee3 = new Bank_Employee("Noname", "Gnyda", "Male", 13, cashier);

            System.out.println(employee1.getEmployeeInfo());
            System.out.println(employee2.Show_Post_Info());
//            System.out.println(employee3.Show_Post_Info());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
