public class Main {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 22;
        int i = 333;
        long l = 4444L;
        float f = 5.5555f;
        double d = 6.66666d;
        System.out.println("\n" + "2 задача:");
        float weightFighter1 = 78.2f;
        float weightFighter2 = 82.7f;
        System.out.println("Вес бойцов: " + weightFighter1 + weightFighter2);
        float weightDistinction = weightFighter1 - weightFighter2;
        System.out.println("Разница в весе между бойцами: " + Math.abs(weightDistinction));
        System.out.println("\n" + "3 задача:");
        int banana = 5;
        int weightBanana = 80;
        int Milk = 200;
        double weightMilk = Milk * (105.0/ 100.0);
        int iceCream = 2;
        int weightIceCream = 100;
        int eggs = 4;
        int weightEgg = 70;
        double weightBreakfast = banana * weightBanana + weightMilk + iceCream * weightIceCream +
                eggs * weightEgg;
        System.out.println("Общий вес завтрака: " + weightBreakfast);
        System.out.println("В килограммах это: " + (weightBreakfast / 1000));
        System.out.println("\n" + "4 задача:");
        int weightLose = 7;
        System.out.println("Если терять вес по 500 грамм в день, боец похудеет за " + weightLose * 1000 / 500 + " дней");
        System.out.println("Если терять вес по 250 грамм в день, боец похудеет за " + weightLose * 1000 / 250 + " дней");
        System.out.println("В среднем боец должен похудеть за "
                + (weightLose * 1000 / 500 + weightLose * 1000 / 250) / 2 + " день" );
        System.out.println("\n" +
                "5 задача:");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Маша теперь получает " + (int)(salaryMasha * 1.1) +
                ". Годовой доход вырос на " + (int)(salaryMasha * 1.1 - salaryMasha));
        System.out.println("Денис теперь получает " + (int)(salaryDenis * 1.1) +
                ". Годовой доход вырос на " + (int)(salaryDenis * 1.1 - salaryDenis));
        System.out.println("Кристина теперь получает " + (int)(salaryKristina * 1.1) +
                ". Годовой доход вырос на " + (int)(salaryKristina * 1.1 - salaryKristina));
    }
}