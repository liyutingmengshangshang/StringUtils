/* ------------------------------------------------------------------------
 * Copyright 2011 Tomofumi Kitano
 * ------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ------------------------------------------------------------------------
 */

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
