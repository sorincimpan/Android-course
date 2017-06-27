package sorin.com.tema51;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import sorin.com.tema51.R;

/**
 * Created by Sorin on 6/27/2017.
 */

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] appTexts;
    private final Integer [] appImages;

    public MyListAdapter(Activity context, String[] appTexts, Integer[] appImages) {
        super(context, R.layout.activity_image_list,appTexts);
        this.context = context;
        this.appTexts = appTexts;
        this.appImages = appImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list,null,true);
        TextView txtView = (TextView) rowView.findViewById(R.id.textView1);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imageView1);
        if (position % 2 ==0) {
            txtView.setText(appTexts[position]);
            imgView.setImageResource(appImages[0]);
        } else {
            txtView.setText(appTexts[position]);
            imgView.setImageResource(appImages[position]);
        }





        return rowView;
    }
}
