package homework2;

public class Professor extends Person { //Lilit need a constructor getters and setters, Tigran - fixed;

    private double Salary;
    private String Rank;
    private ArrayList<String>Classes;


    public Professor(){

    }

    public Professor(String name, String surname, int age, String gender, String email, double Salary, String Rank, ArrayList<String> Classes) {
        super(name, surname, age, gender, email);
        this.Salary=Salary;
        this.Rank=Rank;
        this.Classes=Classes;
    }


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public ArrayList<String> getClasses() {
        return Classes;
    }

    public void setClasses(ArrayList<String> classes) {
        Classes = classes;
    }
}
