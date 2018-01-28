package br.com.kenzo.caraoucoroa;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imvMoeda;
    private ImageButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imvMoeda = findViewById(R.id.imvMoeda);
        btnVoltar = findViewById(R.id.btnVoltar);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String opcao = extra.getString("opcao");
            if(opcao.equals("cara")){
                imvMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                imvMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
