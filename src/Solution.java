import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] suspicions = new int[n];

            for (int i = 0; i < n; i++) {
                suspicions[i] = scanner.nextInt();
            }

            int[] prefixSum = new int[n];
            prefixSum[0] = suspicions[0];

            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + suspicions[i];
            }

            int minPowerSum = Integer.MAX_VALUE;

            for (int i = 0; i < n - k; i++) {
                int powerSum = prefixSum[i + k - 1] - (i > 0 ? prefixSum[i - 1] : 0);
                minPowerSum = Math.min(minPowerSum, powerSum);
            }

            System.out.println(minPowerSum);
        }
    }
}

