import java.util.*;

// same name object in class ,,,,,,here is a and b class and there obeject name is same " void a"

class a {
    void a(int a, int b) {
        System.out.println(a + b);

    }
}

class b {
    void a(int a, int b) {
        System.out.println(a + b);
    }
}

public class overriding {

    public static void main(String args[]) {
        a s1 = new a();
        b s2 = new b();

        s1.a(12, 14);
        s2.a(13, 14);

    }

}
