import java.util.ArrayList;
import java.util.Collection;


public class Clinica {

   ArrayList <Personal> personals;
    int numeroMiembros;


    public Clinica (){
     personals= new ArrayList<>();
      numeroMiembros = 0;
    }

    public int getNumeroMiembros() {
        numeroMiembros = personals.size();
        return numeroMiembros;
    }

    public int getNumMiembrosPorPlanta (int planta) {
        return obtenPersonal(planta).size();
    }

    public Collection <Personal> obtenPersonal (int planta){
       ArrayList<Personal> personalPorPlanta = new ArrayList<>();
        for (int i = 0; i < personals.size(); i++){
            if (personals.get(i).planta == planta){
                personalPorPlanta.add(personals.get(i));
            }
            }
            return personalPorPlanta;
    }

    public boolean insertar (Personal p, int planta) {
        boolean insertado = false;
       personals.add(p);
       insertado = true;

        return insertado;
    }
    @Override
    public String toString (){
        String texto;
        return texto = String.format("Los empleados en la Clinica son: %s", personals);
    }

    public int getPlanta (){
        int planta = 0;
        for(int i = 0; i < personals.size(); i++){
            planta = personals.get(i).planta;
        }
        return planta;
    }

}
