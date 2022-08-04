public class Solution {
        public static int[] twoSum(int[] nums, int target) {
            target = 0;
            int [] output = new int[2];
            for (int i = 0 ; i < nums.length;i++){
                for (int j = i+1;j < nums.length;j++){
                    if (nums[i] + nums[j] == target){
                        output[0] = nums[i];
                        output[1] = nums[j];
                        break;
                    }
                    System.out.println(nums[j]);

                }
            }
            return new int[]{output[0]};
        }

    public static void main(String[] args) {
        int[] output = twoSum(new int[]{2, 2, 4}, 6);
        for (Integer i : output){
            System.out.println(i);
        }
    }
    }

