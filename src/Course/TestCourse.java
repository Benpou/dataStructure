package Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data structure");
        Course course2 = new Course("DB");
        Course course3 = new Course("KSS");
        Course course4 = new Course("algotitenm");
        Course course5 = new Course("programming");

        course1.addStudent("ken ho");
        course1.addStudent("ne yo");
        course1.addStudent("wowo poo");

        System.out.println( "Number of students are: " + course1.getNumberOfStudents() +
                " and they submit in : " + course1.getCourseName());

        String[] students = course1.getStudents();
        for (int i=0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

        for (int i=0; i <course1.getNumberOfStudents(); i++) {
            String studentName = "ken ho";
            if(students[i].equals(studentName)) {
                course1.dropStudent(studentName);
            }
        }

        System.out.println( "Number of students are: " + course1.getNumberOfStudents() +
                " and they submit in : " + course1.getCourseName());

    }
}
