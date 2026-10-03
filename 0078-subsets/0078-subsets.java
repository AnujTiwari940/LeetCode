class Solution {
    public List<List<Integer>> subsets(int[] a) {
        int n = a.length;
        int m = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
               if (((i >> j) % 2) == 1) {
                    list.add(a[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
