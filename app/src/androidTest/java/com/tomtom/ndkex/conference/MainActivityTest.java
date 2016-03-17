package com.tomtom.ndkex.conference;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
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

    @Test
    public void testShouldDisplayMessage(){
        Espresso.onView(ViewMatchers.withId(R.id.text)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}
