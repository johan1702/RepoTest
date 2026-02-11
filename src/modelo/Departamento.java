package modelo;

public class Departamento extends Inmueble{
    // Atributos de la clase hija
    private double precioBase;
    private int nroPiso;
    // Metodos

    public Departamento() {
        // llamar al constructor del pabre
        super();
        precioBase = 0;
        nroPiso = 0;
    }

    public Departamento(
            double area, double precioBase, int nroPiso) {
        super(area);
        this.precioBase = precioBase;
        this.nroPiso = nroPiso;
    }
    @Override
    public double calcularPrecio(){
        if (area>170){
            precioBase = precioBase+0.15*precioBase;
        }
        double impuesto = 0.25*precioBase;
        double total = precioBase+impuesto;
        if (nroPiso>=3){
            total = total - 0.07*total; // descuento
        }
        return total;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Precio Base: "+precioBase);
        System.out.println("Nro. Piso: "+nroPiso);
    }
    
}
