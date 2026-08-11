class Solution {
   public  boolean ispali(String s)
   {
    int i=0, j=s.length()-1;
    while(i<j)
    {
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        i++;
        j--;
    }
    return true;
   }
    public String longestPalindrome(String s) {
        String pali="";
        for(int i=0; i<s.length(); i++)
        {
        for(int j=i+1; j<=s.length(); j++)
        {
            String sub=s.substring(i,j);
            if(ispali(sub))
            {
                if(pali.length()<sub.length())
                {
                  pali=sub;
                }
            }
        }

        }
        return pali;
    }
}