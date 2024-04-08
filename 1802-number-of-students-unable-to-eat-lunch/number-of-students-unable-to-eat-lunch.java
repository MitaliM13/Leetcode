class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList();
        Queue<Integer> sandwich = new LinkedList();
        for( int i : students ) student.offer( i );
        for( int i : sandwiches ) sandwich.offer( i );
        int count = 0;
        while( true ){
            if( student.peek() == sandwich.peek() ){
                student.poll();
                sandwich.poll();
                count = 0;
            }
            else if( student.peek() != sandwich.peek() ){
                int s = student.poll();
                student.offer( s );
                count++;
            }
            if( student.isEmpty() || count >= student.size() ) break;
        }
        return student.size();
    }
}