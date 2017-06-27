package sorin.com.tema51;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewImage extends AppCompatActivity {
    ListView lv;
    Context context;
    ArrayList programList;

    public static Integer [] MyImages = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6};
    public static String [] MyTexts = {"Par", "Impar", "Parr","Imparr", "Parrr", "Imparrr"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        MyListAdapter adapter = new MyListAdapter(this,MyTexts,MyImages);
        lv = (ListView)findViewById(R.id.MylistView);

        lv.setAdapter(adapter);


    }
}
