import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (6>3){
            System.out.println("Hello, World!");
        }

        Scanner nameIN = new Scanner(System.in);
        String name = nameIN.nextLine();
        Scanner passIN = new Scanner(System.in);
        String pass = nameIN.nextLine();

        if (name == "noname" && pass == "nopass" ){

        }

        for (int i = 0; i < 32; i++){
            System.out.println("Hello, World!");
        }
    }
}