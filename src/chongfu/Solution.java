package chongfu;


    public class Solution {
        public static int FirstNotRepeatingChar(String str) {
            int count =0;
            int p = 0;
            for(int i=0 ; i < str.length()-1 ; i ++)
            {
                for(int check = 0 ; check < str.length() ; check++)
                {
                    if(str.charAt(i)==str.charAt(check))
                    {
                        count++;
                    }
                }
                if(count == 0){
                    p=i;
                    break;
                }
                else{
                    count = 0;
                }
            }
            return p;
        }
    }

