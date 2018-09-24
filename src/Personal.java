

public abstract class Personal {
     String nombre;
     String DNI;
     double sueldoBase;
     int antiguedad;
     int planta;

     public Personal (String nombre, String DNI, double sueldoBase, int antiguedad){
         this.nombre = nombre;
         this.DNI = DNI;
         this.sueldoBase = sueldoBase;
         this.antiguedad = antiguedad;

     }
     public Personal (){

     }

     public abstract double getSueldo ();

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    @Override
    public String toString (){
        String texto;
        return texto = String.format("DNI: %s, El suelso base es: %f, La antiguedad es: %d", DNI, sueldoBase, antiguedad);
    }
    @Override
    public boolean equals (Object o){
        if (o instanceof Personal){
            Personal p = (Personal) o;
            return p.DNI.equals(this.DNI);
        }
        return false;

    }
}
