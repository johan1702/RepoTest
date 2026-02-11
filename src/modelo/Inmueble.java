package modelo;

public class Inmueble {
    // Atributos de la clases Padre
    protected double area;
    
    // Metodos de la clase padre

    public Inmueble() {
        area = 0;
    }

    public Inmueble(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double calcularPrecio(){
        return 0;
    }
    
    public void mostrarDatos(){
        System.out.println("Area: "+area);
        System.out.println("Precio: "+calcularPrecio());
    }
    
}
