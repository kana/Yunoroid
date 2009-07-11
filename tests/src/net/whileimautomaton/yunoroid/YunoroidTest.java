package net.whileimautomaton.yunoroid;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class net.whileimautomaton.yunoroid.YunoroidTest \
 * net.whileimautomaton.yunoroid.tests/android.test.InstrumentationTestRunner
 */
public class YunoroidTest extends ActivityInstrumentationTestCase<Yunoroid> {

    public YunoroidTest() {
        super("net.whileimautomaton.yunoroid", Yunoroid.class);
    }

}
