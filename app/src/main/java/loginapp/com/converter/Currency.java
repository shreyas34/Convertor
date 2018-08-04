package loginapp.com.converter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bvimit424 on 23/7/18.
 */

public class Currency extends AppCompatActivity{
    private EditText valueEditText;
    private Button convertrstousdButton;
    private TextView rstousdTextView;
    private Button convertrstopoundsButton;
    private TextView rstopoundsTextView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        valueEditText=findViewById(R.id.valueEditText);
        convertrstousdButton=findViewById(R.id.convertrstousdButton);
        rstousdTextView=findViewById(R.id.rstousdTextView);
        convertrstopoundsButton=findViewById(R.id.convertrstopoundsButton);
        rstopoundsTextView=findViewById(R.id.rstopoundsTextView);

        convertrstousdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = valueEditText.getText().toString();
                int val1 = Integer.parseInt(val);
                double cal = val1 / 68;
                rstousdTextView.setText(String.valueOf(cal));
            }
        });

        convertrstopoundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = valueEditText.getText().toString();
                int val1 = Integer.parseInt(val);
                double cal = val1 / 80;
                rstopoundsTextView.setText(String.valueOf(cal));
            }
        });
    }
}
