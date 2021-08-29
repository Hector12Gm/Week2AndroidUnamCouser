package com.example.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class Confirmar_Datos extends AppCompatActivity {

    private TextView tvNombreC;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvCorreo;
    private TextView tvDescripcion;
    private Button btnEditar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        tvNombreC=(TextView)findViewById(R.id.tvNombreC);
        tvFecha=(TextView)findViewById(R.id.tvFecha);
        tvTelefono=(TextView)findViewById(R.id.tvTelefono);
        tvCorreo=(TextView)findViewById(R.id.tvCorreo);
        tvDescripcion=(TextView)findViewById(R.id.tvDescripcion);
        btnEditar=(Button)findViewById(R.id.btnEditar);

        Bundle bundle=getIntent().getExtras();
        tvNombreC.setText(bundle.getString(getResources().getString(R.string.kNombreC)));
        tvFecha.setText(bundle.getString(getResources().getString(R.string.kDate)));
        tvTelefono.setText(bundle.getString(getResources().getString(R.string.kTelefono)));
        tvCorreo.setText(bundle.getString(getResources().getString(R.string.kEmail)));
        tvDescripcion.setText(bundle.getString(getResources().getString(R.string.kDescrC)));
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }


}