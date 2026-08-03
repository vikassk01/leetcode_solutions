class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<Integer>();
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int j=1;j<=n;j++){
            if(!set.contains(j)){
            result.add(j);
            }
        }
        return result;
    }
}