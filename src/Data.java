class Data { int x;
}

class PrimitiveParamEx  {

    static void change(int x)   {
        x = 1000;
        System.out.println(x);
    }

    static void change2(Data d){
        d.x = 1000;
        System.out.println(d.x);
    }
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);        //10

        change(d.x);                    //d.x라는 변수가 아닌 변수 안에 있는 값을 복사 한 것.

        System.out.println(d.x);        //기본형 매개변수 결과 값.

        change2(d);                     //주소 자체에 들어가서 내용을 변경한 것

        System.out.println(d.x);        //참조형 매개변수의 결과 값.
    }
}
