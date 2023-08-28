import java.util.ArrayList;

public class Course {
        private String course = "Web Development: Java";
        private Teacher instructor = new Teacher("Carrie", "Jones", "Web Development", 2 );
        private ArrayList<Student> enrolledStudents = new ArrayList<>();
        public void addEnrolledStudents(Student student) {
                enrolledStudents.add(student);
        }

        public Course(String course, Teacher instructor, ArrayList<Student> enrolledStudents) {
                this.course = course;
                this.instructor = instructor;
                this.enrolledStudents = enrolledStudents;
        }

        System.out.println("\nStudents Enrolled in " + course ", taught by " + instructor ":" + enrolledStudents);
}
