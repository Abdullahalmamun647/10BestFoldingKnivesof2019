package com.praviKnivesabcd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class topFk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("10 Best Folding Knives");
        setContentView(R.layout.activity_top_fk);
    }

    public void bt1(View view) {
        startActivity(new Intent(topFk.this,bt1.class));
    }

    public void bt2(View view) {
        startActivity(new Intent(topFk.this,bt2.class));
    }

    public void bt3(View view) {
        startActivity(new Intent(topFk.this,bt3.class));
    }

    public void bt4(View view) {
        startActivity(new Intent(topFk.this,bt4.class));
    }

    public void bt5(View view) {
        startActivity(new Intent(topFk.this,bt5.class));
    }

    public void bt6(View view) {
        startActivity(new Intent(topFk.this,bt6.class));
    }

    public void bt7(View view) {
        startActivity(new Intent(topFk.this,bt7.class));
    }

    public void bt8(View view) {
        startActivity(new Intent(topFk.this,bt8.class));
    }

    public void bt9(View view) {
        startActivity(new Intent(topFk.this,bt9.class));
    }

    public void bt10(View view) {
        startActivity(new Intent(topFk.this,bt10.class));
    }
}
