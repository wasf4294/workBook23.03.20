public class ReferenceParamEx2 {

    static void change(int[] x){
        x[0] = 1000;
        System.out.println(x[0]);
    }

    static void change2(int y){
        y = 100;
        System.out.println(y);
    }
    public static void main(String[] args) {
        int[] x = {10};
        int y = 20;
        System.out.println(x[0]);

        change(x);

        System.out.println(x[0]);

        System.out.println(y);

        change2(y);

        System.out.println(y);
    }
}
