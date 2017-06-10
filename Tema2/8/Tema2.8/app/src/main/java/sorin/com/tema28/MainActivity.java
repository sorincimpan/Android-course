package sorin.com.tema28;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ToastString;
                EditText editText1 = (EditText)findViewById(R.id.EditTextName);
                EditText editText2 = (EditText)findViewById(R.id.EditTextSurname);
                EditText editText3 = (EditText)findViewById(R.id.EditTextAge);
                EditText editText4 = (EditText)findViewById(R.id.EditTextSex);
                EditText editText5 = (EditText)findViewById(R.id.EditTextOccupation);
                ToastString = editText1.getText() + " " + editText2.getText() + " " + editText3.getText() + " " + editText4.getText() + " " + editText5.getText();
                Toast.makeText(MainActivity.this, ToastString, Toast.LENGTH_LONG).show();
            }
        });
    }
}
