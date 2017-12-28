package br.com.marcioaleson.androidtestsexample;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void loginActivityTest() {
        ViewInteraction button = onView(
                allOf(withId(com.android.packageinstaller.R.id.permission_allow_button),
                        childAtPosition(
                                allOf(withId(com.android.packageinstaller.R.id.button_group),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction frameLayout = onView(
                allOf(withId(com.android.packageinstaller.R.id.desc_container),
                        childAtPosition(
                                allOf(withId(com.android.packageinstaller.R.id.dialog_container),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class),
                                                0)),
                                0),
                        isDisplayed()));
        frameLayout.check(matches(isDisplayed()));

        ViewInteraction button2 = onView(
                allOf(withId(com.android.packageinstaller.R.id.permission_deny_button),
                        childAtPosition(
                                allOf(withId(com.android.packageinstaller.R.id.button_group),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                0),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

        ViewInteraction button3 = onView(
                allOf(withId(com.android.packageinstaller.R.id.permission_deny_button),
                        childAtPosition(
                                allOf(withId(com.android.packageinstaller.R.id.button_group),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                0),
                        isDisplayed()));
        button3.check(matches(isDisplayed()));

        ViewInteraction textView = onView(
                allOf(withText("AndroidTestsExample"),
                        childAtPosition(
                                allOf(withId(R.id.action_bar),
                                        childAtPosition(
                                                withId(R.id.action_bar_container),
                                                0)),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("AndroidTestsExample")));

        ViewInteraction textInputLayout = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.email_login_form),
                                childAtPosition(
                                        withId(R.id.login_form),
                                        0)),
                        0),
                        isDisplayed()));
        textInputLayout.check(matches(isDisplayed()));

        ViewInteraction textInputLayout2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.email_login_form),
                                childAtPosition(
                                        withId(R.id.login_form),
                                        0)),
                        1),
                        isDisplayed()));
        textInputLayout2.check(matches(isDisplayed()));

        ViewInteraction button4 = onView(
                allOf(withId(R.id.email_sign_in_button),
                        childAtPosition(
                                allOf(withId(R.id.email_login_form),
                                        childAtPosition(
                                                withId(R.id.login_form),
                                                0)),
                                2),
                        isDisplayed()));
        button4.check(matches(isDisplayed()));

        ViewInteraction scrollView = onView(
                allOf(withId(R.id.login_form),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        scrollView.check(matches(isDisplayed()));

        ViewInteraction scrollView2 = onView(
                allOf(withId(R.id.login_form),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        scrollView2.check(matches(isDisplayed()));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
