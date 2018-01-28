package br.com.kenzo.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnJogar;
    private String[] moeda = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int opcao = new Random().nextInt(2);

                Intent it = new Intent(MainActivity.this, DetalheActivity.class);
                it.putExtra("opcao", moeda[opcao]);

                startActivity(it);
            }
        });
    }
}
