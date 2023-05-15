package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbersV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer,Integer> numbers = new TreeMap<>();

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < nums.length; i++) {
            if (!numbers.containsKey(nums[i])){
                numbers.put(nums[i], 1);
            }else {
                numbers.put(nums[i], numbers.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.printf("%d -> %d\n",entry.getKey(), entry.getValue());
        }

    }
}
