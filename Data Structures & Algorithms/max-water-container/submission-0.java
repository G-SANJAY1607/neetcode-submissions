class Solution {
    public int maxArea(int[] hi) {
        int l=0,r=hi.length-1;
        int ans=0,max=Integer.MIN_VALUE;
        while(l<r){
            int h=Math.min(hi[l],hi[r]);
            int w=r-l;
            ans=h*w;
            if(ans>=max){
                max=ans;
            }

            if(hi[l]<=hi[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
