package com.example.hitcapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Chuyển thẳng sang LoginActivity
        startActivity(new Intent(this, LoginActivity.class));
        finish();   // Đóng MainActivity
    }
}
