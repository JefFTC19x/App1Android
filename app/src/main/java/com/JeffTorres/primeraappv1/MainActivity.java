package com.JeffTorres.primeraappv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.JeffTorres.primeraappv1.Adapter.NameAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    List<String> datos = Arrays.asList("andre","beto","carmen","diego","eliza","fiorela","gerardo","hernan","ines","jesica","anderson","beatriz","carlos","danna","ernesto","fernando","gonzalo","horacio","irma","julia");
    List<String> numeros = Arrays.asList("987654321","987456123","978945612","987456123","987654321","978945612","952982645","977654123","987854611","987854611","987654321","987456123","978945612","987456123","987654321","978945612","952982645","977654123","987854611","987854611");

    List<String> info = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        for(int i =0;i< datos.size();i++)
        {
            info.add( datos.get(i)+"_"+numeros.get(i));
        }

        setContentView(R.layout.activity_main);

        AutoCompleteTextView editText = findViewById(R.id.parallamar);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,info);

        editText.setAdapter(adapter);

        Button button = findViewById(R.id.BotonLlamar);
        Button button2 = findViewById(R.id.BotonMensaje);


        button.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v)
            {

                EditText mens = findViewById(R.id.parallamar);
                String value = String.valueOf(mens.getText());
//                String Nombre =String.valueOf(mens.getText());
                
                int pos = 0;
                pos = info.indexOf(value);

                String Num = numeros.get(pos);

                //Apertura de llamada
                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",Num,null));
                startActivity(intent2);
            }
        } );

        button2.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v)
            {

                EditText mens = findViewById(R.id.parallamar);
                String value = String.valueOf(mens.getText());
//                String Nombre =String.valueOf(mens.getText());

                int pos = 0;
                pos = info.indexOf(value);

                String Num = numeros.get(pos);

                //Apertura de Mensaje
                Intent intent2 = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + Num));
                startActivity(intent2);
            }
        } );

    }
    private List<String> getDatos(List<String> datos)
    {
        return datos;
    }
}