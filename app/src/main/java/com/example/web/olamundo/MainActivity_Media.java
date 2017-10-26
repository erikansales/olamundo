package com.example.web.olamundo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Erika Sales on 19/10/2017.
 */

public class MainActivity_Media extends AppCompatActivity {
    private EditText idNota1, idNota2, idNota3, idNota4;
    private Button btnMedia;
    private double calcMedia;
    // private Button btnMedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        //pega os campos do layout
        idNota1 = (EditText) findViewById(R.id.idNota1);
        idNota2 = (EditText) findViewById(R.id.idNota2);
        idNota3 = (EditText) findViewById(R.id.idNota3);
        idNota4 = (EditText) findViewById(R.id.idNota4);

        //pega o botão
        btnMedia =(Button) findViewById(R.id.btnMedia);

        btnMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }

        });




    }
    private void salvar (){

        String txt ="";



        // Esse metodo define a ação do botão Salvar. Ao Clicar em Salvar loga os dados digitados
        String nmNota1= idNota1.getEditableText().toString();
        String nmNota2= idNota2.getEditableText().toString();
        String nmNota3= idNota3.getEditableText().toString();
        String nmNota4= idNota4.getEditableText().toString();

         //double n1 = idNota1.getText().toString();


        double n1 =Double.valueOf(nmNota1).doubleValue();
        double n2 =Double.valueOf(nmNota2).doubleValue();
        double n3 =Double.valueOf(nmNota3).doubleValue();
        double n4 =Double.valueOf(nmNota4).doubleValue();



        calcMedia = (n1 + n2 + n3 + n4) /4;

        txt = "Média: "     + calcMedia + "\n";

        Toast.makeText(getBaseContext(),txt, Toast.LENGTH_LONG).show();
    }

}
