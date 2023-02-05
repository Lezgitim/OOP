package View;

import java.util.List;
import java.util.Scanner;

import Model.Student;
import Model.Teacher;
import Service.CommonService;
import Service.impls.StudentServiceImpl;
import Service.impls.TeacherServiceImpl;
//Меню
public class Viewm{
    
    private String name;

    private Float kurs;

    private int year;

    private List group;

    public void getMenu() {
        System.out.println("Вы хотите 1.Добавить, 2. Удалить, 3. Изменить, 4. Прочитать?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a == 1){
            System.out.println("Кого вы хотите добавить?:\n 1. Учителя.\n2. Студента.");
            int b = scanner.nextInt();
            if(b == 2){
                StudentServiceImpl studentService = new StudentServiceImpl();
                System.out.println("Введите имя студента: ");
                Scanner scanner2 = new Scanner(System.in);
                
                String name = scanner2.nextLine();
                
                System.out.println("Введите курс: ");
                
                Float kurs =scanner2.nextFloat();
                System.out.println("Введите год: ");
                int year = scanner.nextInt();
                studentService.add(new Student(name, kurs, year));
            }

            if(b == 1){
                TeacherServiceImpl teacherService = new TeacherServiceImpl();
                System.out.println("Введите имя учителя: ");
                Scanner scanner2 = new Scanner(System.in);
                String name = scanner2.nextLine();
                teacherService.add(new Teacher(name, null));
            }

        }

        if(a == 2){
            StudentServiceImpl studentService = new StudentServiceImpl();
            studentService.remove(new Student(name, a, year));
            System.out.println("Студент удален.");
        }

        if(a == 3){
            StudentServiceImpl studentService = new StudentServiceImpl();
            System.out.println("Введите новое имя студента:");
            Scanner scanner3 = new Scanner(System.in);
            String name = scanner3.nextLine();
            studentService.edit(new Student(name, a, a));
        }

        if(a == 4){
            StudentServiceImpl studentService2 = new StudentServiceImpl();
           studentService2.getAll(new Student(name, a, a));
        }


    }

    

}
