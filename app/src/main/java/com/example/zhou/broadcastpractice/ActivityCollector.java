package com.example.zhou.broadcastpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理所有activity
 * Created by zhou on 2017/2/13.
 */

public class ActivityCollector {

    private static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
