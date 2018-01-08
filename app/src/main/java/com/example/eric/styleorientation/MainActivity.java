package com.example.eric.styleorientation;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    private Button btn = null;
    private TextView text = null;
    private RadioGroup g1 = null;
    private RadioGroup g2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.txt);
        g1 =  (RadioGroup) findViewById(R.id.g1);
        g2 =  (RadioGroup) findViewById(R.id.g2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the values from the RadioButtons
                RadioButton b1 = (RadioButton)findViewById(g1.getCheckedRadioButtonId());
                String s = b1.getText().toString();

                RadioButton b2 = (RadioButton)findViewById(g2.getCheckedRadioButtonId());
                String s2 = b2.getText().toString();


                switch(s){
                    case "bold" : {

                        text.setTypeface(null, Typeface.BOLD);


                    }break;

                    case "italic" : {

                        text.setTypeface(null, Typeface.ITALIC);

                    }break;

                    case "normal" : {
                        text.setTypeface(null, Typeface.NORMAL);


                    }
                }

                switch(s2){
                    case "left" : {

                        text.setGravity(Gravity.LEFT);

                    }break;

                    case "center" : {

                        text.setGravity(Gravity.CENTER);

                    }break;

                    case "right" : {
                        text.setGravity(Gravity.RIGHT);


                    }
                }


                text.setText(s + " "+ s2);


            }
        });

    }
}
