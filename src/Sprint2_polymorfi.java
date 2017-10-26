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



    }
    //2.Hvad er polymorfi i Java? Vis eksempel i din kode.
    public void eat() {
        System.out.println("This Poly is great");
    }

    //3a.Hvad gør instanceof? Vis eksempel i din kode.
    //den checker om det er en ting (evt. int, eller en klasse som f.eks. hund)
    //Her checker den eksemple vist om
    public void doSomething(Number param) {
        if( param instanceof Double) {
            System.out.println("param is a Double");
        }
        else if( param instanceof Integer) {
            System.out.println("param is an Integer");
        }

        if( param instanceof Comparable) {
            //subclasses of Number like Double etc. implement Comparable
            //other subclasses might not -> you could pass Number instances that don't implement that interface
            System.out.println("param is comparable");
        }
    }



}
