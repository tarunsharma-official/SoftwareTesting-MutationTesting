package org.example;

import java.util.Arrays;

public class StaticRangeMinimumQueries {
    private long[] seg; // Segment tree array
    private long[] arr; // Input array

    public StaticRangeMinimumQueries(long[] input) {
        int n = input.length;
        this.arr = input;
        this.seg = new long[4 * n];
        Arrays.fill(seg, Long.MAX_VALUE); // Initialize segment tree with max value
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
        seg[i] = Math.min(seg[2 * i + 1], seg[2 * i + 2]);
    }

    // Query the minimum in range [l, r]
    public long query(int l, int r) {
        return query(0, l, r, 0, arr.length - 1);
    }

    private long query(int i, int l, int r, int start, int end) {
        if (end < l || r < start) {
            return Long.MAX_VALUE; // No overlap
        }
        if (start >= l && end <= r) {
            return seg[i]; // Total overlap
        }

        int mid = (start + end) >> 1;
        long left = query(2 * i + 1, l, r, start, mid);
        long right = query(2 * i + 2, l, r, mid + 1, end);
        return Math.min(left, right); // Partial overlap
    }

    // Update a value in the array and segment tree
    public void update(int index, long value) {
        update(0, 0, arr.length - 1, index, value);
    }

    private void update(int i, int start, int end, int index, long value) {
        if (start == end) {
            seg[i] = value;
            arr[start] = value;
            return;
        }

        int mid = (start + end) >> 1;
        if (index <= mid) {
            update(2 * i + 1, start, mid, index, value);
        } else {
            update(2 * i + 2, mid + 1, end, index, value);
        }

        seg[i] = Math.min(seg[2 * i + 1], seg[2 * i + 2]);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        long[] arr = new long[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextLong();
//        }
//
//        StaticRangeMinimumQueries staticRangeMinimumQueries = new StaticRangeMinimumQueries(arr);
//
//        for (int i = 0; i < m; i++) {
//            int l = scanner.nextInt() - 1; // Convert to 0-based index
//            int r = scanner.nextInt() - 1; // Convert to 0-based index
//            System.out.println(staticRangeMinimumQueries.query(l, r));
//        }
//        scanner.close();
    }
}
