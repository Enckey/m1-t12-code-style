import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double amount, int depositPeriod) {
        double pay = amount * Math.pow((1 + 0.06 / 12), 12 * depositPeriod);
        return roundValue(pay);
    }

    double calculateSimplePercent(double amount, int depositPeriod) {
        return roundValue(amount + amount * 0.06 * depositPeriod);
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
        double percent = 0;
        if (action == 1) {
            percent = calculateSimplePercent(amount, period);
        }
        else if (action == 2) {
           percent = calculateComplexPercent(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + percent);
    }

    public static void main(String[] args)
    {
        new DepositCalculator().calculatePercent();
    }


}
