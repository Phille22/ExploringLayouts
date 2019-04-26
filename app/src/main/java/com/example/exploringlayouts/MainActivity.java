package com.example.exploringlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    void loadConstraintLayout(View view){
        setContentView(R.layout.activity_main);
    }

    //void loadTableLayout(View view){
    //    setContentView(R.layout.my_table_layout);
    //}
}
