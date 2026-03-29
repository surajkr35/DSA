class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] arr = s1.toCharArray();

        // case 1: no swap
        if (s1.equals(s2)) return true;

        // case 2: swap 0 and 2
        swap(arr, 0, 2);
        if (new String(arr).equals(s2)) return true;

        // case 3: swap 1 and 3 (from current)
        swap(arr, 1, 3);
        if (new String(arr).equals(s2)) return true;

        // case 4: undo even swap, try only odd swap
        swap(arr, 0, 2); // revert
        if (new String(arr).equals(s2)) return true;

        return false;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}