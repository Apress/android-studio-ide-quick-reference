package net.workingdev.ch6simpleapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

  @Rule
  public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

  @Test
  public void buttonHelloTest() {
    onView(withId(R.id.btnhello))
        .perform(click());

    onView(withId(R.id.textView))
        .check(matches(withText("hello")));
  }

  @Test
  public void buttonWorldTest() {
    onView(withId(R.id.btnworld))
        .perform(click());

    onView(withId(R.id.textView))
        .check(matches(withText("world")));
  }
}