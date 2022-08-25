//https://leetcode.com/problems/ransom-note
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mag= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(mag.containsKey(magazine.charAt(i))){
                mag.put(magazine.charAt(i),mag.get(magazine.charAt(i))+1);
            }
            else 
                mag.put(magazine.charAt(i),1);
        }
        for(int i=0;i<ransomNote.length();i++){
          //  System.out.println(mag.containsKey(ransomNote.charAt(i)));
            if(mag.containsKey(ransomNote.charAt(i)) ){
                if(mag.get(ransomNote.charAt(i))>0){
                    mag.put(ransomNote.charAt(i),mag.get(ransomNote.charAt(i))-1);
                }
                else
                    return false;
            }
            else
                    return false;
        }
        
       return true; 
    }
}