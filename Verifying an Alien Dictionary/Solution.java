class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int freq[]=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<order.length();i++)
        {
            freq[order.charAt(i)-'a']=i+1;
        }
        boolean b=true,twoComp=false;
        for(int i=1;i<words.length;i++)
        {
            int len=words[i-1].length()<words[i].length()?words[i-1].length():words[i].length();
            if(words[i-1].equals(words[i]))
            {
                continue;
            }
            b=false;
            twoComp=false;
            for(int j=0;j<len;j++)
            {
                if(freq[words[i-1].charAt(j)-'a']<freq[words[i].charAt(j)-'a'])
                {
                    twoComp=true;
                    b=true;
                    break;
                }
                else if(freq[words[i-1].charAt(j)-'a']==freq[words[i].charAt(j)-'a'])
                {
                    b=true;
                }
                else if(freq[words[i-1].charAt(j)-'a']>freq[words[i].charAt(j)-'a'])
                {
                    return false;
                }
            }
            if(!twoComp&&words[i-1].length()>words[i].length())
            {
                return false;
            }
        }
        return b;
    }
}