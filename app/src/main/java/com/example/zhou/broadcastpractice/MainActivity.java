
package com.example.zhou.broadcastpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.force_offline).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //发送一条广播
                Intent intent = new Intent("com.example.broadcastpractice.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });

    }
}
