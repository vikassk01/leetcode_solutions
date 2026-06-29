class Solution{
    public int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int need=target-current;
            if(map.containsKey(need)){
                return new int[]{map.get(need),i}; 
            } else{
                map.put(current,i);
            }
        }
        return new int[]{};
    }
}