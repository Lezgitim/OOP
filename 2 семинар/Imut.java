final class Imut {
    /**
 * Имя матери*/    
private String name;

/** Фамилия матери*/
private String lastname;

/** Год рождения матери*/
private String datebirght;

public Imut(String name, String lastname, String datebirght){
    this.name = name;
    this.lastname = lastname;
    this.datebirght = datebirght;
    
}


public String getName() {
    return name;
}

public String getLastname() {
    return lastname;
}

public String getDatebirght() {
    return datebirght;
}
@Override
public String toString() {
    return "Imut [name=" + name + ", lastname=" + lastname + ", datebirght=" + datebirght + "]";
}

}





