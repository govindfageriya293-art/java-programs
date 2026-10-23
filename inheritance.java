class choudharysabh{
    String name1 = "purkharam";
}
class jaat extends choudharysabh{
    String name2 = "kivaram";
}

public class inheritance extends jaat {
public static void main(String[] args) {
    inheritance n = new inheritance();
    System.out.println("choudharysabh name is " + n.name1);
    System.out.println("jaat name is " + n.name2);
}
}