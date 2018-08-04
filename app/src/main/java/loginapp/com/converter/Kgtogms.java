package loginapp.com.converter;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bvimit424 on 23/7/18.
 */

public class Kgtogms extends AppCompatActivity {
    private EditText kgtogmsedittext;
    private Button kgtogmsbutton;
    private TextView kgtogmstextview;
    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kgtogms);
        kgtogmsedittext=findViewById(R.id.kgtogmsedittext);
        kgtogmsbutton=findViewById(R.id.kgtogmsbutton);
        kgtogmstextview=findViewById(R.id.kgtogmstextview);

        kgtogmsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=kgtogmsedittext.getText().toString();
                int val1=Integer.parseInt(val);
                double cal=val1/1000;
                kgtogmstextview.setText(String.valueOf(cal));
            }
        });


    }
}
