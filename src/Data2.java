public class Data2 {
    int x;
}

class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 d1 = new Data2();

        d1.x = 10;

        Data2 d2 = copy(d1);
        System.out.println(d1.x);
        System.out.println(d2.x);
    }

    static Data2 copy(Data2 d)  {
        Data2 tmp = new Data2();
        tmp.x = d.x;

        return tmp;
    }
}
