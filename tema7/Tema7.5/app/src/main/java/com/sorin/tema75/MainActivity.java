package com.sorin.tema75;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileOutputStream;

public class MainActivity extends Activity {
    Button b1;
    EditText ed1;
    FileOutputStream outputStream;

    String data;
    private String filename = "mydata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                filename = "myfile";
                data = ed1.getText().toString();
                FileOutputStream outputStream;

                try {
                    outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
                    outputStream.write(data.getBytes());
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();


            }

        });

    }
}
