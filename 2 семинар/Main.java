/**
 * Описать неизменяемый класс (Неизменяемость должна сохранятся при любых обстоятельствах).
 */
public class Main {

    public static void main(String[] args) {
        
        Imut imut = new Imut("Вася", "Иванов", "1991");
        System.out.println(imut);

        String name = imut.getName();
        String lastname = imut.getLastname();
        String dateebirght = imut.getDatebirght();

        name = "Андрей";
        lastname = "Петров";
        dateebirght = "1555";

        System.out.println(imut.getName());
        System.out.println(imut.getLastname());
        System.out.println(imut.getDatebirght());




    }
}