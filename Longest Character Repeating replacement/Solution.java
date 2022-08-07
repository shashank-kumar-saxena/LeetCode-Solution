class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
int longCharCount=0;
Map<Character, Integer> map = new HashMap<>();
int maxLength=0;

    for(int end=0;end<s.length();end++){
        char endchar = s.charAt(end);
        map.put(endchar, map.getOrDefault(endchar,0)+1);
        longCharCount = Math.max(longCharCount, map.get(endchar));
        
        if(end-start+1-longCharCount >k){
            char startChar=s.charAt(start);
            map.put(startChar, map.getOrDefault(startChar,0)-1);
            start++;
        }
        
        maxLength = Math.max(maxLength, end-start+1);
    }
    
    return maxLength;


    }
}