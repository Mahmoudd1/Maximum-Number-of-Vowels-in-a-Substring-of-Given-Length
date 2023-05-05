import java.util.HashSet;

class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int counter=0;
        int maxcounter=0;
        HashSet<Character> myset=new HashSet<>();
        myset.add('a');
        myset.add('e');
        myset.add('o');
        myset.add('u');
        myset.add('i');

        while(j<s.length())
        {
            if (myset.contains(s.charAt(j)))
            {
                counter++;
                maxcounter=Math.max(counter,maxcounter);
            }
            j++;
            if (j-i==k)
            {
                maxcounter=Math.max(counter,maxcounter);
                if (myset.contains(s.charAt(i)))
                {
                    counter--;
                }
                i++;
            }

        }
        return maxcounter;

    }
}