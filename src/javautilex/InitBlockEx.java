package javautilex;

class InitBlock{
    int a = 5;
    static int b = 7;
    final int C;

    {
        System.out.println("초기화 블록");
        System.out.printf("[0-1]a: %d %n", a);
        a = 15;
        System.out.printf("[0-1]a: %d %n", a);
        C = 77;
        System.out.println("C: "+ C);
    }
    static{
        System.out.println("static 초기화 블록");
        System.out.printf("[1-1]b: %d %n", b);
        b = 17;
        System.out.printf("[1-2]b: %d %n", b);
    }

    InitBlock(){
        System.out.println("생성자");
        System.out.printf("[2-1]a: %d, b: %d %n", a, b);
        a = 25;
        b = 27;
        System.out.printf("[2-2]a: %d, b: %d %n", a, b);
//        C = 77;
//        System.out.println("C: "+ C);
    }

    public void setA(int a){
        System.out.println("setA메소드_0: " + this.a);
        this.a = a;
        System.out.println("setA메소드_1: " + this.a);
    }

    public static void setB(int b){
        System.out.println("static setB메소드_0: " + InitBlock.b);
        InitBlock.b = b;
        System.out.println("static setB메소드_1: " + InitBlock.b);
    }

}

public class InitBlockEx {
    public static void main(String[] args) {
        InitBlock ib = new InitBlock();
        ib.setA(35);
        InitBlock.setB(37);
    }
}
