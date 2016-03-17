package com.tomtom.ndkex.conference;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }
    public void testShouldDisplayHelloWorldMessage(){
        assertEquals(getActivity().message.getText().toString(), "Hello World");

    }
}
