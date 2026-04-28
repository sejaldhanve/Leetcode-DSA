class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1=0;
        int count2=0;
        int[] arr=new int[2];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    count1++;
                    break;
                }
            }
        }
        arr[0]=count1;
        for(int j=0;j<nums2.length;j++){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]==nums2[j]){
                    count2++;
                    break;
                }
            }
        }
        arr[1]=count2;

        return arr;
        
    }
}