import java.util.Scanner;

public class PetrolCalculator {
    public void calculateLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество действий => ");
        int iterationsCount = scanner.nextInt();
        for (int counter = 0; counter < iterationsCount; counter++) {
            System.out.print("Введите тип топлива: 1 - АИ-92, 2 - АИ-95 => ");
            int petrolType = scanner.nextInt();
            System.out.print("Введите количество литров => ");
            double volume = scanner.nextDouble();
            if (petrolType == 1) {
                double ai92Price = new Ai92Calculator().calculateLoop(volume);
                System.out.println("Стоимость " + volume + " литров АИ-92 = " + ai92Price + "₽");
            } else if (petrolType == 2) {
                double ai95Price = new Ai95Calculator().calculateLoop(volume);
                System.out.println("Стоимость " + volume + " литров АИ-95 = " + ai95Price + "₽");
            }
        }
    }

    public static void main(String[] args) {
		System.out.println("Введённые аргументы:" + args);
        new PetrolCalculator().calculateLoop();
    }
}
