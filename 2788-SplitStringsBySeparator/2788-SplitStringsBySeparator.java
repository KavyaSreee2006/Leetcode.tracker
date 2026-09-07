// Last updated: 07/09/2026, 14:27:02
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            String[] parts = word.split("\\" + separator);
            for (String part : parts) {
                if (!part.equals("")) {
                    ans.add(part);
                }
            }
        }
        return ans;
    }
}