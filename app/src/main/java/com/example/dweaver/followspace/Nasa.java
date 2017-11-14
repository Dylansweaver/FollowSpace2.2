package com.example.dweaver.followspace;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by dweaver on 11/14/17.
 */

public class Nasa extends ListActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.nasa);
            String username = getIntent().getStringExtra("username");

            setContentView(R.layout.nasa);

            final UserTimeline userTimeline = new UserTimeline.Builder()
                    .screenName("nasa")
                    .build();
            final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                    .setTimeline(userTimeline)
                    .build();
            setListAdapter(adapter);




        }
            }



