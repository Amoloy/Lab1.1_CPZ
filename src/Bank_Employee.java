public class Bank_Employee extends Human {
    private Post_Bank post;

    public Bank_Employee(String Name, String Surname, String Sex, int Age, Post_Bank post) throws Exception {
        super(Name, Surname, Sex, Age);
        this.post = post;
    }

    public String Show_Post_Info(){
        return post.Show_Info();
    }

    public String getEmployeeInfo(){
        return(getHumanInfo() + " Post: " + post.Show_Info());
    }
}
