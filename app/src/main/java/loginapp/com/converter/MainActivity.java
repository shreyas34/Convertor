package loginapp.com.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button lengthbutton;
private Button weightbutton;
private Button currencybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lengthbutton = findViewById(R.id.conversion1);
        weightbutton = findViewById(R.id.conversion2);
        volumebutton= findViewById(R.id.conversion3);

        lengthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Metertocentimeter.class);
                startActivity(intent);
            }
        });
        weightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Kgtogms.class);
                startActivity(intent);
            }
        });
        volumebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Currency.class);
                startActivity(intent);
            }
        });


    }
}
