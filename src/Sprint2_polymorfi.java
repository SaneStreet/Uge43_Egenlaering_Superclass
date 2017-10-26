import java.util.ArrayList;

public class Sprint2_polymorfi {
    public static void main(String[] args) {
        //1.Vis et eksempel på at du overrider Object klassens toString() metode i din kode.
        Sprint2_poly_Person test = new Sprint2_poly_Person(23, "Mads");
        System.out.println(test.toString());

        //2.Hvad er polymorfi i Java? Vis eksempel i din kode.
        Sprint2_polymorfi test2 = new Sprint2_poly_Person(23, "Mads");//Note at der står Sprint_polymorfi istedet for person
        test2.eat();

        //Polymorfi er når vi kan tage sub classes og "samle" dem i
        Sprint2_polymorfi bucky[]=new Sprint2_polymorfi[2];
        bucky[0] = new Sprint2_poly_Person(10,"Hans");
        bucky[1]= new Sprint2_polymorfi();

        //3. Hvad er object casting i Java? Vis eksempel i din kode.
        //F.eks. hvis man havde sub class hund og kat, kan man kaste hund til at være kat og kat til at være hund.
        //andet eksempel:
        int trash = (int) 2.205; //her runder den ned
        System.out.println(trash);

        //3b. equals()
        String some = "some string";
        String other = "some string";
        //Den spørg i teorien bare om some er det samme som equal, hvor den viser true.
        boolean equal = some.equals(other);
        //Hvis man gør sådan her printer den false.
        boolean equal2 = some == other;

        //4. Arraylist
        //Først laves en arraylist med typen inden i <>.
        ArrayList<Integer> testArInt = new ArrayList<Integer>();
        testArInt.add(2); // her adder man en array til tablet med værdien 2, så array[0] = 2
        testArInt.add(14); // array[1] = 14
        testArInt.size(); // Viser size
        ArrayList<String> testArStr = new ArrayList<String>();
        testArStr.add("Mads");
        testArStr.clear();

        //5. Hvordan kan du forhindre, at en klasse kan udvides med subclasses? Vis i din kode.
        //Man kan gøre det hele til private eks. public class Sprint2_polymorfi{}
        //Man kan heller ikke extend en final class eller final method.


    }
    //2.Hvad er polymorfi i Java? Vis eksempel i din kode.
    public void eat() {
        System.out.println("This Poly is great");
    }

    //3a. Hvad gør instanceof? Vis eksempel i din kode.
    //den checker om det er en ting (evt. int, eller en klasse som f.eks. hund)
    //Her checker den eksemple vist om Number(et tal bruger skriver) param, er en Double eller Int
    public void doSomething(Number param) {
        if( param instanceof Double) {
            System.out.println("param is a Double");
        }
        else if( param instanceof Integer) {
            System.out.println("param is an Integer");
        }
    }






}
