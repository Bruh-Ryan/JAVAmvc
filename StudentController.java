//////Controller studentController

class StudentController 
{
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollno(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollno();
    }

    public void setStudentMarks(int marks)
    {
        model.setMarks(marks);
    }
    public int getStudentMarks()
    {
        return model.getMarks();
    }


    public void updateView() {
        view.printStudsDetails(model.getName(), model.getRollno(),model.getMarks());
    }
}
