import BuilderPackage.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("making Student class with builder design pattern!");
        Student stud=Student.getBuilder()
                .setName("Saptarshi")
                .setAge(28)
                .setUniversity("WBUT")
                .build();
        System.out.println("Final Student class");
        System.out.println(stud.toString());
    }
}