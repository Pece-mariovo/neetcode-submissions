class Solution {
        public boolean hasDuplicate(int[] nums) {
                int l = nums.length;
                int counter= 0 ;
                for (int i = 0; i < l; i++) {

                    for  (int j = i + 1; j < l; j++) {
                        if (nums[i] == nums[j]){
                            counter++;
                        }
                    }
                }
                if (counter == 0){
                    return false;
                }

            return true;

        }
    }