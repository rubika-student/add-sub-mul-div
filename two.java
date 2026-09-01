class Two {

    // add two numbers by static method
    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int c, int d) {
        return c - d;
    }
    static int mul(int a, int b) {
        return a + b;

    }
    static int div(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {


        int sum = add(10, 20);
        int minus = sub(20,10);
        int multi = mul(10,20);
        int divide = div(20,10);
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(divide);
    }
}