import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testLongestCommonSubstring() throws Exception {

        Assert.assertArrayEquals(new CharSequence[]{"ABA", "BAB"}, StringUtils.longestCommonSubstring("ABAB", "BABA"));

        Assert.assertArrayEquals(new CharSequence[]{"ABA"}, StringUtils.longestCommonSubstring("ABAB", "CABA"));

        Assert.assertArrayEquals(new CharSequence[]{"BAB"}, StringUtils.longestCommonSubstring("ABAB", "BABC"));

        Assert.assertArrayEquals(new CharSequence[]{"AB", "BA"}, StringUtils.longestCommonSubstring("ABAB", "BABA", "ABBA"));
    }
}
