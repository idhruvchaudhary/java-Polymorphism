public class overloading {

    // overloading means = in smae class object name same but inner value int is not
    // same

    void fun(int a, int b) {
        System.out.println("roll =" + a + "    class=" + b);
    }

    void fun(int a, int b, int c) {

        System.out.println("roll =" + a + "    class=" + b + "    div=" + c);

    }

    public static void main(String args[]) {
        overloading s1 = new overloading();
        s1.fun(23, 34);
        s1.fun(23, 45, 56);
    }

}
