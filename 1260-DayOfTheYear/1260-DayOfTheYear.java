// Last updated: 09/07/2026, 09:11:30
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int[] prefix = {0, 31, 59, 90, 120, 151, 181,212, 243, 273, 304, 334};
        int result = prefix[month - 1] + day;
        if (month > 2 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            result++;
        }
        return result;
    }
}