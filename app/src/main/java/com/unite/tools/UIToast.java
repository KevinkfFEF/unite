package com.unite.tools;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.unite.http.RxRetrofitApp;


/**
 * Created by KEVIN on 2016/1/12.
 */
public class UIToast {

    /**
     * 定义全局toast
     */
    private static Toast mToast = null;
    private static Handler handler = new Handler(Looper.getMainLooper());
    private static Object synObj = new Object();

    /**
     * 显示短时间toast(字符串)
     *
     * @param message
     */
    public static void showToastshort(String message) {
        if (mToast == null) {
            mToast = Toast.makeText(RxRetrofitApp.getApplication(), message, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(message);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    /**
     * 显示短时间toast(资源id)
     *
     * @param message
     */
    public static void showToastshort(int message) {
        if (mToast == null) {
            mToast = Toast.makeText(RxRetrofitApp.getApplication(), message, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(message);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    /**
     * 显示长时间toast（字符串）
     *
     * @param message
     */
    public static void showToastlong(String message) {
        if (mToast == null) {
            mToast = Toast.makeText(RxRetrofitApp.getApplication(), message, Toast.LENGTH_LONG);
        } else {
            mToast.setText(message);
            mToast.setDuration(Toast.LENGTH_LONG);
        }
        mToast.show();
    }

    /**
     * 显示长时间toast（资源id）
     *
     * @param message
     */
    public static void showToastlong(int message) {
        if (mToast == null) {
            mToast = Toast.makeText(RxRetrofitApp.getApplication(), message, Toast.LENGTH_LONG);
        } else {
            mToast.setText(message);
            mToast.setDuration(Toast.LENGTH_LONG);
        }
        mToast.show();
    }

    /**
     * Toast发送消息,自定义时间（字符串资源id）
     *
     * @param msg
     * @param len
     * @author Kevin
     * @version 2012-5-22 上午11:14:09
     */
    public static void showMessage(final int msg,
                                   final int len) {
        new Thread(new Runnable() {
            public void run() {
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        synchronized (synObj) {
                            if (mToast != null) {
                                mToast.cancel();
                                mToast.setText(msg);
                                mToast.setDuration(len);
                            } else {
                                mToast = Toast.makeText(RxRetrofitApp.getApplication(), msg, len);
                            }
                            mToast.show();
                        }
                    }
                });
            }
        }).start();
    }

    /**
     * Toast发送消息(字符串)
     *
     * @param msg
     * @param len
     * @author Kevin
     * @version 2012-5-22 上午11:14:27
     */
    public static void showMessage(final String msg,
                                   final int len) {
        new Thread(new Runnable() {
            public void run() {
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        synchronized (synObj) {
                            if (mToast != null) {
                                mToast.cancel();
                                mToast.setText(msg);
                                mToast.setDuration(len);
                            } else {
                                mToast = Toast.makeText(RxRetrofitApp.getApplication(), msg, len);
                            }
                            mToast.show();
                        }
                    }
                });
            }
        }).start();
    }

    /**
     * 关闭当前Toast
     *
     * @author Kevin
     * @version 2012-5-22 上午11:14:45
     */
    public static void cancelCurrentToast() {
        if (mToast != null) {
            mToast.cancel();
        }
    }
}
