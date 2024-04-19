package Producto5;

public enum ServProduc {
    LAPIZ("Numero2","Eficiente y punta fina") {
        @Override
        public void mostrarUso() {

        }

    },
    BORRADOR("FaberCastell","Suave,util y para corregir errores") {
        @Override
        public void mostrarUso() {

        }

    },
    CUADERNO("Norma","50paginas cuadriculadas") {
        @Override
        public void mostrarUso() {

        }

    },
    SACAPUNTA("Maped","Facil uso y almacena la basura") {
        @Override
        public void mostrarUso() {

        }
    },
    CARTUCHERA("Totto","Encantadora y para que guardes tus lapices y colores") {
        @Override
        public void mostrarUso() {

        }

    };
    private String nombre;
    private String Descripcion;

    ServProduc(String nombre, String descripcion) {
        this.nombre = nombre;
        Descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public abstract void mostrarUso();
};



