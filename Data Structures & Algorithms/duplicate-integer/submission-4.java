class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int a:map.keySet()){
            if(map.get(a)>1){
                return true;
            }
        }
        return false;
    }
}