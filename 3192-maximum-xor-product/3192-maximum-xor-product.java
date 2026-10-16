class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        long MOD = 1_000_000_007L;
        long x = 0;
        boolean aSmaller = (a >> n) < (b >> n);
        boolean decided = (a >> n) != (b >> n);
        for (int i = n - 1; i >= 0; i--) {
            long bit = 1L << i;
            int ai = (int) ((a >> i) & 1);
            int bi = (int) ((b >> i) & 1);
            if (ai == bi) {
                if (ai == 0) {
                    x |= bit;
                }
            } else if (!decided) {
                if (ai == 1) {
                    x |= bit;
                }
                aSmaller = true;
                decided = true;
            } else {
                if (aSmaller ? ai == 0 : bi == 0) {
                    x |= bit;
                }
            }
        }
        long first = a ^ x;
        long second = b ^ x;
        return (int) ((first % MOD) * (second % MOD) % MOD);
    }
}