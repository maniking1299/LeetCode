class Solution {
    public String smallestPalindrome(String s) {

        /*   TC->O(N logN)
             SC->O(N)
        */

        
        if (s.length() == 1) {
            return s;
        }

        StringBuilder ans = new StringBuilder();

        int mid = s.length() / 2;

        String half = s.substring(0, mid);

        char[] arr = half.toCharArray();
        Arrays.sort(arr);

        half = new String(arr);

        ans.append(half);

        if ((s.length() % 2) == 1) {
            ans.append(s.charAt(mid));
        }

        ans.append(new StringBuilder(half).reverse());

        return ans.toString();
    }

}