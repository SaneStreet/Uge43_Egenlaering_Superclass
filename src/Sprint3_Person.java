public class Sprint3_Person implements Cloneable {
    String name;
    public Sprint3_Person(String name) {
        this.name = name;
    }
    public Sprint3_Person clone() {
        try {
            return (Sprint3_Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
