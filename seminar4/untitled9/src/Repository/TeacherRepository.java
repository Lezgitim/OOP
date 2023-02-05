package Repository;

import Model.Teacher;

import java.io.FileWriter;
import java.util.List;

public class TeacherRepository {
    public void save(Teacher teacher){
        try(FileWriter fileWriter = new FileWriter("students.txt")){
            fileWriter.write(teacher.toString());
            fileWriter.flush();

        }catch (Exception exception){}
    }
    public void remove(Teacher teacher){}

    public void edit(Teacher teacher){}

    public List getAllTeachers(){
        return null;
    }

}
