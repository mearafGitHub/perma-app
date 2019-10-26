package com.example.perma.framework.util;

import android.util.Log;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

public class Util {


    /**
     * Debug tag for logging and filtering our application.
     */
    private static final String TAG = "FETAN-TAG-DEBUG";

    /**
     * Log a normal debug message
     */
    public static void d(Object source, String message) {
        log(source, message, false);
    }

    /**
     * Log a normal error message
     */
    public static void e(Object source, String message) {
        log(source, message, true);
    }

    /**
     * Helper method for logging out the data.
     */
    private static void log(Object source, String message, boolean isError) {
        final String name = source.getClass().getSimpleName();
        final String output = name + " : " + message;

        if (isError) {
            Log.e(TAG, output);
        } else {
            Log.d(TAG, output);
        }
    }

    public static String getHowLongAgo(String dateTime) {
        DateTime time = new DateTime(dateTime);
        Period period = new Period(time, DateTime.now());

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendMinutes().appendSuffix(" mins")
                .appendHours().appendSuffix(" hrs")
                .printZeroNever()
                .toFormatter();
        return formatter.print(period);
    }
}
