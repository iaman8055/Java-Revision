package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal {
    public List<Integer> genRow(int r) {
        List<Integer> prev = new ArrayList<>();
        long ans = 1;
        prev.add((int) ans);
        for (int c = 1; c < r; c++) {
            ans = ans * (r - c) / c;
            prev.add((int) ans);
        }
        return prev;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans.add(genRow(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        pascal solution = new pascal();  // Create an instance of Pascal class
        List<List<Integer>> pascal = solution.generate(n);  // Call generate method on the instance
        for (List<Integer> row : pascal) {
            System.out.println(row);
        }
    }
}
