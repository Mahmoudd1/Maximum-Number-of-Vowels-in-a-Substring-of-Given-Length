# Maximum-Number-of-Vowels-in-a-Substring-of-Given-Length
This program implements a solution to the "Maximum Number of Vowels in a Substring of Given Length" problem in LeetCode. The problem is described as follows:

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

The program follows a sliding window approach to iterate over all substrings of s with length k and count the number of vowels in each substring. The maximum count found is then returned as the result.
## Solution
We initialize two pointers i and j to the start of the string s, and a counter variable counter to 0, which will keep track of the number of vowels in the current window. We also initialize a variable maxcounter to 0, which will keep track of the maximum number of vowels seen in any window of length k. We also create a hash set myset containing the vowels.

We then move the j pointer to the right, adding the character at position j to the counter if it is a vowel, and updating maxcounter if counter is greater than maxcounter. Once the window length reaches k, we update maxcounter again, and move the i pointer to the right. If the character at position i is a vowel, we decrement the counter.

We repeat this process until the j pointer reaches the end of the string. Finally, we return maxcounter, which represents the maximum number of vowels in any window of length k.
## Time and Space Complexity
The program has a time complexity of O(n), where n is the length of the input string s. This is because the program iterates over all characters in s exactly once.

The program has a space complexity of O(1), because it only uses a constant amount of extra space to store the two pointers, two counters, and the HashSet.
