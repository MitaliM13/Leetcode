import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Arrays.sort(arr);
        PriorityQueue<Pair<Double, Pair<Integer, Integer>>> maxHeap = new PriorityQueue<>(
                (a, b) -> Double.compare(b.getKey(), a.getKey()));
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double fraction = (double) arr[i] / arr[j];
                maxHeap.offer(new Pair<>(fraction, new Pair<>(arr[i], arr[j])));

                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }

        Pair<Integer, Integer> res = maxHeap.poll().getValue();
        return new int[]{res.getKey(), res.getValue()};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};
        int k = 3;
        Solution solution = new Solution();
        int[] result = solution.kthSmallestPrimeFraction(arr, k);
        System.out.println(Arrays.toString(result));
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
