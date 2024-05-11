class Solution {

    class pair implements Comparable<pair>{
        double a;
        int b;
        pair(double a,int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(pair p) {
            if(this.a > p.a) return 1;
            else if(this.a < p.a) return -1;
            return 0;
        }
    }

    public double mincostToHireWorkers(int[] q, int[] w, int k) {
        int n = q.length;
        List<pair> as = new ArrayList<>();
        for(int i=0;i<n;i++) {
            double ratio = (double) w[i] / (double) q[i];
            as.add(new pair(ratio,q[i]));
        }
        Collections.sort(as);
        // for(pair p : as) System.out.println(p.a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += as.get(i).b;
            pq.add(as.get(i).b);
        }
        double ratio = as.get(k-1).a;
        double ans = ratio * sum;
        for(int i=k;i<n;i++) {
            ratio = as.get(i).a;
            if(pq.isEmpty() == false || pq.peek() > w[i]) {
                sum -= pq.peek();
                pq.poll();
                sum += as.get(i).b;
                pq.add(as.get(i).b);
            }
            ans = Math.min(ans,ratio * sum);
        }
        return ans;
    }
}