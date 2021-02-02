package cl.umag.ejemplo5.modelo;

import cl.umag.ejemplo5.R;

public class Sandwitch
{
    private String nombre;
    private String descripcion;
    private int idFoto;

    public static final Sandwitch[] sandwitch={
            new Sandwitch("Churrasco","Italiano, chacarero, ave palta", R.drawable.churrasco),
            new Sandwitch("Molde","jamon queso, pollo morrón",R.drawable.molde),
            new Sandwitch("Amasado","Del que se hace a mano",R.drawable.amasado)
    };

    public Sandwitch(String nombre, String descripcion, int idFoto)
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
