public abstract class Human implements Ihuman{
    protected String Name;
    protected String Surname;
    protected String Sex;
    protected int Age;

    public Human(String Name, String Surname, String Sex, int Age) throws Exception{
        this.Name = Name;
        this.Surname = Surname;
        this.Sex = Sex;
        if (Age < 14 || Age > 110) {
            throw new Exception("Age is not located between 14 and 110");
        }
        this.Age = Age;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getSurname() {
        return Surname;
    }

    @Override
    public String getSex() {
        return Sex;
    }

    @Override
    public int getAge() {
        return Age;
    }

    public String getHumanInfo() {
        return ("ФІО: " + Name + " " + Surname + " Sex: " + Sex + " Age: " + Age);
    }
}
