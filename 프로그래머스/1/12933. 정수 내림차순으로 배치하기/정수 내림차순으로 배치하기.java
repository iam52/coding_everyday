class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String nn = String.valueOf(n);
        char[] charArray = nn.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] < charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        sb.append(charArray);
        return Long.parseLong(String.valueOf(sb));
    }
}