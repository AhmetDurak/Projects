package Training1;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Arrays2D {
    public static void HourGlassSum(int[][] arr) {
        int sum = Byte.MIN_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                int currentSum = (arr[i][j] + arr[i][j - 1] + arr[i][j + 1] +
                        arr[i + 1][j] +
                        arr[i + 2][j - 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                );
                sum = Integer.max(sum, currentSum);
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine()
                                .replaceAll("\\s+$", "")
                                .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int[][] k = arr.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        HourGlassSum(k);

    }
}
