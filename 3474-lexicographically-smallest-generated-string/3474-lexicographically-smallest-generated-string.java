class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int size = n + m - 1;

        char[] ans = new char[size];
        boolean[] modifiable = new boolean[size];

        // Initialize
        for (int i = 0; i < size; i++) {
            ans[i] = '#';  // unassigned
            modifiable[i] = true;
        }

        // Step 1: Apply 'T' constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int pos = i + j;
                    if (ans[pos] != '#' && ans[pos] != str2.charAt(j)) {
                        return "";
                    }
                    ans[pos] = str2.charAt(j);
                    modifiable[pos] = false;
                }
            }
        }

        // Step 2: Fill remaining with 'a'
        for (int i = 0; i < size; i++) {
            if (ans[i] == '#') {
                ans[i] = 'a';
            }
        }

        // Helper: check if substring matches str2
        // (inline instead of separate method for speed/readability)

        // Step 3: Fix 'F' constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                boolean match = true;

                for (int j = 0; j < m; j++) {
                    if (ans[i + j] != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    int posToChange = -1;

                    // find rightmost modifiable position
                    for (int j = m - 1; j >= 0; j--) {
                        if (modifiable[i + j]) {
                            posToChange = i + j;
                            break;
                        }
                    }

                    if (posToChange == -1) {
                        return "";
                    }

                    ans[posToChange] = 'b'; // smallest change
                    modifiable[posToChange] = false;
                }
            }
        }

        return new String(ans);
    }
}