
class Solution {
    public boolean canAliceWin(int n) {
        int first = 10;

        if (n < 10) return false;

        while (n >= first) {
            n = n - first;
            first--;

            if (n < first) return true;

            n = n - first;
            first--;

            if (n < first) return false;
        }

        return false;
    }
}
