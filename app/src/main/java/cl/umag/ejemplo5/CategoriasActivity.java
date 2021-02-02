package cl.umag.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.umag.ejemplo5.modelo.Bebida;
import cl.umag.ejemplo5.modelo.BebidasDatabaseHelper;

public class CategoriasActivity extends ListActivity
{

    private BebidasDatabaseHelper helper=new BebidasDatabaseHelper(this);
    private ListView listaBebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        listaBebidas=getListView();
        ArrayAdapter<Bebida> listaAdapter= new ArrayAdapter<Bebida>(this,
                android.R.layout.simple_list_item_1,

                helper.listaBebidas(helper.getReadableDatabase())
                );
        listaBebidas.setAdapter(listaAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View item,int posicion,long id)
    {
        Intent intent=new Intent(CategoriasActivity.this,BebidasActivity.class);

        Object o=listaBebidas.getItemAtPosition(posicion);
        String nombre=o.toString();

        intent.putExtra("nombre", nombre);
        startActivity(intent);
    }
}
