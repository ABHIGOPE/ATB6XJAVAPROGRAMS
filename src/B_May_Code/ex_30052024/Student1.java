package B_May_Code.ex_30052024;

public class Student1 implements Comparable<Student1> {


        String name1;
        Integer age;
        public Student1(Integer age, String name1) {
            this.age = age;
            this.name1 = name1;
        }


    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
        public String toString() {
            return "Student1{" +
                    "age=" + age +
                    ", name1='" + name1 + '\'' +
                    '}';
        }


//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//    }

        @Override
        public int compareTo(Student1 o) {
            return CharSequence.compare(this.name1, o.name1);
        }
    }