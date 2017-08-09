package com.sorin.tema82;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox cb1,cb2,cb3;

        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("cb1"));
        cb1.setOnCheckedChangeListener(this);
        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("cb2"));
        cb2.setOnCheckedChangeListener(this);
        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("cb3"));
        cb3.setOnCheckedChangeListener(this);


    }
    private boolean getFromSP(String key){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
    private void saveInSp(String key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch(buttonView.getId()){
            case R.id.checkBox1:
                saveInSp("cb1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("cb2",isChecked);
                break;

            case R.id.checkBox3:
                saveInSp("cb3",isChecked);
                break;

        }

    }
}

