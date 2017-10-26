public class Sprint2_poly_Person extends Sprint2_polymorfi {
    //1.Vis et eksempel på at du overrider Object klassens toString() metode i din kode.
    int alder;
    String navn;

    Sprint2_poly_Person(int alder, String navn){
        this.alder = alder;
        this.navn = navn;
    }

    @Override
    public String toString() {
        return alder+" "+navn;
    }

    //2.Hvad er polymorfi i Java? Vis eksempel i din kode.
    public void eat() {
        System.out.println("This Person is great");
    }


}
