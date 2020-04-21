package com.app.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkIos, chkAndroid, chkWindows;
    Button btnDisplay;
    TextView Tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tv1=findViewById(R.id.textView);
        chkIos =  findViewById(R.id.chkIos);
        chkAndroid =  findViewById(R.id.chkAndroid);
        chkWindows =  findViewById(R.id.chkWindows);
        btnDisplay =  findViewById(R.id.btnDisplay);

        Fun1ChkIos();
        Fun2Button();


    }

    public void Fun1ChkIos() {
        chkIos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (chkIos.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Hi ", Toast.LENGTH_LONG).show();
                }
                else {

                    Toast.makeText(MainActivity.this,
                            "Bye !", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void Fun2Button() {

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("IPhone check Status: ").append(chkIos.isChecked());
                result.append("\nAndroid check : ").append(chkAndroid.isChecked());
                result.append("\nWindows check :").append(chkWindows.isChecked());

                Toast.makeText(MainActivity.this, result.toString(),Toast.LENGTH_LONG).show();
            }
        });

        Tv1.setText("Welcome at D Zone");
    }
}
