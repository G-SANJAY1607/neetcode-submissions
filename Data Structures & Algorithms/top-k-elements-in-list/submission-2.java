class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        while(k>0){
            int max=0,num=0;
            for(int a:map.keySet()){
                if(map.get(a)>=max){
                    max=map.get(a);
                    num=a;
                }
            }
            arr.add(num);
            map.remove(num);
            k--;
        }
        int n=arr.size();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=arr.get(i);
        }
        return ar;
    }
}
