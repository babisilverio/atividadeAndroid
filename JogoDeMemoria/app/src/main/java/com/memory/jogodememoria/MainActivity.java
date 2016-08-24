package com.memory.jogodememoria;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBotao(View view){
        List<Integer> numeros = gerarNumeros();


            View tela = findViewById(R.id.fundo_tela);
            tela.setBackground(view.getBackground());
            view.setVisibility(View.INVISIBLE);

    }

    public void reiniciar(View view) {

        Button show = (Button) findViewById(R.id.button1);
        show.setVisibility(View.VISIBLE);

        Button show2 = (Button) findViewById(R.id.button2);
        show2.setVisibility(View.VISIBLE);

        Button show3 = (Button) findViewById(R.id.button3);
        show3.setVisibility(View.VISIBLE);

        Button show4 = (Button) findViewById(R.id.button4);
        show4.setVisibility(View.VISIBLE);

        Button show5 = (Button) findViewById(R.id.button5);
        show5.setVisibility(View.VISIBLE);

        Button show6 = (Button) findViewById(R.id.button6);
        show6.setVisibility(View.VISIBLE);

        View tela = findViewById(R.id.fundo_tela);
        tela.setBackgroundColor(Color.WHITE);

    }

    public List<Integer> gerarNumeros(){
        List<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <=6; i++)
            numeros.add(i);

        Collections.shuffle(numeros);

        return numeros;
    }

}
