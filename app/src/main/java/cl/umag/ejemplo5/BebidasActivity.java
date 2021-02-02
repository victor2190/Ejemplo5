package cl.umag.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cl.umag.ejemplo5.modelo.Bebida;
import cl.umag.ejemplo5.modelo.BebidasDatabaseHelper;

public class BebidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);


        BebidasDatabaseHelper helper=new BebidasDatabaseHelper(this);
        String nombreBebida=(String) getIntent().getExtras().get("nombre");
        Bebida bebida=helper.getBebida(nombreBebida);





        //recuperamos la imagen de la bebida y la mostramos3
        ImageView foto=(ImageView)findViewById(R.id.foto);
        foto.setImageResource(bebida.getIdFoto());
        foto.setContentDescription(bebida.getNombre());

        //recuperamos el nombre de la bebida
        TextView nombre=(TextView)findViewById(R.id.nombre);
        nombre.setText(bebida.getNombre());

        //Descripcion
        TextView descripcion=(TextView)findViewById(R.id.descripcion);
        descripcion.setText(bebida.getDescripcion());


    }
}
