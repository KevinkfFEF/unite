package com.unite.tools;

import android.util.Log;

/**
 * Created by 清风 on 2015/10/26.
 * Log管理工具
 */
public class TLog {
    public static final String LOG_TAG = "TLog";
    public static boolean DEBUG = true;
    public static boolean ERROR_DEBUG=true;
    public static boolean WARN_DEBUG=false;

    public static final void error(String log) {
        if (ERROR_DEBUG)
            Log.e(LOG_TAG, "" + log);
    }

    public static final void log(String log) {
        if (DEBUG)
            Log.i(LOG_TAG, log);
    }

    public static final void log(String tag, String log) {
        if (DEBUG)
            Log.i(tag, log);
    }

    public static final void logv(String log) {
        if (DEBUG)
            Log.v(LOG_TAG, log);
    }

    public static final void warn(String log) {
        if (WARN_DEBUG)
            Log.w(LOG_TAG, log);
    }
}
