package com.example.asus_k555l.twittartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

import com.twitter.sdk.android.core.*;
import com.twitter.sdk.android.core.identity.*;
/**
 * Created by asus-K555L on 1/5/2559.
 */
public class EmbeddedTimelineActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedIbstanceState){
        super.onCreate(savedIbstanceState);

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("fabric")
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();

        setListAdapter(adapter);
    }


}
