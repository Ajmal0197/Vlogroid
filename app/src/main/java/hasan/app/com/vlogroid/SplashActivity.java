package hasan.app.com.vlogroid;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView sText= findViewById(R.id.sText);

        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Pacifico.ttf");
        sText.setTypeface(type);

        Handler handler =new Handler();

        handler.postDelayed(new Runnable() { //(given a thread for) 3 sec
            @Override
            public void run() {

                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish(); //remove screen from stack so that we cant go back to this screnn on back press...

            }
        }, 3000);
    }
}
