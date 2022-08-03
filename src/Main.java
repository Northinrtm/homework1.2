public class Main {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 22;
        int i = 333;
        long l = 4444L;
        float f = 5.5555f;
        double d = 6.66666d;
        System.out.println("2 задача:");
        float weightFighter1 = 78.2f;
        float weightFighter2 = 82.7f;
        System.out.println("Вес бойцов: " + weightFighter1 + weightFighter2);
        float weightDistinction = weightFighter1 - weightFighter2;
        System.out.println("Разница в весе между бойцами: " + Math.abs(weightDistinction));
        System.out.println("3 задача:");
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
    }
}