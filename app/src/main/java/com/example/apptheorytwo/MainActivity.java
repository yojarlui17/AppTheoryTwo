package com.example.apptheorytwo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tvResultado;
    private RadioButton rdsumar,rdrestar,rdmultiplicar,rddividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.txtValor1);
        et2=findViewById(R.id.txtValor2);
        tvResultado=findViewById(R.id.txtResultado);
        rdsumar=findViewById(R.id.rdSumar);
        rdrestar=findViewById(R.id.rdRestar);
        rdmultiplicar=findViewById(R.id.rdMultiplicar);
        rddividir=findViewById(R.id.rdDividir);
    }
    //METODO PARA CALCULAR
    public  void calcular(View view) {
        int valor1 = Integer.parseInt(et1.getText().toString());
        int valor2 = Integer.parseInt(et2.getText().toString());
        if (rdsumar.isChecked()) {
            tvResultado.setText(String.valueOf(valor1 + valor2));
        } else if (rdrestar.isChecked()) {
            tvResultado.setText(String.valueOf(valor1 - valor2));
        } else if (rdmultiplicar.isChecked()) {
            tvResultado.setText(String.valueOf(valor1 * valor2));
        } else if (rddividir.isChecked()) {
            tvResultado.setText(String.valueOf(valor1 / valor2));
        } else {
            Toast.makeText(getApplicationContext(), "Seleccionar una opcion", Toast.LENGTH_SHORT).show();
        }
    }
}
