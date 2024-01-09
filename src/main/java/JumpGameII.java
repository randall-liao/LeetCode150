// TODO redo
public class JumpGameII {
    public static int jump(int[] nums) {
       int leftIndex = 0;
       int rightIndex = 0;
       int numberOfJumps = 0;
       while (rightIndex < nums.length - 1) {
           int farthestIndex = 0;
           for (int i = leftIndex; i < rightIndex + 1; i++) {
               // find out the furthest index a point within left ant right bound can jump to.
               farthestIndex = Math.max(farthestIndex, nums[i] + i);
           }
           leftIndex = rightIndex + 1;
           rightIndex = farthestIndex;
           numberOfJumps++;
       }
       return numberOfJumps;
    }
}
