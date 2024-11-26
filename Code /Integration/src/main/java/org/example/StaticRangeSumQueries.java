package org.example;

public class StaticRangeSumQueries {
    private long[] seg; // Segment tree array
    private long[] arr; // Input array

    public StaticRangeSumQueries(long[] input) {
        int n = input.length;
        this.arr = input;
        this.seg = new long[4 * n];
        build(0, 0, n - 1);
    }

    // Build the segment tree
    private void build(int i, int start, int end) {
        if (start == end) {
            seg[i] = arr[start];
            return;
        }

        int mid = (start + end) >> 1;
        build(2 * i + 1, start, mid);
        build(2 * i + 2, mid + 1, end);
        seg[i] = seg[2 * i + 1] + seg[2 * i + 2];
    }

    // Query the sum in a range [l, r]
    public long query(int l, int r) {
        return query(0, 0, arr.length - 1, l, r);
    }

    private long query(int i, int start, int end, int l, int r) {
        if (end < l || r < start) {
            return 0; // No overlap
        }
        if (start >= l && end <= r) {
            return seg[i]; // Total overlap
        }

        int mid = (start + end) >> 1;
        long left = query(2 * i + 1, start, mid, l, r);
        long right = query(2 * i + 2, mid + 1, end, l, r);
        return left + right; // Partial overlap
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int q = scanner.nextInt();
//        long[] arr = new long[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextLong();
//        }
//
//        StaticRangeSumQueries staticRangeSumQueries = new StaticRangeSumQueries(arr);
//
//        while (q-- > 0) {
//            int l = scanner.nextInt() - 1; // Convert to 0-based index
//            int r = scanner.nextInt() - 1; // Convert to 0-based index
//            System.out.println(staticRangeSumQueries.query(l, r));
//        }
//        scanner.close();
    }
}
