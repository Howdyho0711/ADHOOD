package kr.adhood.foodhood2;

import android.net.Uri;

import java.util.Vector;

/**
 * Created by Hyun on 2016-01-11.
 * Data Frame for VideoInfo
 */
public class VideoInfo {

    private Uri uri;
    private String name;
    private Vector<Double> location;
    private String AccountName;

    public VideoInfo() {
        // test
        name = "왕십리 스테이크";

    }

    public String getName() {
        return name;
    }

}
