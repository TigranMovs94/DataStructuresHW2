package homework2;/*
Author: Tigran Movsesyan
Email: tigran_movsesyan@edu.aua.am
Last Changed: 10/09/2021
*/
/**
 * @SMP = University Management Project
 */

public class University {

    ArrayList<Student> students = new ArrayList<>();  //Lilit needs to be one of the lists you've implemented  //Tigran-fixed
    ArrayList<Professor> professors = new ArrayList<>();//Lilit needs to be one of the lists you've implemented //Tigran -fixed
    SingleLinkedList<Person> academicBoard= new SingleLinkedList<Person>();//Lilit needs to be one of the lists you've implemented //Tigran-fixed
    DoubleLinkedListDeque<String> recentAnnouncements = new DoubleLinkedListDeque<String>();



          //Add announcement
          public void addAnnouncement(String announcement){
              //If number of announcements is less than 10, add new announcement
              if(recentAnnouncements.size()<10) {

                  recentAnnouncements.pushFront(announcement);
              }

              //If number of announcements if more than 10, remove the oldest announcements until the number of announcements is less than 10
              if(recentAnnouncements.size()>10){

                  while (recentAnnouncements.size()<10){
                      removeAnnouncement();
                  }

                  recentAnnouncements.pushFront(announcement);
              }

          }

          //Remove announcement

          public void removeAnnouncement(){

              //We consider the oldest announcements the ones from back, therefore we delete from back.
              //Otherwise, we can use popFront(); function which will delete from front.
              recentAnnouncements.popBack();

          }



    public void getUnderGraduates (){


        String [] listOfUnderGraduates ={"Aramais Chmuryan","Vladislava Hakobjanyan"};


        System.out.println("Our Undergraduates are: ");

        for (int i = 0; i <listOfUnderGraduates.length ; i++) {

            System.out.println(listOfUnderGraduates[i]+" ");
        }


    }


    public void  getGraduates (){

        String [] listOfGraduates = {"Gexanush Vladikovna","Vardanush Akopovna"};
        System.out.println("Our Graduates are: ");

        for (int i = 0; i <listOfGraduates.length ; i++) {

            System.out.println(listOfGraduates[i]+" ");
        }

    }


    public static void main(String[] args) throws Exception {












    }

}
