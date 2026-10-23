```java
import java.util.*;

public class treetypesifelsehi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("पहला नंबर डालो:");
        int a = sc.nextInt();

        System.out.println("दूसरा नंबर डालो:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a, b से बड़ा है");
        }
        else {
            System.out.println("b, a से बड़ा है");
        }

        System.out.println("तीसरा नंबर डालो:");
        int c = sc.nextInt();

        if (a > c) {
            System.out.println("a, c से बड़ा है");
        }
        else {
            System.out.println("c, a से बड़ा है");
        }
    }
}
```
