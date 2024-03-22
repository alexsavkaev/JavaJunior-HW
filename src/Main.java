import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random random = new Random();
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            numbers.add(random.nextInt(10)+1);
        System.out.println("Исходные числа:\n" + numbers);

        double average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Среднее значение всех четных чисел:\n" + average);
    }
}