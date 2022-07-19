package org.syc.utils;

public class StringUtils {

    /**
     * Checks if a CharSequence is empty(""), null or whitespace only.
     *
     * Whitespace is defined by {@link Character#isWhitespace(char)}
     *
     * @param cs The CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace only
     */
    public static boolean isBlank(final CharSequence cs) {
        if (cs == null || cs.length() == 0) {
            return true;
        }
        for (int i = 0; i < cs.length(); i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
