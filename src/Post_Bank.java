public abstract class Post_Bank implements Ipost_bank {
    protected double Salary;

    public Post_Bank(double Salary){
        this.Salary = Salary;
    }
    //метод отримання загальної інформації про клас інформації
    @Override
    public String General_Info() {
        return "There are next variants: Director_Bank, Cashier_Bank";
    }
    //метод який треба перегрузити для отримання інфи
    @Override
    public String Show_Info() {
        return "";
    }
    //Метод отримання зар. плати
    @Override
    public double getSalary() {
        return Salary;
    }
}
