package br.com.kenzo.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvNovaFrase;
    private Button btnNovaFrase;
    private String[] frases = new String[]{
            "A prática cotidiana prova que a hegemonia do ambiente político ainda não demonstrou convincentemente que vai participar na mudança dos procedimentos normalmente adotados.",
            "Caros amigos, a estrutura atual da organização causa impacto indireto na reavaliação do processo de comunicação como um todo.",
            "Desta maneira, a determinação clara de objetivos exige a precisão e a definição das condições inegavelmente apropriadas."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNovaFrase = (TextView) findViewById(R.id.tvTextoNovaFrase);
        btnNovaFrase = (Button) findViewById(R.id.btnNovaFrase);

        //tvNovaFrase.setText(frases[0]);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int indice = random.nextInt(frases.length);

                tvNovaFrase.setText(frases[indice]);
            }
        });

    }
}
