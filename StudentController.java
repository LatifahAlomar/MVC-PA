
public class StudentController{

    private Student model ;
    private StudentView view ;

    public StudentController(){

    }

    public String getStudentName(){

        return model.getName();
    }

    public void setStudentName(String name){

        model.setName(name);

    }

    public String getStudentRollNo(){

        return model.getRollNo();
    }

    public void setStudentRollNo(String rollNo){

        model.setRollNo(rollNo);
    }

    public void updateView(){

        view.printStudentDetails();
    }



  
    
}