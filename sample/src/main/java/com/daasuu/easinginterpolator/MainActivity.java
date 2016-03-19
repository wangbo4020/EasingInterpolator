package com.daasuu.easinginterpolator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daasuu.ei.Ease;
import com.daasuu.ei.EasingInterpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout flowLayout = (LinearLayout) findViewById(R.id.layout_flow);

        for (Ease ease : Ease.values()) {
            flowLayout.addView(new EasingGraphView(this, ease));
        }
    }
}
