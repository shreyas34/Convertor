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

public class Metertocentimeter extends AppCompatActivity{
    private EditText mtocmtext;
    private Button mtocmbutton;
    private Button mtocmbutton2;
    private TextView mtocmtextview;
    private TextView mtocmtextview2;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtocm);

        mtocmtext =findViewById(R.id.mtocmtext);
        mtocmbutton=findViewById(R.id.mtocmbutton);
        mtocmbutton2=findViewById(R.id.mtocmbutton2);
        mtocmtextview=findViewById(R.id.mtocmtextview);
        mtocmtextview2=findViewById(R.id.mtocmtextview2);

        mtocmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=mtocmtext.getText().toString();
                int val1=Integer.parseInt(s);
                int cal=val1/1000;
                mtocmtextview.setVisibility(View.VISIBLE);
                mtocmtextview.setText(String.valueOf(cal));
            }
        });

        mtocmbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=mtocmtext.getText().toString();
                int val1=Integer.parseInt(s);
                int cal=val1*100;
                mtocmtextview2.setVisibility(View.VISIBLE);
                mtocmtextview2.setText(String.valueOf(cal));
            }
        });
    }
}
