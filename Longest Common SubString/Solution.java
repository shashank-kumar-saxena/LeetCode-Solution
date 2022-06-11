//Better Approach
// public String longestCommonPrefix(String[] strs) {
//    if (strs.length == 0) return "";
//    String prefix = strs[0];
//    for (int i = 1; i < strs.length; i++)
//        while (strs[i].indexOf(prefix) != 0) {
//            prefix = prefix.substring(0, prefix.length() - 1);
//           if (prefix.isEmpty()) return "";
//        }        
//    return prefix;
//}

//My Approach

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length>200||strs.length<=0)
        {
            return"";
        }
        if(strs.length==1)
        {
            return strs[0];
        }
        int count=0,count2=0;
        char chr=' ';
        for(int i=0;i<strs[0].length();i++)
        {
            
            for(int j=1;j<strs.length;j++)
            {
                if((strs[j].length())==0)
                {
                    return"";
                }
                try
                {
                    chr=strs[j].charAt(i);
                }catch(Exception e)
                {
                    return(strs[0].substring(0,count2));
                }
                if(chr==strs[0].charAt(i))
                {
                    count++;
                }
            }
            if(count==strs.length-1)
            {
                count2++;
            }
            else
            {
                break;
            }
            count=0;
        }
        return(strs[0].substring(0,count2));
    }
}