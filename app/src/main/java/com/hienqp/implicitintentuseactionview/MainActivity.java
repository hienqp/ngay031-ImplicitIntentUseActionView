package com.hienqp.implicitintentuseactionview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewAccessWebBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewAccessWebBrowser = (ImageView) findViewById(R.id.imageView_access_web_browser);
        imageViewAccessWebBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://khoapham.vn"));

                startActivity(intent);
            }
        });
    }
}