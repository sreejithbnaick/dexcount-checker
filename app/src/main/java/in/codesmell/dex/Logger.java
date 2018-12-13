package in.codesmell.dex;

import android.util.Log;

public class Logger {
    // comment this to reduce count, by 1
    public static final boolean IS_DEV = true;

    // comment this to reduce count, by 1
    public static void log(String tag, String message) {
        Log.d(tag, message);
    }
}
