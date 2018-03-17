import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Auther Yogesh Manware
 */
public class TestTask1 {

    @Test
    public void testGetCode() {
        Assert.assertEquals("N10", Task1.getCode());
    }
}
