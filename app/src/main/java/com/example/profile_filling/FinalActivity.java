package com.example.profile_filling;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class FinalActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        TextView textViewFirst = findViewById(R.id.first);
        TextView textViewLast = findViewById(R.id.last);
        TextView textViewPhone = findViewById(R.id.phone);
        TextView textViewDateOfBirth = findViewById(R.id.dateOfBirth);

        textViewFirst.setText(bundle.getString("First"));
        textViewLast.setText(bundle.getString("Last"));
        textViewPhone.setText(bundle.getString("Phone"));
        textViewDateOfBirth.setText(bundle.getString("DateOfBirth"));
    }
}
