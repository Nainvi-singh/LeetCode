class Solution {
    public int majorityElement(int[] nums) {
            //apporach 1 brute force
            //2 loop
        
            //apporach 2
            //hashing
//             HashMap<Integer,Integer> map=new HashMap<>();
//             for(int val:nums){
//                 Integer count=map.get(val);
//                 if(count!=null){
//                     count++;;
//                     map.put(val,count);
                    
//                 }
//                 else{
//                     count=1;
//                     map.put(val,count);
//                 }
//                 if(count>nums.length/2){
//                     return val;
//                 }
                
//             }
//             return 0;
        
        //apporach 3-sorting
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}