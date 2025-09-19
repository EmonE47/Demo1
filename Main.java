import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        demo_class1 obj1 = new demo_class1();
        obj1.display();
        demo_class2 obj2 = new demo_class2();
        obj2.show();
        System.out.println("Emon vai");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        String greeting = myScanner.nextLine();
        System.out.println("Your name is: " + name + greeting);
        myScanner.close();
        System.out.println("Emon is name of Emon");
    }
}
