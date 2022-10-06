class GFG
{
    
    static int maximumSumSubarray(int arr[], int n)
    {
      
        int min_prefix_sum = 0;
     
        
        int res = Integer.MIN_VALUE;
     
      
        int prefix_sum[] = new int[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefix_sum[i] = prefix_sum[i - 1]
                            + arr[i];    
     
        
        for (int i = 0; i < n; i++)
        {
            res = Math.max(res, prefix_sum[i] -
                           min_prefix_sum);
            min_prefix_sum = Math.min(min_prefix_sum,
                                     prefix_sum[i]);
        }
         
        return res;
    }
     
   
    public static void main (String[] args)
    {
        // Test case 1
        int arr1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n1 = arr1.length;
        System.out.println(maximumSumSubarray(arr1, n1));
     
        // Test case 2
        int arr2[] = { 4, -8, 9, -4, 1, -8, -1, 6 };
        int n2 = arr2.length;
        System.out.println(maximumSumSubarray(arr2, n2));
    }
}