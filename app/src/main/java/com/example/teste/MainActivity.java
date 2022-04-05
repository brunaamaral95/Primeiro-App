package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText caixaNome;
    TextView caixaResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaNome = findViewById(R.id.nome);
        caixaResultado = findViewById(R.id.resultado);
    }

    public void capturarTexto(View view) {
        String texto= caixaNome.getText().toString();
        caixaResultado.setText("Resultado: " + texto);

    }
}