public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, StudentPractice.
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String aFirstName) {
            this.firstName = aFirstName;
        }
        public String getLastName() {
        return lastName;
        }
        public void setLastName(String aLastName) {
        this.lastName = aLastName;
        }
        public String getSubject() {
        return subject;
        }
        public void setSubject(String aSubject) {
        this.subject = aSubject;
        }
        public int getYearsTeaching() {
            return yearsTeaching;
        }
        public void setYearsTeaching(int numYearsTeaching) {
            this.yearsTeaching = numYearsTeaching;
        }

        public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }
    }

