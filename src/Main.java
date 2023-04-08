import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("data.txt", true)); BufferedReader in = new BufferedReader(new FileReader("data.txt"))){
            if(in.readLine() != null){
                out.newLine();
            }
            Scanner input = new Scanner(System.in);
            String data;
            String name;
            String age;
            System.out.println("Enter your name: ");
            name = input.next();
            System.out.println("Enter your age: ");
            age = input.next();
            data = name + ", " + age + " years.";
            out.write(data);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}