package Service.impls;

import java.util.List;

import Model.Teacher;
import Service.CommonService;
import Repository.TeacherRepository;

public class TeacherServiceImpl implements CommonService<Teacher> {
    private TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void add(Teacher teacher) {
        if (teacher != null){
            teacherRepository.save(teacher);
        }

    }

    @Override
    public void remove(Teacher teacher) {
        if (teacher != null){
            teacherRepository.remove(teacher);
        }

    }

    @Override
    public void edit(Teacher teacher) {
        if (teacher != null){
            teacherRepository.edit(teacher);
        }

    }

    @Override
    public String getAll(Teacher st) {
        return null;
        // TODO Auto-generated method stub
        
    }

    // @Override
//     public List getAll() {
//         return teacherRepository.getAllTeachers();
//     }
}
