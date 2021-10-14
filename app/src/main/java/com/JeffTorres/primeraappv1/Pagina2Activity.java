package com.JeffTorres.primeraappv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.JeffTorres.primeraappv1.Adapter.NameAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pagina2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
        Log.i("Mensaje/2","Esta en la segunda pagina: ");
        Intent intent = getIntent();
        String value = intent.getStringExtra("valor");

        TextView tv = findViewById(R.id.MensajePagII);
        tv.setText(value);


    }
}