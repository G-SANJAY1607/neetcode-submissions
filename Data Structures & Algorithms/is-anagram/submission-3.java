class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character,Integer> map1=new TreeMap<>();
        TreeMap<Character,Integer> map2=new TreeMap<>();
        for(char n:s.toCharArray()){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        for(char n:t.toCharArray()){
            map2.put(n,map2.getOrDefault(n,0)+1);
        }
        if(map1.size()!=map2.size()){
            return false;
        }
        else{
            for(char a:map1.keySet()){
                if(!map2.containsKey(a)){
                    return false;
                }
                if(!map1.get(a).equals(map2.get(a))){
                    return false;
                }
            }
        }
        return true;
    }
}
