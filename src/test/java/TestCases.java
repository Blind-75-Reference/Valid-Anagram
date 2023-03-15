import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        String s = "debug";
        String t = "budge";
        Boolean expected = true;

        Assertions.assertEquals(expected, solution.isAnagram(s, t));

    }

    @Test
    public void testCase2() {
        String s = "a";
        String t = "b";
        Boolean expected = false;

        Assertions.assertEquals(expected, solution.isAnagram(s, t));

    }

    @Test
    public void testCase3() {
        String s = "aaa";
        String t = "a";
        Boolean expected = false;

        Assertions.assertEquals(expected, solution.isAnagram(s, t));

    }

    @Test
    public void testCase4() {
        String s = "a";
        String t = "aaa";
        Boolean expected = false;

        Assertions.assertEquals(expected, solution.isAnagram(s, t));

    }

    @Test
    public void testCase5() {
        String s = "coder";
        String t = "credo";
        Boolean expected = true;

        Assertions.assertEquals(expected, solution.isAnagram(s, t));

    }
}
