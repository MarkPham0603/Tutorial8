import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tutorial {
    public static void main(String[] args) throws IOException {

        //EX 1:
        String name,address;
        int age;

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("src/users.txt"),true);

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter address:");
        address = sc.nextLine();

        pw.println(name + "," + age + "," + address);

        pw.flush();
        pw.close();
    }

}
