package com.example.tareasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombreCompleto;
    private DatePicker dtFecha;
    private EditText edtTelefono;
    private EditText edtEmail;
    private  EditText edtDescripcion;
    private Button btnSiguiente;
    private Context contexto=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombreCompleto=(EditText)findViewById(R.id.edtNombreCompleto);
        btnSiguiente=(Button)findViewById(R.id.btnSiguiente);
        dtFecha=(DatePicker) findViewById(R.id.dtFecha);
        edtTelefono=(EditText)findViewById(R.id.edtTelefono);
        edtEmail=(EditText)findViewById(R.id.edtDescripcion);
        edtDescripcion=(EditText)findViewById(R.id.edtDescripcion);
        EventoClick event=new EventoClick();
        btnSiguiente.setOnClickListener(event);
    }


    private  class EventoClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            int day=dtFecha.getDayOfMonth();
            int mounth=dtFecha.getMonth();
            int year=dtFecha.getYear();

            Intent intent=new Intent(contexto ,Confirmar_Datos.class);
            intent.putExtra(getResources().getString(R.string.kNombreC),edtNombreCompleto.getText().toString());
            intent.putExtra(getResources().getString(R.string.kDate),String.format("%d/%d/%d",day,mounth,year) );
            intent.putExtra(getResources().getString(R.string.kTelefono),edtTelefono.getText().toString());
            intent.putExtra(getResources().getString(R.string.kEmail),edtEmail.getText().toString());
            intent.putExtra(getResources().getString(R.string.kDescrC),edtDescripcion.getText().toString());

            startActivity(intent);
        }
    }
}