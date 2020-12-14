public class Cashier_Bank  extends Post_Bank {
    public Cashier_Bank(double Salary){
        super(Salary);
    }

    @Override
    public String Show_Info() {
        return "Simple cashier";
    }
}
