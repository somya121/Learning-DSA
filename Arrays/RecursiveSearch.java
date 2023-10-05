public class RecursiveSearch {
    public static void main(String args[]) {

      System.out.println(recursiveSearch(new int[] {1,2,3}, 3));
      System.out.println(recursiveSearch(new int[] {1, 2, 3, 4}, 5));
    }
    
    public static boolean recursiveSearch(int[] array, int key) {
        return recursiveSearch(array, key, 0, array.length - 1);
    }
    
    private static boolean recursiveSearch(int[] array, int key, int start, int end) {

        if(start >= end) {
            if (array[start] == key) {
                return true;
            }else {
                return false;
            }
        }
        
        int mid = (start + end) /2;
        
        
        boolean lower = recursiveSearch(array, key, start, mid-1);
        boolean upper = recursiveSearch(array, key, mid+1, end);
        
        return lower || upper;
    }
}
