package proyectopokemon.la;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtUser = (EditText)findViewById(R.id.edtUser);
        edtUser2 = (EditText)findViewById(R.id.edtUser2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void Ingresar(View v) {
        if ((edtUser.getText().toString().equals("Blastoise") && edtUser2.getText().toString().equals("Agua")) || (edtUser.getText().toString().equals("Aracanine") && edtUser2.getText().toString().equals("Fuego")) || (edtUser.getText().toString().equals("Pikachu") && edtUser2.getText().toString().equals("Electricidad")) || (edtUser.getText().toString().equals("Onix") && edtUser2.getText().toString().equals("Roca")) || (edtUser.getText().toString().equals("Pidgeot") && edtUser2.getText().toString().equals("Aire")))
            startActivity(new Intent(this, MainActivity.class));
        else{
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }

    }
}
