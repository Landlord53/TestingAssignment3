package com.example.nikolai.lengthUnitTranslator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class UITest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void translateToCmTest() throws Exception {
        onView(withId(R.id.inputValue)).perform(typeText("100"));
        onView(withId(R.id.cmBtn)).perform(click());
        TextView output = (TextView) mActivityRule.getActivity().findViewById(R.id.outputValue);
        Assert.assertEquals(10000.0, Double.parseDouble(output.getText().toString()), 0.0);

        onView(withId((R.id.inputValue))).perform(clearText());

        onView(withId(R.id.inputValue)).perform(typeText("40"));
        onView(withId(R.id.cmBtn)).perform(click());
        output = (TextView) mActivityRule.getActivity().findViewById(R.id.outputValue);
        Assert.assertEquals(4000.0, Double.parseDouble(output.getText().toString()), 0.0);
    }

    @Test
    public void translateToKmTest() throws Exception {
        onView(withId(R.id.inputValue)).perform(typeText("100"));
        onView(withId(R.id.kmBtn)).perform(click());
        TextView output = (TextView) mActivityRule.getActivity().findViewById(R.id.outputValue);
        Assert.assertEquals(0.1, Double.parseDouble(output.getText().toString()), 0.0);

        onView(withId((R.id.inputValue))).perform(clearText());

        onView(withId(R.id.inputValue)).perform(typeText("40"));
        onView(withId(R.id.kmBtn)).perform(click());
        output = (TextView) mActivityRule.getActivity().findViewById(R.id.outputValue);
        Assert.assertEquals(0.04, Double.parseDouble(output.getText().toString()), 0.0);
    }

    @Test
    public void translateToFtTest() throws Exception {
        onView(withId(R.id.inputValue)).perform(typeText("100"));
        onView(withId(R.id.ftBtn)).perform(click());
        TextView output = (TextView) mActivityRule.getActivity().findViewById(R.id.outputValue);
        Assert.assertEquals(328.08, Double.parseDouble(output.getText().toString()), 0.1);

        onView(withId((R.id.inputValue))).perform(clearText());

        onView(withId(R.id.inputValue)).perform(typeText("40"));
        onView(withId(R.id.ftBtn)).perform(click());
        output = (TextView) mActivityRule.getActivity().findViewById(R.id.outputValue);
        Assert.assertEquals(131.232, Double.parseDouble(output.getText().toString()), 0.0);
    }
}
