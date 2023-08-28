public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, StudentPractice.
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public int getStudentId() {
                return studentId;
        }
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }
        public int getNumberOfCredits() {
                return numberOfCredits;
        }
        public void setNumberOfCredits(int numberOfCreditss) {
                this.numberOfCredits = numberOfCredits;
        }
        protected double getGpa() {
                return gpa;
        }
        protected void setGpa(double gpa) {
                this.gpa = gpa;
        }
        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
}
