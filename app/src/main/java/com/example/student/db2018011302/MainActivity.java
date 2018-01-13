package com.example.student.db2018011302;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 123123
    }
    public void click1(View v)
    {
        Uri uri = Uri.parse("http://tw.yahoo.com");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void click2(View v)
    {
        Uri uri = Uri.parse("tel://0229640123");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
    public void click3(View v)
    {
        Uri uri = Uri.parse("geo:0,0?q=巨匠電腦板橋認證中心");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void click4(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT, "Hello 你好");
        startActivity(it);
    }

}
