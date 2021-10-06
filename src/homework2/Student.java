package homework2;

public class Student extends Person {

private int studentId;
private String grade;
private String major;
private String status;
private ArrayList<String> Classes;


//Default Constructor

 Student(){



 }
 //Constructor

     Student(String name, String surname, int age, String gender, String email,int studentId, String grade, String major, String status, ArrayList <String> Classes){
               super(name,surname,age,gender,email);
               this.studentId=studentId;
               this.grade=grade;
               this.major=major;
               this.status=status;
               this.Classes=Classes;
         //Lilit need a super for Person, Tigran - fixed;

    }


   public boolean isEligibleToEnroll(){

    return true;
}

    @Override
    public void purchaseParkingPass(){

        System.out.println("Parking Pass is purchased");
    }




    public  ArrayList<String> getClassesTaken(ArrayList<String> Classes){
    this.Classes=Classes;

    return Classes;
}

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setClasses(ArrayList<String> classes) {
        Classes = classes;
    }
}
