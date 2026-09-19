class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> mapS=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mapS.containsKey(ch)){
                int freq=mapS.get(ch);
                mapS.put(ch,freq+1);
            }
            else mapS.put(ch,1);
        }

        HashMap<Character,Integer> mapT=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(mapT.containsKey(ch)){
                int freq=mapT.get(ch);
                mapT.put(ch,freq+1);
            }
            else mapT.put(ch,1);
        }
        for(char ch : mapT.keySet()) { //traversing in t set
            if(!mapS.containsKey(ch)) return false;//if any character of t not in s return false
            if(!mapS.get(ch).equals(mapT.get(ch))) return false;//if frequency of that character not same then also false
        }
        return true;       
    }
}