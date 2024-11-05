import java.util.Scanner;

public class Demo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Complex[] complexes = new Complex[10];
        int complexCount = 0;

        int command = -1;
        while (command != 0) {
            System.out.println("0 => Stop, 1 => Create Complex, 2 => Create House, 3 => Create Flat");
            System.out.print("Oka buyruqni kiriting: ");
            command = scanner.nextInt();

            switch (command) {
                case 1 -> {
                    System.out.print("Oka complex nomini kiriting: ");
                    String complexName = scanner.next();
                    System.out.print("Complexdagi uylar sonini kiriting: ");
                    int numHouses = scanner.nextInt();

                    Complex complex = new Complex(complexName, numHouses);
                    complexes[complexCount++] = complex;
                    System.out.println("Complex shu nom bilan yaratildi: " + complexName);
                }
                case 2 -> {
                    if (complexCount == 0) {
                        System.out.println("Avval complex yarating");
                        continue;
                    }
                    System.out.print("Uy nomini kiriting: ");
                    String houseName = scanner.next();
                    System.out.print("Qavatlar sonini kiriting: ");
                    int numFloors = scanner.nextInt();
                    System.out.print("Podyezlar sonini kiriting: ");
                    int numEntrances = scanner.nextInt();

                    House house = new House(houseName, numFloors, numEntrances);

                    Complex currentComplex = complexes[complexCount - 1];
                    currentComplex.addHouse(house);
                    System.out.println("Uy shu nom bilan yaratildi: " + houseName);
                }
                case 3 -> {
                    System.out.print("Flat raqamini kiriting: ");
                    int flatNumber = scanner.nextInt();
                    Flat flat = new Flat(flatNumber);
                    System.out.println("Flat shu nom bilan yaratildi: " + flatNumber);
                }
                default -> System.out.println("Oka borib choy ichin!.");
            }
        }
    }
}
