package com.e.vehiclecars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btndiesel, btnclear;
    private EditText make, year, color, price, size;
    private TextView output;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        make = findViewById(R.id.make);
        year = findViewById(R.id.year);
        color = findViewById(R.id.color);
        price = findViewById(R.id.price);
        size = findViewById(R.id.size);
        output = findViewById(R.id.output);
        btndiesel = findViewById(R.id.btndiesel);
        btnclear = findViewById(R.id.btnclear);
        btndiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String manuf = make.getText().toString();
                int yr = Integer.parseInt(year.getText().toString());
                float pr = Float.parseFloat(price.getText().toString());
                float siz = Float.parseFloat(size.getText().toString());
                output.append("This is vehicle No." + i + "\n" + "Manufacturer: " + manuf + " Current value: " +
                        pr + " Effective Engine Size: " + siz + "\n");
            }
        });
    }
    public class StackOverFlow extends AppCompatActivity{

        Button buttonToClick;
        EditText editTextToclear;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            buttonToClick.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    editTextToclear.setText("");
                }
            });
        }

    }
}
