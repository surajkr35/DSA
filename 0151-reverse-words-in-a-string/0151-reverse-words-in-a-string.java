class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        // 1. reverse whole string
        reverse(arr, 0, arr.length - 1);

        // 2. reverse each word
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        // 3. clean spaces
        return cleanSpaces(arr);
    }
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    private String cleanSpaces(char[] arr) {
        int i = 0, j = 0, n = arr.length;

        while (j < n) {
            while (j < n && arr[j] == ' ') j++; // skip spaces
            while (j < n && arr[j] != ' ') arr[i++] = arr[j++];
            while (j < n && arr[j] == ' ') j++; // skip spaces
            if (j < n) arr[i++] = ' ';
        }

        return new String(arr, 0, i);
    }
}