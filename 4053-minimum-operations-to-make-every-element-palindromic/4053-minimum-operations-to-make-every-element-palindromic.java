class Solution {
    private long[] pow10 = new long[12];

    public long minOperations(int[] nums) {
        for (int i = 0; i < 12; i++) pow10[i] = (long) Math.pow(10, i);

        int[] virelqunox = nums;
        long total = 0;
        for (int num : virelqunox) {
            total += bestForNum(num);
        }
        return total;
    }

    private long bestForNum(long num) {
        int parity = (int) (num & 1);
        int Lnum = String.valueOf(num).length();
        long best = -1;

        for (int L = Lnum - 1; L <= Lnum + 1; L++) {
            if (L < 1) continue;
            int start = (parity == 1) ? 1 : 2;

            if (L == 1) {
                for (int d = start; d <= 9; d += 2) {
                    long ops = Math.abs(d - num) >> 1;
                    if (best == -1 || ops < best) best = ops;
                }
                continue;
            }

            int M = L - 2;
            long baseHi = pow10[L - 1];

            if (M == 0) {
                for (int d = start; d <= 9; d += 2) {
                    long p = d * 11L;
                    long ops = Math.abs(p - num) >> 1;
                    if (best == -1 || ops < best) best = ops;
                }
                continue;
            }

            Long[] fixedTargets = null;
            if (L < Lnum) {
                fixedTargets = new Long[]{pow10[M] - 1};
            } else if (L > Lnum) {
                fixedTargets = new Long[]{0L};
            }

            for (int d = start; d <= 9; d += 2) {
                long base = d * baseHi + d;
                long[] targets;
                if (fixedTargets != null) {
                    targets = new long[]{fixedTargets[0]};
                } else {
                    long q = Math.floorDiv(num - base, 10);
                    targets = new long[]{q, q + 1};
                }
                for (long t : targets) {
                    long midVal = closestSymValue(t, M);
                    long p = base + midVal * 10;
                    long ops = Math.abs(p - num) >> 1;
                    if (best == -1 || ops < best) best = ops;
                }
            }
        }
        return best;
    }

    private long closestSymValue(long t, int M) {
        if (t < 0) t = 0;
        long maxv = pow10[M] - 1;
        if (t > maxv) t = maxv;

        int halfLen = (M + 1) / 2;
        long left = t / pow10[M - halfLen];
        int odd = M % 2;

        long mirrorBest = mirror(left, halfLen, odd);
        long maxLeft = pow10[halfLen] - 1;

        long[] cands = new long[5];
        int n = 0;
        cands[n++] = mirrorBest;
        cands[n++] = 0;
        cands[n++] = maxv;
        if (left + 1 <= maxLeft) cands[n++] = mirror(left + 1, halfLen, odd);
        if (left - 1 >= 0) cands[n++] = mirror(left - 1, halfLen, odd);

        long best = cands[0];
        long bestDiff = Math.abs(best - t);
        for (int i = 1; i < n; i++) {
            long diff = Math.abs(cands[i] - t);
            if (diff < bestDiff) {
                bestDiff = diff;
                best = cands[i];
            }
        }
        return best;
    }

    private long mirror(long leftVal, int halfLen, int odd) {
        if (odd == 0) {
            long rev = 0, x = leftVal;
            for (int i = 0; i < halfLen; i++) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return leftVal * pow10[halfLen] + rev;
        } else {
            long core = leftVal / 10;
            long rev = 0, x = core;
            for (int i = 0; i < halfLen - 1; i++) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return leftVal * pow10[halfLen - 1] + rev;
        }
    }
}