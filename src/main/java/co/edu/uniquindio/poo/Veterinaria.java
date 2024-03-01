package co.edu.uniquindio.poo;

public class Veterinaria {
    private String nombre;
    private Especie especie;
    private String raza;
    private byte edad;
    private Genero genero;
    private String color;
    private float peso;

    public Veterinaria(String nombre, Especie especie, String raza, byte edad, Genero genero, String color,
            float peso) {

        assert nombre != null && !nombre.isBlank();
        assert raza!=null && !raza.isBlank();
        assert genero!=null: "es necesario el genero";
        assert color!=null && !color.isBlank();
        assert edad>=0: "la edad no puede ser negativa";
        assert peso >=0f: "el peso no puede ser nevativo";

        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad
                + ", genero=" + genero + ", color=" + color + ", peso=" + peso + "]";
    }

}
