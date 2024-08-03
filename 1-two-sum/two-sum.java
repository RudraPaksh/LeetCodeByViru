public class Solution {
    /**
     * Finds and returns the indices of two numbers in the array that add up to the target.
     *
     * @param nums   The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the target.
     * @throws IllegalArgumentException If no match is found.
     */
    public int[] twoSum(int[] nums, int target) {
        // Brute force approach: Iterate through each pair of numbers and check if they add up to the target

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i];

                // Check if the complement (the number needed to reach the target) is present in the array
                if (nums[j] == complement) {
                    // Return the indices of the two numbers
                    return new int[]{i, j};
                    
                }
            }
        }

        // If no match is found, throw an IllegalArgumentException
        throw new IllegalArgumentException("No match found for the given target.");
    }
}




//Input: nums = [2,7,11,15], target = 9
            //    i=0 (2)
            //       ,j=i+1(7)
            //       int ans=(target)9-(nums[i])2
            //       if(2 == 7)
            //        return (2,7)

         //solution1
//           public int[] twoSum(int[] nums, int target) {
// // this iis broute force approch
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j< nums.length;j++){
//                 int ans= target - nums[i];
//                 if(nums[j] == ans)
//                 {
//                 return new int[] {i,j};// coz we r retrning indexs
//                  }
//             }
//         }
//         throw new IllegalArgumentException("no match found");
//      }


