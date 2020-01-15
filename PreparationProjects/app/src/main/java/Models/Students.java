import java.util.ArrayList;
import java.util.List;

public class Students {

    List<Models.Student> students = new ArrayList();

    public Students()
    {
        for(int i=0; i<students.size(); i++)
        {

        }
    }

    public void insert_Student(Models.Student model)
    {

    }

    public List<Models.Student> getStudents()
    {
        return students;
    }

    public Models.Student getStudentById(int Id)
    {
        Models.Student  student = null;
        for(int i=0; i<= students.size(); i++)
        {
            if(students.get(i).getStudentId() == Id)
            {
                student = students.get(i);
            }
        }
        return student;
    }


}
