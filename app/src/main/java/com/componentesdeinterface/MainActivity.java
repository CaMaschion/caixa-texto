package com.componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //captura o que foi digitado pelo usuário
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);
    }

    public void enviar (View view){

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText( "nome: " + nome + " email: " + email );

    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

    }
}