public class Sprint3_Sub extends Sprint3_Abstract {
    public static void main(String[] args) {
        //1.
        Sprint3_Abstract test = new Sprint3_Sub();
        System.out.println(test.add(2,2));
    }

    //1.
    @Override
    public int add(int b, int a) {
        return super.add(b, a);
    }
}
