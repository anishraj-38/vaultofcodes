package w2;
import java.util.*;
public class Exercise3 {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

            System.out.println("Original List: " + numbers);
            System.out.println("Squares of Numbers:");

            for (int num : numbers) {
                System.out.println(num + "^2 = " + (num * num));
            }
        }
    }


