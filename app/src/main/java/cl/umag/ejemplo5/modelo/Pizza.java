package cl.umag.ejemplo5.modelo;

import cl.umag.ejemplo5.R;

public class Pizza
{
    private String nombre;
    private String descripcion;
    private int idFoto;

    public static final Pizza[] pizza={
            new Pizza("Pizza española","de las que se hacen en españa", R.drawable.espanola),
            new Pizza("Pizza napolitana","La comun",R.drawable.napolitana),
            new Pizza("Pizza hawaiana","Desde hawai",R.drawable.hawaiana)
    };


    public Pizza(String nombre, String descripcion, int idFoto)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idFoto = idFoto;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public int getIdFoto()
    {
        return idFoto;
    }
}
