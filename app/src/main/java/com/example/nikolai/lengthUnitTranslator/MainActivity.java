package com.example.nikolai.lengthUnitTranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MeterToOtherLengthUnitTranslator translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cm = (Button)findViewById(R.id.cmBtn);
        // Register the onClick listener with the implementation above
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                translateToCm(view);
            }
        });

        Button km = (Button)findViewById(R.id.kmBtn);
        // Register the onClick listener with the implementation above
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                translateToKm(view);
            }
        });

        Button ft = (Button)findViewById(R.id.ftBtn);
        // Register the onClick listener with the implementation above
        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                translateToFt(view);
            }
        });
    }

    public void translateToCm(View view) {
        EditText inputValue = (EditText) this.findViewById(R.id.inputValue);

        String inputStr = inputValue.getText().toString();

        if (inputStr.isEmpty()) {
            return;
        }

        translator = new MeterToOtherLengthUnitTranslator(Double.parseDouble(inputStr));

        TextView outputValue = (TextView) this.findViewById(R.id.outputValue);
        String outputStr = Double.toString(translator.meterToCm());
        outputValue.setText(outputStr.toCharArray(), 0, outputStr.toCharArray().length);
    }

    public void translateToKm(View view) {
        EditText inputValue = (EditText) this.findViewById(R.id.inputValue);

        String inputStr = inputValue.getText().toString();

        if (inputStr.isEmpty()) {
            return;
        }

        translator = new MeterToOtherLengthUnitTranslator(Double.parseDouble(inputStr));

        TextView outputValue = (TextView) this.findViewById(R.id.outputValue);
        String outputStr = Double.toString(translator.meterToKm());
        outputValue.setText(outputStr.toCharArray(), 0, outputStr.toCharArray().length);
    }

    public void translateToFt(View view) {
        EditText inputValue = (EditText) this.findViewById(R.id.inputValue);

        String inputStr = inputValue.getText().toString();

        if (inputStr.isEmpty()) {
            return;
        }

        translator = new MeterToOtherLengthUnitTranslator(Double.parseDouble(inputStr));

        TextView outputValue = (TextView) this.findViewById(R.id.outputValue);
        String outputStr = Double.toString(translator.meterToFt());
        outputValue.setText(outputStr.toCharArray(), 0, outputStr.toCharArray().length);
    }
}
