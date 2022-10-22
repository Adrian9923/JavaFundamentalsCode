import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student{
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

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.next();
        while (!input.equals("end")){
          Student student = new Student(input, scanner.next(), scanner.nextInt(), scanner.next());

          int studentIndex = -1;
            for (int i = 0; i < students.size(); i++) {
               Student checkStudent = students.get(i);
               if(checkStudent.getFirstName().equals(student.getFirstName()) && checkStudent.getLastName().equals(student.getLastName())){
                   studentIndex = i;
                   break;
               }
            }
            if(studentIndex == -1) {
                students.add(student);
            }else{
                students.set(studentIndex, student);
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
