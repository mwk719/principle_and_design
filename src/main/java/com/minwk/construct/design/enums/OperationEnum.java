package com.minwk.construct.design.enums;

/**
 * @author MinWeikai
 * @date 2021/9/24 16:56
 */
public enum OperationEnum implements Operation {
    /**
     *
     */
    ADD {
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    }

    ;

}
