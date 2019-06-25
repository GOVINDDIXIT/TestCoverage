package app.dixit.govind.testcoverage

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test


class MainActivityUITest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun clickButtonToChangeText() {
        onView(withId(R.id.button))
            .check(matches(isDisplayed()))
            .perform(click())
        onView(withId(R.id.textView)).check(matches(withText("Hello World!")))
    }
}