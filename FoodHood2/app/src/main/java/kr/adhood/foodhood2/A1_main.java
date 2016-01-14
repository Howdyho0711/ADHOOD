package kr.adhood.foodhood2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.VideoView;

import java.util.ArrayList;

public class A1_main extends AppCompatActivity {

    private ListView mListView;
    //private TransferUtility trUtil;
    //private AmazonS3Client s3;
    private VideoView vidview;
    private ArrayList<VideoInfo> mVInfo;
    private ImageButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_main);

        mListView = (ListView) findViewById(R.id.a1_list);
        mVInfo = new ArrayList<VideoInfo>();

        //test
        for(int i = 0; i < 20; i++) {
            VideoInfo temp = new VideoInfo();
            mVInfo.add(temp);
        }

        /* Set up new Contact Adapter and apply to ListView */
        Context mContext = getApplicationContext();
        VideoAdapter vAdapter = new VideoAdapter(mContext, R.layout.content_a1_main, mVInfo);
        mListView.setAdapter(vAdapter);

        /* Change Current Menu's Button Color */
        homeButton = (ImageButton) findViewById(R.id.homeButton);
        homeButton.setBackgroundColor(Color.BLACK);

        /* Initialize TransferUtility !! */
        //s3 = AwsUtil.getS3Client(this);
        //trUtil = AwsUtil.getTransferUtility(this);
        //vidview = (VideoView) findViewById(R.id.a1_video);

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
