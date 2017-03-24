package intent.edu.br.intentuses;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static java.security.AccessController.getContext;

public class principal extends AppCompatActivity {

    private Button buttonUm;
    private Button buttonDois;
    private Button buttonTres;
    private Button buttonQuatro;
    private Button buttonCinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        buttonUm = (Button) findViewById(R.id.buttonUm);
        buttonDois = (Button) findViewById(R.id.buttonDois);
        buttonTres = (Button) findViewById(R.id.buttonTres);
        buttonQuatro = (Button) findViewById(R.id.buttonFour);
        buttonCinco = (Button) findViewById(R.id.buttonCinco);

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.google.com.br");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("content://com.android.contacts/contacts");
                Intent intent = new Intent(Intent.ACTION_PICK,uri);
                startActivity(intent);
            }
        });

        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:997873330");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.fromParts("sms","933472020",null);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("MINHA_ACAO");
                startActivity(intent);
            }
        });

    }
}
