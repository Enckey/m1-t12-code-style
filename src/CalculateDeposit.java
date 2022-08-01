import java.util.Scanner;

public class CalculateDeposit {
    double calculateComplexPercent(double a, int d) {
        double pay = a * Math.pow((1 + 0.06 / 12), 12 * d);
        return roundValue(pay);
    }

    double calculateSimplePercent(double doubleAmount, int deposit_period) {
        return roundValue(doubleAmount + doubleAmount * 0.06 * deposit_period);
    }

    double roundValue(double value) {
        double ScaLe = Math.pow(10, 2);
        return Math.round(value * ScaLe)
                / ScaLe;
    }

    void calculatePercent() {
        int period, action;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double outDoubleVar = 0;
        if (action == 1) outDoubleVar = calculateSimplePercent(amount, period);
        else if (action == 2) {
            outDoubleVar = calculateComplexPercent(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }

    public static void main(String[] args)
    {
        new CalculateDeposit().calculatePercent();
    }


}
