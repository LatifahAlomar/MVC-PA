public class MVCPatternDemo {
    public static void main(String[] args) {
 
       Student model  = retriveStudentFromDatabase();
 
       StudentView view = new StudentView();
 
       StudentController controller = new StudentController(model, view);
 
       controller.updateView();
 
    }
 
    private static Student retriveStudentFromDatabase(){
       Student student = new Student();
       student.setName("mihaf");
       student.setRollNo("20");
       return student;
    }
 }