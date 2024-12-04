package com.example.mobileapplicationfinal;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    Animation top_animation, bottom_animation;
    ImageView image;
    TextView logo, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);

        top_animation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        image = findViewById(R.id.main_logo_image_view);
        logo = findViewById(R.id.intro_activity_title);
        slogan = findViewById(R.id.intro_activity_description);

        image.setAnimation(top_animation);
        logo.setAnimation(bottom_animation);
        slogan.setAnimation(bottom_animation);

    }
}