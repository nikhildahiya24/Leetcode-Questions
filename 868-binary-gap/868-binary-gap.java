class Solution {

    public int binaryGap(int n) {
        List<Integer> ll = new ArrayList<Integer>();
        while (n != 0) {
            int rem = n % 2;
            System.out.println(rem);
            n = n / 2;
            ll.add(0, rem);
        }

        System.out.println(ll);
        int gap = 0;
        int beg;
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) == 1) {
                beg = i;
                for (int j = i + 1; j < ll.size(); j++) {
                    if (ll.get(j) == 1) {
                        gap = Math.max(gap, (j - beg));
                        break;
                    }
                }
            }
        }

        return gap;
    }
}
