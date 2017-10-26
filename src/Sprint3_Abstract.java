import java.lang.*;
public abstract class Sprint3_Abstract implements Cloneable{
    //1. Hvad er en abstract class? Eksempel i kode og i UML.
    // Man kan ikke køre Abstract class, men man kan godt subclasse dem.
    //Den ser sådan her ud:
    //abstract void moveTo(double deltaX, double deltaY);
    //Abstract burde kun blive brugt for ting der ens for alle subclass, f.eks. til dyr er sov() el. tælBen(). Hvor bjæf er specifikt for hunde, skal den ikke være abstract.
    public int add(int b, int a) {
        return a+b;
    }

    //2.Interface
    //Et interface er f.eks. on/off på et tv. Så er det et interface mellem dig og tv'et
    //Her er det et eks. på en tænd sluk knap
    void turnOffOn(String onoff){
        boolean power;
        if(onoff == "on" ){ power = true;}
        else if (onoff == "off"){ power = false;}
    }

    //3. Hvad  bruges Comparable interface til i Java? Eksempel i kode og i UML.
    //Du comparer dem, altså om den ene er større end den anden.
    //Det gør den ved navn.compareTo(navn2);
    //Den bestemmer hvilken er størst/rækkefølge.
    //Kan gøres ved hjælp af if else statements


    //4. Hvad  bruges Clonable interface til i Java? Eksempel i kode og i UML.
    //Man kloner "bare" et object eks.
    //husk at implement Cloneable.
    //husk clone classen i Sprint3_person.java
    public static void main(String[] args) {
        Sprint3_Person testPerson = new Sprint3_Person("jens");
        System.out.println(testPerson.name);
        Sprint3_Person testPClone = testPerson.clone();
        System.out.println(testPClone.name);

    }
}
