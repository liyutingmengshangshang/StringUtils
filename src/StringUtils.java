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

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static CharSequence[] longestCommonSubstring(CharSequence... input) throws Exception {

        if (input.length == 2) {
            return longestCommonSubstring(input[0], input[1]);
        } else {
            throw new Exception("Still ongoing project!");
        }
    }

    public static CharSequence[] longestCommonSubstring(CharSequence sequence1, CharSequence sequence2) {
        return _longestCommonSubstringByDynamicProgramming(sequence1, sequence2);
    }

    private static CharSequence[] _longestCommonSubstringByDynamicProgramming(CharSequence sequence1, CharSequence sequence2) {

        int maxLength = 0;

        List<CharSequence> resultList = new ArrayList<CharSequence>();

        int[][] table = new int[sequence1.length()][sequence2.length()];

        for (int i = 0; i < sequence1.length(); i++) {
            for (int j = 0; j < sequence2.length(); j++) {

                if (sequence1.charAt(i) == sequence2.charAt(j)) {

                    if (i == 0 || j == 0) {
                        table[i][j] = 1;
                    } else {
                        table[i][j] = table[i - 1][j - 1] + 1;
                    }

                    // Found longer substring. Clear the resultList. Will be adding the substring in following section.
                    if (table[i][j] > maxLength) {
                        maxLength = table[i][j];
                        resultList.clear();
                    }

                    // Found another substring witch has length of "maxLength"
                    if (table[i][j] == maxLength) {
                        resultList.add(sequence1.subSequence(i - maxLength + 1, i + 1));
                    }
                }
            }
        }

        return resultList.toArray(new CharSequence[resultList.size()]);
    }
}
