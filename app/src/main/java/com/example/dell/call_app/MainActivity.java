package com.example.dell.call_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final   TextView t1=findViewById(R.id.t1);

        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent i=new Intent(MainActivity.this,Main2Activity.class);


                if ( Integer.parseInt(t1.getText().toString()) > 500)
                {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    Intent intent = i.setData(Uri.parse(i));

                }
            }
    }
}
}
