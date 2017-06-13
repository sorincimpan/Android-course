package sorin.com.tema34;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);


         checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    checkBox.setText("TEXT");
                } else {
                    checkBox.setText("CheckBox");
                }
             }
        }); {
        }
        }
}

