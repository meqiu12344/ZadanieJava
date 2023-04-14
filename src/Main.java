import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie;
        Set<String> names = new HashSet<>();

        while (true){
            System.out.print("Imie: ");
            imie = scanner.next();

            if(imie.equals("-")){
                break;
            }
            names.add(imie);
        }

        System.out.println("Unikalne imiona: " + names.size());

    }
}