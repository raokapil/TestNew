package mycodeschool;

public class ArraySpiral {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };
        print2DSprialArray(arr);
    }

    private static void print2DSprialArray(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int t = 0, b = m-1, l = 0, r = n-1;
        int dir = 0;
        while (t <= b && l <= r) {
            if (dir == 0) {
                for (int k = l; k <= r; k++) {
                    System.out.println(arr[t][k]);
                }
                t++;
            } else if (dir == 1) {
                for (int k = t; k <=b ; k++) {
                    System.out.println(arr[k][r]);
                }
                r--;
            } else if (dir == 2) {
                for (int k = r; k >= l ; k--) {
                    System.out.println(arr[b][k]);
                }
                b--;
            } else if (dir == 3) {
                for (int k = b; k>=t ; k--) {
                    System.out.println(arr[k][l]);
                }
                l++;
            }
            dir = (dir + 1) % 4;
        }


    }


}
