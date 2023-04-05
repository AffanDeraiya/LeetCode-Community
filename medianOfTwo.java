class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++){
            pq.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            pq.add(nums2[i]);
        }
        int len = pq.size();
        if(len%2==0){
            for(int i=0;i<((len/2)-1);i++){
                pq.remove();
            }
            int k1=pq.poll();
            System.out.println(k1);
            int k2=pq.poll();
            System.out.println(k2);
            double med = (k1+k2)/2.0;
            return med;
        }
        for(int i=0;i<len/2;i++){
            pq.remove();
        }
        double med = pq.poll();
        return med;
    }
}
