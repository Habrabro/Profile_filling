package com.example.profile_filling;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void nextActivity(View view)
    {
        EditText fieldPhone = findViewById(R.id.phone);
        EditText fieldDateOfBirth = findViewById(R.id.dateOfBirth);
        String phone = fieldPhone.getText().toString();
        String dateOfBirth = fieldDateOfBirth.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("Phone", phone);
        bundle.putString("DateOfBirth", dateOfBirth);

        Intent intent = new Intent(this, FinalActivity.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtras(bundle);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
