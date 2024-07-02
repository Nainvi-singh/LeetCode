class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<>();  
        //two pointer
        int i = 0, j = 0;  
        //Loop through both arrays simultaneously  
        while (i < nums1.length && j < nums2.length) {  
        // Compare the elements at indices i and j of the two arrays  
            if (nums1[i] == nums2[j]) {   
                result.add(nums1[i]);  
                i++;  
                j++;  
            } 
            else if (nums1[i] < nums2[j]) {  
                i++;  
            } 
            else {  
                j++;  
            }  
    }  
    int[] arr = new int[result.size()]; 
          
        for (int k = 0; k < result.size(); k++)  
        { 
            arr[k] = result.get(k); 
        } 
    return arr; 
    }
}