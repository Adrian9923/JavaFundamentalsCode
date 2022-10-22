import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsPart2 {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
        public String getHometown(){
            return hometown;
        }

        public void setAge(int age){
            this.age = age;
        }
        public void setHometown(String hometown){
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scanner.next();
        while (!input.equals("end")){

            Student student = new Student(input, scanner.next(), scanner.nextInt(), scanner.next());

            Student foundStudent = null;
            for (int i = 0; i < students.size(); i++) {
                Student checkStudent = students.get(i);
                if (checkStudent.getFirstName().equals(student.getFirstName()) && checkStudent.getLastName().equals(student.getLastName())){
                   foundStudent = checkStudent;
                   break;
                }
            }
            if (foundStudent == null){
                students.add(student);
            }else {
                foundStudent.setAge(student.getAge());
                foundStudent.setHometown((student.getHometown()));
            }
            input = scanner.next();
        }
        String cityName = scanner.next();
        for (Student student : students) {
            if (cityName.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
