package com.example.dicodings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgPhoto;
    private TextView tvName, tvFrom;
    public static final String EXTRA_DETAIL = "extra_dtl";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_LINK = "extra_link";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String link = getIntent().getStringExtra(EXTRA_LINK);
        setContentView(R.layout.activity_detail);
        imgPhoto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvFrom = findViewById(R.id.tv_item_from);
        Glide.with(this)
                .load(link)

                .into(imgPhoto);
        tvName.setText(name);
        tvFrom.setText(detail);

        Toast.makeText(this, "Kamu memilih "+name, Toast.LENGTH_SHORT).show();

    }
}
