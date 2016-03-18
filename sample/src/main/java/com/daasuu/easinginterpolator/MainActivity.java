package com.daasuu.easinginterpolator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.daasuu.ei.Ease;
import com.daasuu.ei.EasingInterpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.txt_hello);

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                textView, "translationX", 0, 600);

        animator.setDuration(2000)
                .setInterpolator(new EasingInterpolator(Ease.ELASTIC_IN_OUT));
        animator.start();

    }
}
