package homework2;

public abstract class Person { //Lilit need a constructor getters and setters, Tigran-fixed;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String email;


      public Person (String name, String surname, int age, String gender, String email){
          this.name = name;
          this.surname= surname;
          this.age=age;
          this.gender=gender;
          this.email=email;

      }

      public Person(){

      }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  void purchaseParkingPass(){


    }

}
