
public class roditeli {
    
/**
 * Имя матери*/    
protected String name;

/** Фамилия матери*/
protected String lastname;

/** Год рождения матери*/
protected String datebirght;

/** Имя отца*/    
protected String name2;

/** Фамилия отца*/
protected String lastname2;

/** Год рождения отца*/
protected String datebirght2;


public roditeli(String name, String lastname, String datebirght, String name2, String lastname2, String datebirght2) {
    this.name = name;
    this.lastname = lastname;
    this.datebirght = datebirght;
    this.name2 = name2;
    this.lastname2 = lastname2;
    this.datebirght2 = datebirght2;
}

public roditeli(String name, String lastname, String datebirght){
    this.name = name;
    this.lastname = lastname;
    this.datebirght = datebirght;
}

@Override
public String toString() {
    return "Отец: [Имя=" + name + ", Фамилия=" + lastname + ", год рождения=" + datebirght +"] \nМать: Имя=" + name2
            + ", Фамилия=" + lastname2 + ", год рождения=" + datebirght2 + "]";
}


}
