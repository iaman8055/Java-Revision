package Oops.src;

public class Course {
    String courseName;
    // String studentName;
    int enrollments;
    boolean isEnrolled;
    static int maxCapacity=100;
    String[] enrolledStudents;


    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents=new String[maxCapacity];

    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        if(isEnrolled){
            System.out.println("Student is already enrolled");
        }else {
            isEnrolled=true;
            System.out.println("enjoy the course");
        }
    }
    void unenrollStudent(String studentName){
        System.out.println("student removed");
        String 
        enrollments--;
        if(isEnrolled){
            this.isEnrolled=false;
            System.out.println("Hope you enjoyed the course");
        }
    }

    static void setmaxcapacity(){
        Course.maxCapacity=maxCapacity;
    }
}
