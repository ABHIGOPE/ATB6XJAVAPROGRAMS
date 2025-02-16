package B_May_Code.ex_30052024;

import java.util.Comparator;

class SortByAgeAsc implements Comparator<Student3>{

    @Override
    public int compare(Student3 o1, Student3 o2) {
        return  Integer.compare(o1.getAge(), o2.getAge());
    }
    }

class SortByAgeDsc implements Comparator<Student3>{

    @Override
    public int compare(Student3 o1, Student3 o2) {
        return  Integer.compare(o2.getAge(), o1.getAge());
    }
}

class SortByNamAsc implements Comparator<Student3>{

    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNamDsc implements Comparator<Student3>{

    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o2.getName().compareTo(o1.getName());
    }
}


public class Student3{
    String name;
    Integer age;

    public Student3(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}