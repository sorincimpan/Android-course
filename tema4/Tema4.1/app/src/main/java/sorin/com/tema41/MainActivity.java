package sorin.com.tema41;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] progress = {0};
        final int pBarMax = 100;
        final ProgressBar pBar = (ProgressBar) findViewById(R.id.progressBar);
        pBar.setMax(pBarMax);
        final Thread pBarThread = new Thread() {
            @Override
            public void run() {
                try {
                    while(progress[0] <=pBarMax) {
                        pBar.setProgress(progress[0]);
                        sleep(1000);
                        ++progress[0];
                    }
                }
                catch(InterruptedException e) {
                }
            }
        };

        pBarThread.start();
    }
}
