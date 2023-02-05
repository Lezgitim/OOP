package Service.impls;

import Model.Student;
import Service.CommonService;
import Repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements CommonService<Student> {
    private StudentRepository repository = new StudentRepository();
    private Student student;

    @Override
    public void add(Student student) {
        if (student != null) {
            repository.save(student);
        } else {
            System.out.println("Student is null!");
        }


    }

    @Override
    public void remove(Student student) {
        if (student != null){
            repository.remove(student);
        }


    }

    @Override
    public void edit(Student student) {
        if (student != null){
            repository.edit(student);
        }

    }

    @Override
    public String getAll(Student student) {
        return repository.getAllStudents(student);

        
    }

  


   

   
}
