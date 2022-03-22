package ProjectEuler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class ProjectEuler {

    public static void sumOfMultiples3or5() {
        int n3 = 0, n5 = 0, repeat = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                n3 += i;
            }
        }
        for (int i = 1; i < 1000; i++) {
            if (i % 5 == 0) {
                n3 += i;
            }
        }

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                repeat += i;
            }
        }
        System.out.println((n3 + n5) - repeat);
    }

    public static void sumOfMulti() {
        int sum3 = 0;
        int sum5 = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                sum3 += i;
            } else if (i % 5 == 0) {
                sum5 += i;
            }
        }
        System.out.println(sum3 + sum5);
    }

    public static void evenFibonacciNumbers() {
        ArrayList<Integer> fibo = new ArrayList<>();


        fibo.add(1);
        fibo.add(2);
        int sumEven = 0;

        for (int i = 2; i < 100000; i++) {
            if (fibo.get(fibo.size() - 1) % 2 == 0) {
                sumEven += fibo.get(fibo.size() - 1);
            }
            if (fibo.get(fibo.size() - 1) > 4000000) {
                break;
            } else {
                fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
            }
        }
        System.out.println(sumEven);
    }

    public static int recursionFibo(int evenTotal, int lastFibo, int secondLast) {
        int sum = lastFibo + secondLast;
        if (sum < 4000000) {
            if (sum % 2 == 0) evenTotal += sum;
            return recursionFibo(evenTotal, sum, lastFibo);
        } else return evenTotal;
    }

    public static void SumofDifference(int number) {
        double sumOfSquares = 0;
        double squareofSum = 0;
        for (int i = 1; i <= number; i++) {
            sumOfSquares += Math.pow(i, 2);
            squareofSum += i;
        }
        squareofSum = Math.pow(squareofSum, 2);

        System.out.println((int) (squareofSum - sumOfSquares));
    }

    public static void primeNumber(int number) {
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean check = false;
        int count = 5;
        primeList.add(2);
        primeList.add(3);
        primeList.add(5);
        primeList.add(7);
        primeList.add(11);

        for (int i = 12; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < primeList.size() - 2; j++) {
                if (i % primeList.get(j) == 0) {
                    check = false;
                    break;
                } else check = true;
            }
            if (check) {
                primeList.add(i);
                count++;
                check = false;
                if (count == number) break;
            }
        }
        System.out.println(primeList.get(primeList.size() - 1));
        System.out.println(count);
    }

    public static void LargestProduct(int adjacentDigits) {
        long sum = 1;
        String sum2 = "";
        long totalSum = 1;
        String s = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        for (int i = 0; i < s.length() - adjacentDigits + 1; i++) {
            sum = 1;
            sum2 = "";
            for (int j = i; j < i + adjacentDigits; j++) {
                String fourDigit = s.substring(j, j + 1);
                sum *= Integer.parseInt(fourDigit);
                sum2 = sum2.concat(fourDigit);
            }

            if (totalSum < sum) {
                totalSum = sum;
                System.out.println(sum2);
            }
        }
        System.out.println(totalSum);
    }

    public static void LargestPrimeFactor(long number) {
        long sum = 1;
        for (long i = 1; i < 10000000000000L; i++) {
            if (number % i == 0) {
                sum *= i;
                System.out.println(i);

                if (sum == number) break;
            }
        }
        System.out.println(sum);
    }

    public static void LargestPalindromeProduct() {
        final int digit = 1000;
        int palindrome = 0;
        String wordPal = "";
        String reverse = "";

        for (int i = digit; i > digit - 90; i--) {
            for (int j = digit; j > digit - 90; j--) {
                palindrome = i * j;
                wordPal = String.valueOf(palindrome);

                for (int k = wordPal.length() - 1; k >= 0; k--) {//         O((n+1)^2)
                    reverse = reverse + wordPal.charAt(k);
                }

                if (reverse.equals(wordPal)) {
                    break;
                } else reverse = "";
            }
            if (reverse.equals(wordPal)) {
                break;
            } else reverse = "";

        }
        System.out.println(reverse);

    }

    public static void SmallestMultiple() {
        boolean check = true;
        long smallestNum = 1000000000000000000L;
        for (long i = 2518; i < smallestNum; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    check = false;
                    break;
                } else check = true;
            }
            if (check) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void SmallestMultiple2(int number) {
        int[][] smallestArr = new int[number][5];
        for (int i = number - 1; i >= 5; i--) {
            int k = 0;
            int actualNum = i + 1;                  // to avoid confusion

            for (int j = 2; j <= number; j++) {
                if (actualNum % j == 0) {
                    smallestArr[j - 2][k] = j;
                    actualNum /= j;                 // to be able to check the same number whether it's dividable
                    j--;                            // to check the same number
                    k++;                            // if there is same number more than one
                } else if (actualNum == 1) break;
                else k = 0;
            }
        }
        System.out.println(Arrays.deepToString(smallestArr));

        // Smallest Multiple Calculation
        int numSmallest = 1;
        for (int i = 0; i < smallestArr.length; i++) {
            for (int j = 0; j < smallestArr[i].length; j++) {
                if (smallestArr[i][j] != 0) {
                    numSmallest *= smallestArr[i][j];
                } else break;
            }
        }
        System.out.println("numSmallest = " + numSmallest);


    }

    public static void SpecialPythTriplet() {
        for (double c = 5; c < 30; c++) {
            for (double b = 4; b < 25; b++) {
                if (!(c > b)) break;
                for (double a = 3; a < 10; a++) {
                    if (!(b > a) && ((a + b) > c)) break;
                    else if (((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))) {
                        for (int k = 0; k < 30; k++) {
                            if ((k * (a + b + c) > 1000)) break;
                            else if ((k * (a + b + c) == 1000)) {
                                System.out.println((int) (k * a) + "\n" + (int) (k * b) + "\n" + (int) (k * c));
                                System.out.println((int) ((k * a) * (k * b) * (k * c)));

                            }
                        }
                    }
                }
            }
        }
    }

    public static void SumOfPrimes(int number) {
        long sum = 2;
        boolean check = true;
        ArrayList<Integer> listSum = new ArrayList<>();
        listSum.add(2);
        for (long i = 2; i < number; i++) {
            if ((i % 2 != 0)) {

                for (int j = 0; j < listSum.size(); j++) {
                    if (i % listSum.get(j) == 0) {
                        check = false;
                        break;
                    } else check = true;
                }
                if (check) {
                    listSum.add((int) i);
                    sum += i;
                    System.out.println("listSum = " + listSum);
                }
            }
        }
        System.out.println("sum = " + sum);
        //System.out.println(listSum);
    }

    public static void sumOfPrimes(int number) {
        int[] listOfPrimes = new int[number];
        listOfPrimes[0] = 2;

        for (int i = 3; i < number; i++) {
            int index = 1;
            boolean check = false;

            for (int j = 0; j < listOfPrimes.length; j++) {     // find the first zero
                if (listOfPrimes[j] == 0) {                     // this-1 will be my last index to check
                    index = j;
                    break;
                }
            }
            for (int j = 0; j < index; j++) {       //try to find remain for every member of the list
                if (i % listOfPrimes[j] == 0) {
                    check = false;  //if there is any, then it is not prime
                    break;
                } else check = true;  //if there is no other than itself, then add it to the list
            }
            if (check) {
                listOfPrimes[index] = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < listOfPrimes.length; i++) {       // sum all the prime numbers
            sum += listOfPrimes[i];
        }
        System.out.println(sum);
    }

    public static void largestProductInGrid(String grid) {
        //input has to seperated with new lines
        Scanner gridScanner = new Scanner(grid);

        long[][] wholeGrid = new long[20][20];
        int row = 0;
        while (gridScanner.hasNextLine()) {
            String[] nextLine = gridScanner.nextLine().split(" ");

            for (int column = 0; column < 20; column++) {
                wholeGrid[row][column] = Integer.parseInt(nextLine[column]);
            }
            row++;
        }
        long sum = 0;
        for (int i = 0; i < wholeGrid.length; i++) {
            for (int j = 0; j < wholeGrid[0].length; j++) {

                if (j < 17) {
                    if (wholeGrid[i][j] * wholeGrid[i][j + 1] * wholeGrid[i][j + 2] * wholeGrid[i][j + 3] > sum) {// RIGHT
                        sum = wholeGrid[i][j] * wholeGrid[i][j + 1] * wholeGrid[i][j + 2] * wholeGrid[i][j + 3];
                    }
                }
                if (i >= 17) {
                    continue;
                }
                if (wholeGrid[i][j] * wholeGrid[i + 1][j] * wholeGrid[i + 2][j] * wholeGrid[i + 3][j] > sum) {//DOWN
                    sum = wholeGrid[i][j] * wholeGrid[i + 1][j] * wholeGrid[i + 2][j] * wholeGrid[i + 3][j];
                }
                if (j < 17) {
                    if (wholeGrid[i][j] * wholeGrid[i + 1][j + 1] * wholeGrid[i + 2][j + 2] * wholeGrid[i + 3][j + 3] > sum) {//RIGHT-DOWN
                        sum = wholeGrid[i][j] * wholeGrid[i + 1][j + 1] * wholeGrid[i + 2][j + 2] * wholeGrid[i + 3][j + 3];
                    }//RED
                }
                if (j > 3) {
                    if (wholeGrid[i][j] * wholeGrid[i + 1][j - 1] * wholeGrid[i + 2][j - 2] * wholeGrid[i + 3][j - 3] > sum) {//LEFT-DOWN
                        sum = wholeGrid[i][j] * wholeGrid[i + 1][j - 1] * wholeGrid[i + 2][j - 2] * wholeGrid[i + 3][j - 3];
                    }
                }//RED + BROWN
            }//Inside for
        }
        System.out.println(sum);

    }

    public static void triangularNumber(int number) {
        long triangle = 0;
        int counter = 0;
        long num = 1;

        while (true) {
            triangle += num;
            counter = 0;

            for (int i = 1; i < (triangle / 2) + 1; i++) {
                if (triangle % i == 0) {
                    counter++;
                }
            }

            if (counter > 500) break;

            num++;
        }
        System.out.println(triangle);


    }

    public static void largestCollatzSequence(int startingNumber) {
        int size = 0;
        long max = 1;

        for (int i = 2; i < startingNumber; i++){
            int newSize = value(i);
            if (newSize > size){
                size = newSize;
                max = i;
            }
        }
        System.out.println(max);
    }

    public static int value(int number) {
        List<Long> sequence = new ArrayList<>();
        long num = number;
        while (num != 1) {
            sequence.add(num);
            if (num % 2 == 0) {
                num = num / 2;
            } else num = 3 * num + 1;
        }
        return sequence.size();
    }

    public static int sum(int base, int power){
        BigInteger baseBig = new BigInteger("" + base);
        baseBig = baseBig.pow(power);


        String valueStr = String.valueOf(baseBig);
        int sum = 0;

        for (int i = 0; i < valueStr.length(); i++){
            sum += Integer.parseInt(String.valueOf(valueStr.charAt(i)));
        }
        return sum;
    }

    public static void main(String[] args) {
        largestCollatzSequence(1000000);
    }
}




















