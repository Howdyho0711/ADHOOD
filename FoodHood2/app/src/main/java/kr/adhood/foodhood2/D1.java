package kr.adhood.foodhood2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Test on 2016-01-14.
 */
public class D1 extends Activity{

    private ImageButton myUserButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);

        /* Change Current Menu's Button Color */
        myUserButton = (ImageButton) findViewById(R.id.userButton);
        myUserButton.setBackgroundColor(Color.BLACK);

        findViewById(R.id.homeButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), A1_main.class));
            }
        });

        findViewById(R.id.searchButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), B1.class));
            }
        });

        findViewById(R.id.noticeButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), C1.class));
            }
        });

        findViewById(R.id.userButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), D1.class));
            }
        });
    }
}
