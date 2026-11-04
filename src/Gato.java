public class Gato extends Mascota {

    // atributo
    private String color;
    private Boolean usaArenero;

    public Gato(String nombre, int edad,
                Dueno dueno, String color, boolean usaArenero) {

        super(nombre, "gato", edad, dueno);
        this.color = color;
        this.usaArenero = usaArenero;
    }

    public String getColor() {
        return color;
    }
    public boolean isUsaArenero(){
        return usaArenero;
    }
    // sobreescribe los metodos del padre
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }

    @Override
    public String toString() {
        return super.toString() + " - Color: " + color + "- Usa Arenero " +
                (usaArenero ? "si": "no ");
    }
}


