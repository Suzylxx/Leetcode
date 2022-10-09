class Solution {
    public void reverseString(char[] s) {
        char temp1;
        char temp2;
        int i = s.length / 2;
        int j = s.length - 1;
        for (int k = 0; k < i; k++) {
            temp1 = s[k];
            temp2 = s[j];
            s[k] = temp2;
            s[j] = temp1;
            j--;
        }
    }
}
