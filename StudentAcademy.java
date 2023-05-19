package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> records = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!records.containsKey(studentName)) {
                records.put(studentName, new ArrayList<>());
                records.get(studentName).add(grade);
            } else {
                records.get(studentName).add(grade);
            }
        }

        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : records.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50) {
                averageGrade.put(entry.getKey(), average);
            }
        }

        averageGrade.entrySet().stream().sorted((n1,n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(grade -> {
                    System.out.printf("%s -> %.2f\n", grade.getKey(), grade.getValue());
                });
    }
}
