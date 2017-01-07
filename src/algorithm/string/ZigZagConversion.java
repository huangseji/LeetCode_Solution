package algorithm.string;

/**
 * @author Allen on 2017/1/7.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        // the size of a cycle(period)
        int cycle = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j = j + cycle) {
                sb.append(chars[j]);
                int secondJ = (j -i) + cycle - i;
                if(i != 0 && i != numRows - 1 && secondJ < chars.length) {
                    sb.append(chars[secondJ]);
                }
            }
        }
        return sb.toString();
    }
}
