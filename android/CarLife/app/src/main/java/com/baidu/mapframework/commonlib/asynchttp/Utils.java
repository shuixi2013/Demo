package com.baidu.mapframework.commonlib.asynchttp;

class Utils {
    private Utils() {
    }

    public static void asserts(boolean expression, String failedMessage) {
        if (!expression) {
            throw new AssertionError(failedMessage);
        }
    }

    public static <T> T notNull(T argument, String name) {
        if (argument != null) {
            return argument;
        }
        throw new IllegalArgumentException(name + " should not be null!");
    }
}
