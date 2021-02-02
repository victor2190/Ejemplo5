package cl.umag.ejemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void mostrarBebidaClick(View view)
        {
            Intent intent=new Intent(this,CategoriasActivity.class);
            startActivity(intent);
        }

        public void ingresarBebidaClick(View view)
        {
            Intent intent=new Intent(this,IngresarBebidaActivity.class);
            startActivity(intent);
        }





}
