public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jeeva", "1001", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Priya");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
