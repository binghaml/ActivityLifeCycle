package edu.uw.tacoma.mmuppa.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class SomeOtherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_other);
    }

}
