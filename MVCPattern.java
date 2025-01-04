public class MVCPattern 
{
    public static void main(String[] args) {
        StudentModel model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Vikram Sharma");

        controller.updateView();
    }

    private static StudentModel retriveStudentFromDatabase() {
        StudentModel student = new StudentModel();
        student.setName("Lokesh Sharma");
        student.setRollno("15UCS157");
        student.setMarks(20);
        return student;
    }
}
