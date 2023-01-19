package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;

public class BetterMainActivityTest {
    @Test
    public void test_three_plus_seven_equals_ten(){
        var scenario = ActivityScenario.launch(MainActivity.class);

        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            Button three = activity.findViewById(R.id.btn_three);
            Button seven = activity.findViewById(R.id.btn_seven);
            Button plus = activity.findViewById(R.id.btn_plus);
            Button equal = activity.findViewById(R.id.btn_equals);

            three.performClick();
            plus.performClick();
            seven.performClick();
            equal.performClick();

            TextView result = activity.findViewById(R.id.display);
            assertEquals(result.getText().toString(), "10");
        });
    }
}

