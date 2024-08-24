import java.util.*;

class Main {

    // Brute force
    public static int solution1(int[] arr1, int[] arr2) {
        
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count += 1;
                    break;
                }
            }
        }
        
        return count;
    }

    // Traverse arr1 and Binary search in arr2
    public static int solution2(int[] arr1, int[] arr2) {
        
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            int l = 0;
            int r = arr2.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (arr1[i] == arr2[mid]) {
                    count += 1;
                    break;
                }
                else if(arr1[i] < arr2[mid]) r = mid - 1;
                else l = mid + 1;
            }
        }
        
        return count;
    }

    // HashMap
    public static int solution3(int[] arr1, int[] arr2) {
        
        int count = 0;
        
        HashSet<Integer> s = new HashSet<>();
        
        for (int i = 0; i < arr1.length; i++) 
            s.add(arr1[i]);
            
        for (int i = 0; i < arr2.length; i++) {
            if (s.contains(arr2[i])) count += 1;
        }
        
        return count;
    }

    // Two pointers
    public static int solution4(int[] arr1, int[] arr2) {
        
        int count = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        
        while (ptr1 < arr1.length && ptr2 < arr2.length) {
            if (arr1[ptr1] == arr2[ptr2]) {
                count += 1;
                ptr1 += 1;
                ptr2 += 1;
            } else if (arr1[ptr1] < arr2[ptr2]) 
                ptr1 += 1;
            else ptr2 += 1;
        }
        
        return count;
    }
    
    
    public static void main(String[] args) {
        
        int[] arr1 = {10, 23, 65, 71, 75, 76, 83};
        int[] arr2 = {23, 28, 55, 71, 76, 80, 91};
        
        // Time Complexity : O (N ^ 2)
        // Space Complexity : O (1)
        int bruteForceSolution = solution1(arr1, arr2);
        
        // Time Complexity : O (N Log N)
        // Space Complexity : O (1)
        int binarySearchSolution = solution2(arr1, arr2);

        // Time Complexity : O (N)
        // Space Complexity : O (N)
        int hashTableSolution = solution3(arr1, arr2);

        // Time Complexity : O (N)
        // Space Complexity : O (1)
        int TwoPointersSolution = solution4(arr1, arr2);
        
        System.out.println("bruteForceSolution " + bruteForceSolution);
        System.out.println("binarySearchSolution " + binarySearchSolution);
        System.out.println("hashTableSolution " + hashTableSolution);
        System.out.println("TwoPointersSolution " + TwoPointersSolution);
    }
}


