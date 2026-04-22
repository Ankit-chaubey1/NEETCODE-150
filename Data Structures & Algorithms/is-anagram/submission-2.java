
class Solution {
    public boolean isAnagram(String s, String t) {
       /*  
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
       
        return Arrays.equals(a,b);*/
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c1:s.toCharArray()){
            map.put(c1,map.getOrDefault(c1,0)+1);
        }
        for(char c2:t.toCharArray()){
            if(map.containsKey(c2)){

            
            map.put(c2,map.getOrDefault(c2,0)-1);
            if(map.get(c2)<0){
                return false;
            }
            }else{
                return false;
            }

        }
        return true;
    }
}
