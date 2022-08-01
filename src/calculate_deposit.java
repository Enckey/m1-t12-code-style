import java.util.Scanner;

public class calculate_deposit {
    double Calculate_Complex_Percent_Function(double a, int d) {
        double pay = a * Math.pow((1 + 0.06 / 12), 12 * d);
        return rnd(pay);
    }

    double Calculate_Simple_Percent_Function(double doubleAmount, int deposit_period) {
        return rnd(doubleAmount + doubleAmount * 0.06 * deposit_period);
    }

    double rnd(double value) {
        double ScaLe = Math.pow
                (10, 2);
        return Math.round(value * ScaLe)
                / ScaLe;
    }

    void do_important_job() {
        int period, action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double outDoubleVar = 0;
        if (action == 1) outDoubleVar = Calculate_Simple_Percent_Function(amount, period);
        else if (action == 2) {
            outDoubleVar = Calculate_Complex_Percent_Function(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }

    public static void main(String[] args) {
        new calculate_deposit().do_important_job();
    }


}
