class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String word:strs){
            char[]arr=word.toCharArray();
            Arrays.sort(arr);
            String res=new String(arr);
            if(!map.containsKey(res)){
                map.put(res,new ArrayList<>());
            }
            map.get(res).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
