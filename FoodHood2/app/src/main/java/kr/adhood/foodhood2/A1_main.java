package kr.adhood.foodhood2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.VideoView;

import java.util.ArrayList;

public class A1_main extends AppCompatActivity {

    private ListView mListView;
    //private TransferUtility trUtil;
    //private AmazonS3Client s3;
    private VideoView vidview;
    private ArrayList<VideoInfo> mVInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_main);

        mListView = (ListView) findViewById(R.id.a1_list);
        mVInfo = new ArrayList<VideoInfo>();

        //test
        for(int i = 0; i < 10; i++) {
            VideoInfo temp = new VideoInfo();
            mVInfo.add(temp);
        }

        Log.d("mVInfo", String.valueOf(mVInfo.size()));

        /* Set up new Contact Adapter and apply to ListView */
        Context mContext = getApplicationContext();
        VideoAdapter vAdapter = new VideoAdapter(mContext, R.layout.content_a1_main, mVInfo);
        mListView.setAdapter(vAdapter);

        /* Initialize TransferUtility !! */
        //s3 = AwsUtil.getS3Client(this);
        //trUtil = AwsUtil.getTransferUtility(this);
        //vidview = (VideoView) findViewById(R.id.a1_video);
    }

}
