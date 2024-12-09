import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (6 > 3) {
            System.out.println("Hello, World!");
        }

        while (true) {
            Scanner nameIN = new Scanner(System.in);
            System.out.println("Name: ");
            String name = nameIN.nextLine();
            Scanner passIN = new Scanner(System.in);
            System.out.println("Password: ");
            String pass = nameIN.nextLine();

            if (name.equals("noname") && pass.equals("nopass")) {
                break;
            } else {
            }
        }

        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, World!");
        }

        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Number: ");
            int a = in.nextInt();
            if (a <= 5) {
                System.out.println("Högre än 5!");
            } else {

            }
        }

        Scanner scan = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("Number please: ");
                int num = scan.nextInt();
                scan.nextLine();

                System.out.println("the number is " + num);
                break;
            } catch (Exception error) {
                scan.nextLine();
                System.out.println("That is not a numnber");
            }
        }

        int slumptal = (int) (Math.random() * 10) + 1;
        System.out.println("Ett slumpmässigt tal mellan 1 och 10: " + slumptal);
        while (true){
            Scanner scanner = new Scanner(System.in);


            if ()
        }
    }
}