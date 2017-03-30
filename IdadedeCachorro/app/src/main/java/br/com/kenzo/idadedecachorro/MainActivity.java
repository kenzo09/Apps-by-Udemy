package br.com.kenzo.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtIdade;
    private Button btnIdade;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIdade = (EditText) findViewById(R.id.edtIdade);
        btnIdade = (Button) findViewById(R.id.btnIdade);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoIdade = edtIdade.getText().toString();

                if(textoIdade.isEmpty()){
                    Toast.makeText(MainActivity.this, "Preencha o campo da idade", Toast.LENGTH_SHORT).show();
                    tvResultado.setText("");
                }else{
                    Integer intIdade = Integer.parseInt(textoIdade);
                    Integer resultado = intIdade * 7;

                    tvResultado.setText("A idade do cachorro em anos humanos é: " + resultado + " anos!");
                }
            }
        });

    }


}
