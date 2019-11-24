package com.adifens.regapc.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.adifens.regapc.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    ImageView img_detail_foto, ic_favourite;
    TextView tv_detail_deskripsi;
    Boolean is_favourite = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img_detail_foto = findViewById(R.id.img_detail_foto);
        tv_detail_deskripsi = findViewById(R.id.tv_detail_deskripsi);


        tampilDetail();



    }





    private void tampilDetail() {
        Intent intent = getIntent();

        String nama = intent.getStringExtra("NAMA");
        String deskripsi = intent.getStringExtra("DESKRIPSI");
        String foto = intent.getStringExtra("FOTO");

        // tampilkan data di titlebar
        getSupportActionBar().setTitle(nama);
        getSupportActionBar().show();

        // tampilkan gambar dari internet
        Glide.with(this)
                .load(foto)
                .apply(new RequestOptions())
                .into(img_detail_foto);

        // tampilkan data deskripsi
        tv_detail_deskripsi.setText(deskripsi);
    }
}