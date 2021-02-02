package cl.umag.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cl.umag.ejemplo5.modelo.Bebida;
import cl.umag.ejemplo5.modelo.Sandwitch;

public class SandwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitch);

        //Obtener el numero del sandwitch desde el intent
        int sandwitchNro=(Integer)getIntent().getExtras().get("sandwitchNro");
        //recuperamos el sandwitch desde el arreglo
        Sandwitch sandwitch=Sandwitch.sandwitch[sandwitchNro];

        //recuperamos la imagen de la bebida y la mostramos3
        ImageView foto=(ImageView)findViewById(R.id.foto);
        foto.setImageResource(sandwitch.getIdFoto());
        foto.setContentDescription(sandwitch.getNombre());

        //recuperamos el nombre de la bebida
        TextView nombre=(TextView)findViewById(R.id.nombre);
        nombre.setText(sandwitch.getNombre());

        //Descripcion
        TextView descripcion=(TextView)findViewById(R.id.descripcion);
        descripcion.setText(sandwitch.getDescripcion());
    }
}
