package p3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSolution {

    @Test
    public void test() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.solution(955));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.solution(100));
    }
}
