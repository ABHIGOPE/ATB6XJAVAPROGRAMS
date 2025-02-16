package B_May_Code.ex_14052024;

import java.util.*;

public class Person {
    String name;
    int age;

    //Parameterized constructor
    Person(String name, int age){
    this.name=name;
    this.age=age;
    }

    //Copy Contructor
    Person(Person Person){
        this.name=Person.name;
        this.age=Person.age;
    }

    public static void main(String[] agrs){
     Person person1= new Person("Abhi",30);
     System.out.println(person1.name +" is " +person1.age+ " years  old");

     Person person2=new Person(person1);
        System.out.println(person2.name +" is " +person2.age+ " years  old");


    }}