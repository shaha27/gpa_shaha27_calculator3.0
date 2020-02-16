//This app was helped by using Youtube and online references. 
package com.example.gpa_shaha27_calculator30;

        import androidx.appcompat.app.AppCompatActivity;
         import android.support.v4.app.*;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1, e2, e3, e4, e5;
    TextView vt1;
    int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.h2);
        e1 = findViewById(R.id.f1);
        e2 = findViewById(R.id.f2);
        e3 = findViewById(R.id.f3);
        e4 = findViewById(R.id.f4);
        e5 = findViewById(R.id.f5);

        vt1 = findViewById(R.id.k1);
        vt1.setBackgroundColor(Color.BLUE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float r1, r2, r3, r4, r5;
                if(grade % 2 == 0){
                    if (e1.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("") || e4.getText().toString().equals("") || e5.getText().toString().equals("")) {
                        vt1.setText("Please enter the grades");
                    } else {
                        r1 = Float.parseFloat(e1.getText().toString());
                        r2 = Float.parseFloat(e1.getText().toString());
                        r3 = Float.parseFloat(e1.getText().toString());
                        r4 = Float.parseFloat(e1.getText().toString());
                        r5 = Float.parseFloat(e1.getText().toString());

                        float btavg = r1 + r2 + r3 + r4 + r5;
                        btavg = btavg /5;

                        if (btavg < 60){
                            vt1.setText(Float.toString(btavg));
                            vt1.setBackgroundColor(Color.RED);
                        } else if (btavg > 60 && btavg < 80){
                            vt1.setText(Float.toString(btavg));
                            vt1.setBackgroundColor(Color.YELLOW);
                        } else if (btavg >= 80 && btavg <= 100){
                            vt1.setText(Float.toString(btavg));
                            vt1.setBackgroundColor(Color.GREEN);
                        }
                        grade++;
                        vt1.setText("Clear");
                    }
                } else {
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                    e5.setText("");
                    vt1.setText("");
                    b1.setText("Compute the GPA");
                    vt1.setBackgroundColor(Color.WHITE);
                    grade++;

                    Random random = new Random();
                    int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    v.setBackgroundColor(color);
                }
            }
        });


    }
}
