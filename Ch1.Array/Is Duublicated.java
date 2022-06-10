//Hash Map Solution // 15ms runtime 
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))return true;
            map.put(i,1);
        }
        return false;
    }
}

//Set Solution //12ms runtime 

class Solution {
    public boolean containsDuplicate(int[] nums) {
    if(nums==null || nums.length==0)
        return false;
 
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums){
        if(!set.add(i)){
            return true;
        }
    }
 
    return false;
}
    }
//ArrayList  Time limited Exceed 
class Solution {
    public boolean containsDuplicate(int[] nums) {
       ArrayList<Integer> List= new ArrayList<>();
        if(nums==null || nums.length==0){
            return false;
        }
        for(int i : nums){
            if(List.contains(i))return true;
            List.add(i);
        }
        return false;
    }
}
