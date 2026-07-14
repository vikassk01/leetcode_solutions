class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set= new HashSet<>();
        for(int con:count.values()){
            if(set.contains(con)){
                return false;
            }else{
                set.add(con);
            }
        }
        return true;
    }
}