

public class Enfermera extends Personal{

    String especializada;

    public Enfermera (String nombre, String DNI, double sueldoBase, int antiguedad, String especializada){
        super (nombre, DNI, sueldoBase, antiguedad);
        this.especializada = especializada;

    }

    @Override
    public double getSueldo() {
        double sueldoTotal = 0;
        double porcentaje = (sueldoBase * 0.01) * antiguedad;

        return sueldoTotal = sueldoBase + porcentaje;
    }

    @Override
    public String toString() {
        return "Enfermera{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldoBase=" + sueldoBase +
                ", antiguedad=" + antiguedad +
                "especializada=" + especializada;
    }
}
