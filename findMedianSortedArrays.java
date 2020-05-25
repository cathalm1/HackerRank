class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {        
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, pos = 0;
        while (i < a.length && j < b.length)
            answer[pos++] = a[i] < b[j] ? a[i++] :  b[j++];

        while (i < a.length)
            answer[pos++] = a[i++];

        while (j < b.length)
            answer[pos++] = b[j++];
        
        return answer.length % 2 == 0 ? (answer[(answer.length / 2) - 1] + answer[(answer.length / 2)]) / 2.0 : answer[(answer.length / 2)];
    }
}
