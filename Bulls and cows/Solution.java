class Solution {
    public String getHint(String secret, String guess) {
        if(secret.length() == 0){return "0A0B";}
    
    int bull = 0;
    int cow = 0;
    int [] result = new int [10];
    
    for(int i = 0;i<secret.length();i++)
    {
        int x = secret.charAt(i) - 48;
        int y = guess.charAt(i) - 48;
        
        if(x == y)
        {
            bull++;
        }
        else
        {
            if(result[x] < 0){cow++;}
            result[x]++;
            
            if(result[y] > 0){cow++;}
            result[y]--;
        }
    }
    
    return bull+"A"+cow+"B";
    
    }
}