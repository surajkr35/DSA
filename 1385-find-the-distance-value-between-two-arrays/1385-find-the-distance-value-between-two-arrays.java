class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int count = n;

        for(int n1 : arr1){
            for(int n2 : arr2){
                if(Math.abs(n1 - n2) <= d){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}

//   ~    Binary Search - O(mlogm+nlogm) 

// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//         Arrays.sort(arr2);
//         int count = 0;

//         for(int n1 : arr1){
//             int left = 0;
//             int right = arr2.length - 1;
//             boolean valid = true;

//             while(left <= right){

//                 int mid = left + (right - left) / 2;

//                 if(Math.abs(n1 - arr2[mid]) <= d){
//                     valid = false;
//                     break;
//                 }
//                 else if(arr2[mid] < n1){
//                     left = mid + 1;
//                 }
//                 else{
//                     right = mid - 1;
//                 }
//             }

//             if(valid){
//                 count++;
//             }
//         }

//         return count;
//     }
// }