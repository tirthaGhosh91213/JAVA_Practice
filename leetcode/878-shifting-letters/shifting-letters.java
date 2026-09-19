class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        StringBuilder str = new StringBuilder();

        int shift = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {

            shift = (shift + shifts[i]) % 26;

            char ch = s.charAt(i);

            int newPos = (ch - 'a' + shift) % 26;

            str.append((char)('a' + newPos));
        }

        return str.reverse().toString();
    }
}