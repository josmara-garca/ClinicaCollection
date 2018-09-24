

public class ClinicaPrincipal {

    public static void main(String[] args) {

        Medico m1 = new Medico("Jose Maria", "2875309X", 1250, 16,"odontologo");
        Medico m2 = new Medico("Ana Maria", "50821064B", 1310,12,"pediatra");
        Medico m3 = new Medico("Esther", "50837164B", 1110,11,"cardiologa");
        Medico m4 = new Medico("Pedro", "38837164B", 1320,2,"odontologo");
        Medico m5 = new Medico("Daniel", "30090164B", 1200,5,"psicologia");
        Medico m6 = new Medico("David", "18637164B", 1500,25,"pediatra");

        Enfermera e1 = new Enfermera("Veronica", "88485209A", 950, 8,  "geriatria");
        Enfermera e2 = new Enfermera("Giselda", "99226209A", 1000, 1,  "puericultura");
        Enfermera e3 = new Enfermera("Maria Jesus", "88485203D", 1100, 28,  "geriatria");
        Enfermera e4 = new Enfermera("Rosa", "66675209A", 980, 10,  "geriatria");

        System.out.println("===MEDICOS====");
        System.out.println(m2.getSueldo());
        System.out.println(m2.toString());

        System.out.println("=====ENFERMERAS=====");
        System.out.println(e4.getSueldo());
        System.out.println(e4.toString());
        System.out.println(e4.especializada);
        System.out.println(m2.getSueldo());
        System.out.println("====CLINICA=======");
        Clinica c = new Clinica();
        System.out.println(c.insertar(m1,3));
        System.out.println(c.insertar(m2, 2));
        System.out.println(c.insertar(m3,1));
        System.out.println(c.insertar(m4,1));
        System.out.println(c.insertar(m5, 5));
        System.out.println(c.insertar(m6, 5));
        System.out.println(c.insertar(e1,2));
        System.out.println(c.insertar(e2,2));
        System.out.println(c.insertar(e3,5));
        System.out.println(c.insertar(e4,0));

        System.out.println(c.toString());
        System.out.println(c.getNumeroMiembros());
        System.out.println(c.obtenPersonal(5));
        System.out.println(c.getNumMiembrosPorPlanta(3));

        System.out.println(m1.planta);
    }
}
