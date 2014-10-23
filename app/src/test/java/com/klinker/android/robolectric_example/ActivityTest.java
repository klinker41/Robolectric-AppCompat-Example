package com.klinker.android.robolectric_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

@RunWith(ExampleTestRunner.class)
public class ActivityTest {

    @Test
    public void test_mainActivityStarted() {
        Robolectric.buildActivity(MainActivity.class).create().start().resume().get();
    }

}
