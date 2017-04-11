package br.com.kenzo.conversorcombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtAlcool, edtGasolina;
    private Button btnVerificar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlcool = (EditText) findViewById(R.id.edtAlcool);
        edtGasolina = (EditText) findViewById(R.id.edtGasolina);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar valores digitados
                Double precoAlcool = Double.parseDouble(edtAlcool.getText().toString());
                Double precoGasolina = Double.parseDouble(edtGasolina.getText().toString());

                //alcool dividido pela gasolina para saber se compensa
                double resultado = precoAlcool/precoGasolina;

                if(resultado >= 0.7){
                    //Gasosa
                    tvResultado.setText("É melhor utilizar Gasolina!");
                }else{
                    //Álcool
                    tvResultado.setText("É melhor utilizar Álcool!");
                }

            }
        });

    }
}
