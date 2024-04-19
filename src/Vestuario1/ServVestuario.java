package Vestuario1;

public enum ServVestuario {
    BLUSA("Big Jhon","Azul y tela fria",20) {
        @Override
        public void mostrarDescripcionPrenda() {

        }
    },
    JEAN("Koaj","Negro oscuro talla 34",41) {
        @Override
        public void mostrarDescripcionPrenda() {

        }
    },
    CAMISETA("Polo","Blanca",14){
        @Override
        public void mostrarDescripcionPrenda() {

        }
    },
    CAMISA("Adidas","Deportiva y fresca", 10){
        @Override
        public void mostrarDescripcionPrenda() {

        }
    };
    private String nombre;
    private String descripcion;
    private int numeroEstante;

    ServVestuario(String nombre, String descripcion, int numeroEstante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroEstante = numeroEstante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }
    public abstract void mostrarDescripcionPrenda();

    @Override
    public String toString() {
        return "ServVestuario{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroEstante=" + numeroEstante +
                '}';
    }
};

