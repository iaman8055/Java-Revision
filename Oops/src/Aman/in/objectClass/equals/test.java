package Oops.src.Aman.in.objectClass.equals;

public class test {
    public static void main(String[] args) {
        Person person1=new Person("aman",21,1);
        Person person2=new Person("aman",21,1);

        if(person1.equals(person2)){
            System.out.println("EQUALS");
        }else {
            System.out.println("not equals");
        }
    }
}
