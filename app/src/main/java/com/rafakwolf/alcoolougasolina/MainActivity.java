package com.rafakwolf.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool;
    private EditText editGasolina;
    private TextView textResultado;

    public void calcularMelhorOpcao(View view) {
        Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editGasolina.getText().toString());

        double resultado = precoAlcool / precoGasolina;

        if (resultado < 0.7) {
            textResultado.setText(R.string.resultadoAlcool);
        } else {
            textResultado.setText(R.string.resultadoGasolina);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.editTextNumberAlcool);
        editGasolina = findViewById(R.id.editTextNumberGasolina);

        textResultado = findViewById(R.id.textViewResultado);
    }
}