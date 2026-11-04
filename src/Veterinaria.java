import java.util.ArrayList;

public class Veterinaria {
    //lista de mascotas de la veterinaria
    private ArrayList<Mascota>
            pacientes = new ArrayList<>();

    public void registrar(Mascota m) {
        pacientes.add(m);
        System.out.println("Registrada: " + m);
    }
public void listar(){
        System.out.println( "\n--- pacientes (" +
                pacientes .size() + " ) ---");
        for (Mascota m: pacientes) {
            System.out.println(m);
        }
   }
    /**
     * POLIMORFISMO: recorremos mascotas y llamamos hacerSonido().
     * java ejecuta la version del perro o del gato segun el objeto real.
     */
    public void pasarRevista(){
        System.out.println("\n--- pasando revista ---");
        for (Mascota m : pacientes) {
            System.out.print(m.getNombre() + " dice:");
            m.hacerSonido();
        }
    }
}