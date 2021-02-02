package cl.umag.ejemplo5.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import cl.umag.ejemplo5.R;

public class BebidasDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME="bebidas.db";
    private static final int DB_VERSION=1;

    public BebidasDatabaseHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sqlTxt="create table BEBIDAS("
                +"_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"NOMBRE TEXT, "
                +"DESCRIPCION TEXT, "
                +"ID_FOTO INTEGER); ";
        db.execSQL(sqlTxt);

        ingresarBebida(db,new Bebida("Jugo natural",
                "Jugo de fruta fresca",
                R.drawable.jugo));
        ingresarBebida(db, new Bebida("Leche con fruta",
                "Leche con platano o frutilla",
                R.drawable.leche));
        ingresarBebida(db,new Bebida("Bebida en lata",
                "Fanta, Coca cola o sprite",
                R.drawable.bebida));


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    //=============================================


    public static void ingresarBebida(SQLiteDatabase db, Bebida bebida)
    {
        ContentValues valores=new ContentValues();
        valores.put("NOMBRE",bebida.getNombre());
        valores.put("DESCRIPCION",bebida.getDescripcion());
        valores.put("ID_FOTO",bebida.getIdFoto());
        db.insert("BEBIDAS",null,valores);
    }

    public List<Bebida> listaBebidas(SQLiteDatabase db)
    {
       List<Bebida> bebidas= new ArrayList<>();
        Cursor cursor=db.query("BEBIDAS",
                new String []{"NOMBRE","DESCRIPCION","ID_FOTO"},
                null,null,null,null,null);

        cursor.moveToFirst();
        do{
            bebidas.add(new Bebida(cursor.getString(0),
                    cursor.getString(1),
                    cursor.getInt(2)
            )
        );
        }while(cursor.moveToNext());

        cursor.close();
        db.close();

       return bebidas;
    }

    public Bebida getBebida(String nombre)
    {
        Bebida bebida;
        SQLiteDatabase db=getReadableDatabase();
        String sqlTxt="select NOMBRE,DESCRIPCION,ID_FOTO from BEBIDAS where NOMBRE=? ";
        String [] argumentos=new String[]{nombre};
        try
        {
            Cursor cursor=db.rawQuery(sqlTxt,argumentos);
            cursor.moveToFirst();
            bebida=new Bebida(cursor.getString(0),
                    cursor.getString(1),
                    cursor.getInt(2));
        }
        catch (SQLException ex)
        {
            bebida=null;
        }

        return bebida;
    }




}
