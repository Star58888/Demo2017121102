package com.star.demo2017121102;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

/**
 * Created by yvtc on 2017/12/11.
 */

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MyJob extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d("JOB", "onStartJob");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d("JOB", "onStopJob");
        return false;
    }
}
