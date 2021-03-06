package com.zhuanghongji.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;

/**
 * Created by zhuanghongji on 2018/5/13.
 */

public class Utils {

    /**
     * 获取当前 Activity 的截屏
     * @param activity 当前需要截屏的 Activity
     */
    public static Bitmap getScreenShotByActivity(Activity activity, String path) {
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        return view.getDrawingCache();
    }
}
