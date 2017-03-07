package com.example.mavric.rectangle_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {

    private EditText    heightTxt,
                        breadthTxt;
    private Button      areaBtn ,
                        perimeterBtn;
    private TextView    output;

    private double  height,
                    breadth,
                    area,
                    perimeter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        heightTxt       = (EditText) findViewById(R.id.heightInput);
        breadthTxt      = (EditText) findViewById(R.id.breadthInput);
        areaBtn         = (Button) findViewById(R.id.btnAreaCalc);
        perimeterBtn    = (Button) findViewById(R.id.btnPerimeterCalc);
        output          = (TextView) findViewById(R.id.answerLabel);

        areaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AreaCalculation();
            }
        });

        perimeterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                PerimeterCalculation();
            }
        }  );
    }

    public void AreaCalculation(){

        height = Double.parseDouble(heightTxt.getText().toString());
        breadth = Double.parseDouble(breadthTxt.getText().toString());

        area = height * breadth;

        output.setText("Area is: " + area);
    }

    public void PerimeterCalculation(){
        height = Double.parseDouble(heightTxt.getText().toString());
        breadth = Double.parseDouble(breadthTxt.getText().toString());

        perimeter = (height + breadth) * 2;

        output.setText("Perimeter is: " + perimeter);
    }
}
