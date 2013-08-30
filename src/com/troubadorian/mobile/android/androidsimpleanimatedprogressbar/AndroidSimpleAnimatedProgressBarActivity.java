package com.troubadorian.mobile.android.androidsimpleanimatedprogressbar;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class AndroidSimpleAnimatedProgressBarActivity extends Activity
{
    AnimationDrawable frameAnimation = null;

    ImageView imageView = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        imageView = (ImageView) findViewById(R.id.simple_animation);

        imageView.setBackgroundResource(R.drawable.simple_animation);

        // frameAnimation = (AnimationDrawable) imageView.getBackground();
        // frameAnimation.start();

    }

    public void onWindowFocusChanged(boolean hasFocus)
    {
        frameAnimation = (AnimationDrawable) imageView.getBackground();
        if (hasFocus)
        {
            frameAnimation.start();
        } else
        {
            frameAnimation.stop();
        }
    }
}