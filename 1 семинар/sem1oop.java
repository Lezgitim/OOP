

/**
 * sem1oop
 */
public class sem1oop {

    public static void main(String[] args) {
        
        roditeli roditeli = new roditeli("Андрей", "Иванов", "1755 год", "Ира", "Иванова", "1756");
        son son = new son("Василия", "Иванов", "1800");
        daughter daughter = new daughter("Василиса", "Иванова", "1801 год"); 
        
        System.out.println();
        System.out.println("Род Ивановых:");
        System.out.println(roditeli);
        System.out.println("                     ||");
        System.out.println(son);
        System.err.println(daughter);
        System.out.println();


cat cat = new cat("мяу");
men men = new men("Барсик");


        System.out.println(men);
        System.out.println(cat);


    }
}