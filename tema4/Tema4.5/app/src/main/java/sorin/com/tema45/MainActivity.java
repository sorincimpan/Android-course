package sorin.com.tema45;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final String[] months = new String[]{"January", "February", "March", "April",
//                "May", "June", "July", "August", "September", "October",
//                "November", "December"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, months);
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(adapter);
    }
    private static final String[] months = new String[] {
            "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"
    };
    }

