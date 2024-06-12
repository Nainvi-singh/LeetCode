class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // for(int i=0;i<n;i++){
        //     nums1[i+m]=nums2[i];
        // }
        // Arrays.sort(nums1);
        
        //Apporach 2
        int writer=(m+n)-1;
        int reader1=m-1;
        int reader2=n-1;
        //loop till writer will bs reached to the the 0th index
        while(writer>=0){
            //check reader1 or reader2 is not ended.
            if(reader1>=0&&reader2>=0){
                if(nums1[reader1]>nums2[reader2]){
                    nums1[writer]=nums1[reader1];
                    reader1--;
                }
                else{
                    nums1[writer]=nums2[reader2];
                    reader2--;
                }
                
                
            }
            //either of array is not exhausted
            else if(reader1>=0){
                nums1[writer]=nums1[reader1];
                reader1--;
            }
            else if(reader2>=0){
                nums1[writer]=nums2[reader2];
                reader2--;

            }
            writer--;
        }
    }
}