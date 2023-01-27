

/**
 * sem1oop
 */
public class Sem1oop {

    public static void main(String[] args) {
        
        Roditeli roditeli = new Roditeli("Андрей", "Иванов", "1755 год", "Ира", "Иванова", "1756");
        Son son = new Son("Василия", "Иванов", "1800");
        Daughter daughter = new Daughter("Василиса", "Иванова", "1801 год"); 
        
        System.out.println();
        System.out.println("Род Ивановых:");
        System.out.println(roditeli);
        System.out.println("                     ||");
        System.out.println(son);
        System.err.println(daughter);
        System.out.println();


Cat cat = new Cat("мяу");
Men men = new Men("Барсик");


        System.out.println(men);
        System.out.println(cat);


    }
}