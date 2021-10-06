package homework2;

public class Dean  extends Professor implements Executive { //Lilit need a constructor


    private ArrayList<Professor> directReport; //Lilit needs to be one of the lists you've implemented, Tigran-fixed;

    public Dean(String name, String surname, int age, String gender, String email, double Salary, String Rank, ArrayList<String> Classes) {
        super(name, surname, age, gender, email,Salary,Rank,Classes);
    }


    @Override
    public void defineBudget() {

        System.out.println("Budget is defined");

    }

    @Override
    public void getDirectReports() {

        System.out.println("Got all reports");

    }

    @Override
    public void hireProfessor() {

        System.out.println("The professor is hired");

    }

    @Override
    public void fireProfessor() {
        System.out.println("The Professor if fired");

    }
}
