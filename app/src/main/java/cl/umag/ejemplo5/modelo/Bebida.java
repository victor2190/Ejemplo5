package cl.umag.ejemplo5.modelo;

import cl.umag.ejemplo5.R;

public class Bebida
{
    private String nombre;
    private String descripcion;
    private int idFoto;

    /*
    public static final Bebida[] bebidas={
            new Bebida("Jugo natural","piña,mango,frutilla", R.drawable.jugo),
            new Bebida("Bebida en lata","Cocacola, Fanta o sprite",R.drawable.bebida),
            new Bebida("Leche con fruta","Leche con frutilla o platano",R.drawable.leche)
    };
    */

    public Bebida(String nombre, String descripcion, int idFoto)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idFoto = idFoto;
    }
    public Bebida(String nombre, String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIdFoto() {
        return idFoto;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
