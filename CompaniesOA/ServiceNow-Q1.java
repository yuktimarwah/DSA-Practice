import java.io.*;
import java.util.*;

public class Main {

  public static boolean canAchieve(int ans, int R, int C, int[][] matrix) {
    int fullMask = (1 << C) - 1;

    int[] mask = new int[R];
    
    for (int i = 0; i < R; i++) {
      mask[i] = 0;

      for (int k = 0; k < C; k++) {
        if (matrix[i][k] >= ans) {
          mask[i] |= (1 << k);
        }
      }
    }

    for (int i = 0; i < R - 1; i++) {
        for (int j = i + 1; j < R; j++) {
          if ((mask[i] | mask[j]) == fullMask) {
            return true;
          }
        }
      }
    return false;
  }
    public static int maximizeMinimum(int R, int C, int[][] matrix) {
        int low = 0;
        int high = 0;
      
      for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
          if (matrix[i][j] > high) {
            high = matrix[i][j];
          }
        }
      }

      int ans = 0;
      
      while (high >= low) {
        int mid = low + (high - low) / 2;

        if (canAchieve(mid, R, C, matrix)) {
          ans = mid;
          low = mid + 1;
        }
        else {
          high = mid - 1;
        }
      }
      return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        String[] parts = line.trim().split("\\s+");
        int R = Integer.parseInt(parts[0]);
        int C = Integer.parseInt(parts[1]);
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            line = br.readLine();
            if (line == null) break;
            parts = line.trim().split("\\s+");
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        System.out.println(maximizeMinimum(R, C, matrix));
    }
}
