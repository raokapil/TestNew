package paytm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Java program to count frequencies of array items
class CountFrequencies
{
    public static void main(String []args)
    {
        int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;

        //A simple solution is to run two loops.
        // For every item count number of times it occurs. To avoid duplicate printing, keep track of processed items.
        countFreq(arr, n);

        //An efficient solution is to use hashing.
        countFreqByHashing(arr, n);
    }

    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }


    private static void countFreqByHashing(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

// This code contributed by Adarsh_Verma.
