class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
       Arrays.sort(deck);
       int n = deck.length;
       int[]res = new int[n];
       Deque <Integer> ind = new LinkedList<>();

       for(int i = 0; i < n; i++){
        ind.add(i);
       }
       for(int card:deck){
        int idx = ind.poll();
        res[idx] = card;
        if(!ind.isEmpty()){
            ind.add(ind.poll());
        }
       }
       return res;
    }
}