import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

        int[] people = new int[10];
        double summ = 0;
        int countInRange  = 0;
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(61) + 40;
        }
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }

        for (int i:people){
            countInRange++;
        }

        System.out.println("Средний вес всех людей: " + summ / people.length + " кг");
        System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно: " + countInRange);
    }
}
