package com.tomtom.ndkex.conference;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Test
    public void testShouldDisplayHelloWorldMessage(){
        assertEquals(getActivity().message.getText().toString(), "Hello World");

    }
}
