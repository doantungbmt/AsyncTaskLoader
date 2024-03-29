package com.example.asynctaskloader;

import android.content.Context;
import android.os.SystemClock;

import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

public class UserAccountTaskLoader extends AsyncTaskLoader<List<UserAccount>> {
    private String param1;
    private String param2;

    public UserAccountTaskLoader(Context context, String param1, String param2) {
        super(context);
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public List<UserAccount> loadInBackground() {
        // Do something, for example:
        // - Download data from URL and parse it info Java object.
        // - Query data from Database into Java object.

        List<UserAccount> list = new ArrayList<>();
        list.add(new UserAccount("Tung", "tung@gmail.com", "Nguyen tung"));
        list.add(new UserAccount("Nam", "jerry@example.com", "Jerry"));
        list.add(new UserAccount("Cam", "donald@example.com", "Donald"));

        SystemClock.sleep(2000); // 2 Seconds.

        return list;
    }
}
