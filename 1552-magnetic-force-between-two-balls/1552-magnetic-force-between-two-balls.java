class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lowerBound=1;
        int ans=-1;
        int upperBound=(position[position.length-1] - position[0]);
        while(lowerBound<=upperBound){
            int lastPosition = position[0], balls = 1;
            int mid=lowerBound+(upperBound-lowerBound)/2;
            
             for (int i = 1; i < position.length; i++) {
                if (position[i] - lastPosition >= mid) {
                    lastPosition = position[i];
                    balls++;
                }
            }
            if (balls >= m) {
                ans = mid;
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        return ans;
    }
}