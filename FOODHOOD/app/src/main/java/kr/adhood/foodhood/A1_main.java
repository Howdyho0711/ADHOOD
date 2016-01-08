package kr.adhood.foodhood;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ListView;
import android.widget.VideoView;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

import java.io.File;
import java.net.URL;

/**
 * Created by Administrator on 2015-12-29.
 */
public class A1_main extends Activity {

    private ListView mListView;
    private TransferUtility trUtil;
    private AmazonS3Client s3;
    private VideoView vidview;

    protected void onCrete(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1_main);


        mListView = (ListView) findViewById(R.id.a1_list);

        Context mContext = getApplicationContext();

        /* Initialize TransferUtility !! */
        s3 = AwsUtil.getS3Client(this);
        trUtil = AwsUtil.getTransferUtility(this);
        vidview = (VideoView) findViewById(R.id.a1_video);

    }

    

}
