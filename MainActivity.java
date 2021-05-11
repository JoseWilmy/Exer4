package com.example.exe4_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ano_nascimento;
    private EditText ano_atual;
    private Button btn_calculate;
    private TextView idade_Atual;
    private TextView idade_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ano_nascimento = findViewById(R.id.ano_nascimento);
        ano_atual = findViewById(R.id.ano_atual);
        btn_calculate = findViewById(R.id.btn_calculate);
        idade_Atual = findViewById(R.id.idade_Atual);
        idade_2 = findViewById(R.id.idade_2);


        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int ano_nascimento2 = Integer.parseInt(ano_nascimento.getText().toString());
                int ano_Atual = Integer.parseInt(ano_atual.getText().toString());

                idade_Atual.setText("A sua idade: " + Math.abs(ano_nascimento2-ano_Atual));
                idade_2.setText("A sua idade em 2050: " + Math.abs(ano_nascimento2-2050));



            }
        });

    }

}