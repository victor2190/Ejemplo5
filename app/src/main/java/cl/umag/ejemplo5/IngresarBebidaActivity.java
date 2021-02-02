package cl.umag.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cl.umag.ejemplo5.modelo.Bebida;
import cl.umag.ejemplo5.modelo.BebidasDatabaseHelper;

public class IngresarBebidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_bebida);
    }

    public void ingresarClick(View view)
    {
        EditText nombreET=(EditText)findViewById(R.id.nombre);
        EditText descripcionET=(EditText)findViewById(R.id.descripcion);
        String nombre=nombreET.getText().toString();
        String descripcion=descripcionET.getText().toString();
        Bebida bebida=new Bebida(nombre,descripcion);

        BebidasDatabaseHelper helper=new BebidasDatabaseHelper(this);
        helper.ingresarBebida(helper.getWritableDatabase(),bebida);
        Toast.makeText(this,"Se ha ingresado la bebida",Toast.LENGTH_SHORT).show();
        finish();
    }

}
