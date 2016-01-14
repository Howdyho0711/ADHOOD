/*package kr.adhood.foodhood2;

import android.content.Context;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
*/
/**
 * Created by Test on 2016-01-06.
 */
/*
public class AwsUtil {
    private static AmazonS3Client sS3Client;
    private static TransferUtility sTransferUtility;
    private static CognitoCachingCredentialsProvider sCredentialsProvider;
*/
    /**
     *  Get Cognito Credentials for S3 Connection
     * @param context
     * @return
     */
/*
    private static CognitoCachingCredentialsProvider getCredProvider (Context context) {
        if(sCredentialsProvider == null) {
            sCredentialsProvider = new CognitoCachingCredentialsProvider(
                    context.getApplicationContext(),
                    "ap-northeast-1:21b72041-238c-4f37-8a5a-33cc3b91e9dc", // Identity Pool ID
                    Regions.AP_NORTHEAST_1 // Region
            );
        }
        return sCredentialsProvider;
    }
*/
    /**
     *  Get S3 Connection by using Credentials.
     * @param context
     * @return
     */
/*
    public static AmazonS3Client getS3Client(Context context) {
        if (sS3Client == null) {
            sS3Client = new AmazonS3Client(getCredProvider(context.getApplicationContext()));
        }
        return sS3Client;
    }
*/
    /**
     *  Get TransferUtility by using S3 Connection and Credentials.
     * @param context
     * @return
     */
/*
    public static TransferUtility getTransferUtility(Context context) {
        if(sTransferUtility == null) {
            sTransferUtility = new TransferUtility(getS3Client(context.getApplicationContext()),
                    context.getApplicationContext());
        }
        return sTransferUtility;
    }
}*/
