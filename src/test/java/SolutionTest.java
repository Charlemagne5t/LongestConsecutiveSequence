import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void longestConsecutiveTest1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int expected = 4;
        int actual = new Solution().longestConsecutive(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void longestConsecutiveTest2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;
        int actual = new Solution().longestConsecutive(nums);

        Assertions.assertEquals(expected, actual);
    }

}
