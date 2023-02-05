package Repository;

import Model.Student;

import java.io.FileWriter;
import java.util.List;

public class StudentRepository {
    public void save(Student student){
        try(FileWriter fileWriter = new FileWriter("students.txt")){
            fileWriter.write(student.toString());
            

        }catch (Exception exception){}
    }
    public void remove(Student student){
        try(FileWriter fileWriter = new FileWriter("students.txt")){
            // fileWriter.flush();

        }catch (Exception exception){}
    }

    public void edit(Student student){
        try(FileWriter fileWriter = new FileWriter("students.txt")){
            fileWriter.write(student.toString());

        }catch (Exception exception){}

    }

    public String getAllStudents(Student student){
        return student.toString();
    }
}
