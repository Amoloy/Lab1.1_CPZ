public abstract class Post_Bank implements Ipost_bank {
    protected double Salary;

    public Post_Bank(double Salary){
        this.Salary = Salary;
    }

    @Override
    public String General_Info() {
        return "There are next variants: Director_Bank, Cashier_Bank";
    }

    @Override
    public String Show_Info() {
        return "";
    }

    @Override
    public double getSalary() {
        return Salary;
    }
}
