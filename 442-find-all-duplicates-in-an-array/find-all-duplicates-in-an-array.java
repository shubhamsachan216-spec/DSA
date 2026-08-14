class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nu: nums){
            map.put(nu,map.getOrDefault(nu,0)+1);
        }
        for(int nu:map.keySet()){
            if(map.get(nu)>=2){
                l1.add(nu);
            }
        }
        return l1;




        
    }
}