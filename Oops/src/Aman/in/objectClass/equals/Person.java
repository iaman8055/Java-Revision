package Oops.src.Aman.in.objectClass.equals;

import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person per=(Person) obj;
        return per.name.equals(name)&&
                per.age==age&&
                per.id==id;
    }
}
