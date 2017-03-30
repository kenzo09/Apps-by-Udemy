package br.com.kenzo.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (Button) findViewById(R.id.btnJogar);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        //tvResultado.setText("Texto alterado");

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();

                int numeroRandom = random.nextInt(11);

                tvResultado.setText("Número escolhido: " + numeroRandom);
            }
        });
    }
}
