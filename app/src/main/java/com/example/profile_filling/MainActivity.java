package com.example.profile_filling;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View view)
    {
        EditText fieldFirst = findViewById(R.id.fieldFirst);
        EditText fieldLast = findViewById(R.id.fieldLast);
        String first = fieldFirst.getText().toString(); //Нужно ли конвертировать в строку?
        String last = fieldLast.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("First", first);
        bundle.putString("Last", last);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
