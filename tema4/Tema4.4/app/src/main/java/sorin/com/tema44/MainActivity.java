package sorin.com.tema44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        String[] months = new String[]{"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,months);
        gridView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,months));
    }
}
