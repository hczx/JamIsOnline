package com.jam.android.jamisonline.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jam.android.jamisonline.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @Bind(R.id.man_icon)
    SimpleDraweeView manIcon;
    @Bind(R.id.main_root)
    LinearLayout mainRoot;
    @Bind(R.id.main_start)
    TextView mainStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupWindowAnimator();
        changeLayoutSize();
    }

    private void changeLayoutSize() {
        TransitionManager.beginDelayedTransition(mainRoot);
        ViewGroup.LayoutParams lp = manIcon.getLayoutParams();
        lp.width = 300;
        lp.height = 300;
        manIcon.setLayoutParams(lp);
    }

    private void setupWindowAnimator() {
        getWindow().setReenterTransition(TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.slide_and_changebounds));
    }

    @OnClick(R.id.main_start)
    public void onClick() {
        Log.i("jam", "statr");
        Intent intent = new Intent(this, TypeActivity.class);
        transitionTo(intent);
    }
}
