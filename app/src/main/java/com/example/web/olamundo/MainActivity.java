package com.example.web.olamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText idNome, idEmail, idEndereco, idTelefone;
    private Button btnSalvar;
   // private Button btnMedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //pega os campos do layout
        idNome = (EditText) findViewById(R.id.idNome);
        idEmail = (EditText) findViewById(R.id.idEmail);
        idEndereco = (EditText) findViewById(R.id.idEndereco);
        idTelefone = (EditText) findViewById(R.id.idTelefone);

        //pega o botão
        btnSalvar =(Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }

    });




    }
    private void salvar (){

        String txt ="";



        // Esse metodo define a ação do botão Salvar. Ao Clicar em Salvar loga os dados digitados
        String nmNome= idNome.getEditableText().toString();
        String nmEmail= idEmail.getEditableText().toString();
        String nmEndereco= idEndereco.getEditableText().toString();
        String nmTelefone= idTelefone.getEditableText().toString();


        Log.d("Debug","Nome digitado:" + nmNome);
        Log.d("Debug","Email digitado:" + nmEmail);
        Log.d("Debug","Endereco digitado:" + nmEndereco);
        Log.d("Debug","Telefone digitado:" + nmTelefone);

        txt = "Nome: "     + nmNome + "\n";
        txt+= "E-mail: "   + nmEmail +"\n";
        txt+= "Endereço: " + nmEndereco  +"\n";
        txt+= "Telefone: " + nmTelefone  +"\n";

                Toast.makeText(getBaseContext(),txt, Toast.LENGTH_LONG).show();
    }
}
