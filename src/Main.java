public class Main {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 22;
        int i = 333;
        long l = 4444L;
        float f = 5.5555f;
        double d = 6.66666d;

        float weightFighter1 = 78.2f;
        float weightFighter2 = 82.7f;
        System.out.println("Вес бойцов: " + weightFighter1 + weightFighter2);
        float weightDistinction = weightFighter1 - weightFighter2;
        System.out.println("Разница в весе между бойцами: " + Math.abs(weightDistinction));
    }
}