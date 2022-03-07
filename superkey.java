import java.util.*;

class animal {
    String color = "red";
}

class ani extends animal {

    String color = "white";

    void dog() {
        System.out.println(color);

        // super key is use for perent class variable name like here variable "color" is
        // same in both class so when we compile the code then runs a bottemest variable
        // here is "white" but when we use super key then it run a perent variable like
        // here perent variable is "color = red" so print the red when we use the super
        // key

        System.out.println(super.color);
    }

}

public class superkey {
    public static void main(String args[]) {
        ani s1 = new ani();

        s1.dog();
    }

}
