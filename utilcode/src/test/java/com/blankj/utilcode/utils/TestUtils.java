package com.blankj.utilcode.utils;

import java.io.File;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/8/21
 *     desc  : 单元测试工具类
 * </pre>
 */
public class TestUtils {

    private TestUtils() {
        throw new UnsupportedOperationException("u can't fuck me...");
    }

    public static final char SEP = File.separatorChar;

    public static final String BASEPATH = System.getProperty("user.dir")
            + SEP + "src" + SEP + "test" + SEP + "res" + SEP;
}
