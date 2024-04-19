package Ejerc2;

public enum EnumServiPelu {
    CORTE("Taper Fade","Guapo",15000.00){
        @Override
        public void muestraDescripcion() {

        }
    },
    UÑAS("Ovalada","Acrilicas",30000.00){
        @Override
        public void muestraDescripcion() {

        }
    },
    TINTAS("Dorado","Moda nueva", 25000.00){
        @Override
        public void muestraDescripcion() {

        }
    };
    private String name;
    private String descripcion;
    private double precio;

    EnumServiPelu(String name, String descripcion, double precio) {
        this.name = name;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
public abstract void muestraDescripcion();
    @Override
    public String toString() {
        return "EnumServiPelu{" +
                "name='" + name + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
};


