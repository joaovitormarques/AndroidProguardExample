package com.example.joaovitor.proguardexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.fill_field);
        button = findViewById(R.id.get_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = editText.getText().toString();
                Person person = new Person(word, null);
                String sentence = "The text is \"" + word +"\" with lenght of " + word.length();
                Toast.makeText(MainActivity.this, person.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
