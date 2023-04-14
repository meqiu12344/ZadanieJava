import java.util.*;

public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
    }

    public static void zad1(){
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

    // -------------------------------------------------------- //

    public static void zad2(){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> imiona = new HashMap<>();

        String imieKlucz, imieWartosc, wyszukiwaneImieKlucz;

        while (true){
            System.out.print("Imię klucz: ");
            imieKlucz = scanner.next();

            System.out.print("Imię wartość: ");
            imieWartosc = scanner.next();

            if(imieKlucz.equals("-") || imieWartosc.equals("-")){
                System.out.print("Podaj szukane imie: ");
                wyszukiwaneImieKlucz = scanner.next();

                for(Map.Entry<String, String> ele : imiona.entrySet()) {
                    if(ele.getKey().equals(wyszukiwaneImieKlucz)){
                        System.out.println("Słowo klucz: " + ele.getKey() + " / Słowo wartość: " + ele.getValue());
                    }
                }

                break;
            }

            imiona.put(imieKlucz, imieWartosc);
        }
    }
}