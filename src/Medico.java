

public class Medico extends Personal{

    private String especialidad;

    public Medico (String nombre, String DNI, double sueldoBase, int antiguedad,  String especialidad){
        super (nombre, DNI, sueldoBase, antiguedad);
        this.especialidad = especialidad;
    }

    @Override
    public double getSueldo() {
        double sueldoTotal;
        double porcentaje;
        int extra;

        if (especialidad.equalsIgnoreCase("pediatra")){
            extra = 1500;
        }else if (especialidad.equalsIgnoreCase("odontologo")){
            extra = 3000;
        }else{
            extra = 0;
        }
        porcentaje = (sueldoBase * 0.02) * antiguedad;
        return sueldoTotal = sueldoBase + porcentaje + extra;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldoBase=" + sueldoBase +
                ", antiguedad=" + antiguedad +
                ", especialidad=" + especialidad;
    }
}
