class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> result = new ArrayList<Integer>();
        int n1 = String.valueOf(low).length();
        int n2 = String.valueOf(high).length();

        for (int i = n1; i <= n2; i++) {
            for (int j = 0; j < 10 - i; j++) {
                int num = Integer.parseInt(digits.substring(j, j + i));
                if (num >= low && num <= high)
                    result.add(num);
            }
        }
        return result;
    }
}