package BuilderPackage;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String university;

    private Student (){}

    public static Builder getBuilder(){
        return new Builder();
    }

    public Student(Builder b){
        //here we will add some validations and initialize the data members of student class
        if(Objects.nonNull(b.name)){
            this.name=b.name;
        }
        if(b.age>=18){
            this.age=b.age;
        }
        if(Objects.nonNull(b.university)){
            this.university=b.university;
        }
    }

    public static class Builder{
        private String name;
        private int age;
        private String university;

        public Builder getName() {
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder getAge() {
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder getUniversity() {
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
