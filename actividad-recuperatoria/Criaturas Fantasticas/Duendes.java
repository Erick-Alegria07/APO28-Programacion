public abstract class Duendes extends CriaturasMiticas {
    private String raza;
    private String altura;
    private String habitat;
    private String habilidadesMagicas;
    private int poderMagico;
 
    public Duendes(int vida, int velocidad, int energiaMagica, int poder,
                   String raza, String altura, String habitat,
                   String habilidadesMagicas, int poderMagico) {
        super(vida, velocidad, energiaMagica, poder);
        this.raza = raza;
        this.altura = altura;
        this.habitat = habitat;
        this.habilidadesMagicas = habilidadesMagicas;
        this.poderMagico = poderMagico;
    }
 
    public String getRaza() { return raza; }
    public String getAltura() { return altura; }
    public String getHabitat() { return habitat; }
    public String getHabilidadesMagicas() { return habilidadesMagicas; }
    public int getPoderMagico() { return poderMagico; }
 
    public void aumentarPoderMagico(int cantidad) {
        poderMagico += cantidad;
        System.out.println(raza + " aumenta su poder mágico a " + poderMagico);
    }
 
    public void disminuirPoderMagico(int cantidad) {
        poderMagico = Math.max(0, poderMagico - cantidad);
        System.out.println(raza + " disminuye su poder mágico a " + poderMagico);
    }
 
    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("Raza: " + raza);
        System.out.println("Altura: " + altura);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Habilidades mágicas: " + habilidadesMagicas);
        System.out.println("Poder mágico: " + poderMagico);
    }
}
 
class Pixie extends Duendes {
    public Pixie() {
        super(60, 90, 80, 40, "Pixie", "20cm", "Bosque", "Agua", 50);
    }
 
    @Override
    public void moverse() {
        System.out.println("El Pixie corre rápidamente entre los árboles del bosque.");
    }
}
 
class Leprechaun extends Duendes {
    public Leprechaun() {
        super(70, 60, 70, 55, "Leprechaun", "80cm", "Cueva", "Fuego", 65);
    }
 
    @Override
    public void moverse() {
        System.out.println("El Leprechaun corre con sigilo por las cuevas.");
    }
}
 
class Trasgo extends Duendes {
    public Trasgo() {
        super(80, 50, 60, 60, "Trasgo", "1mtr", "Bosque", "Tierra", 45);
    }
 
    @Override
    public void moverse() {
        System.out.println("El Trasgo camina pesadamente por el bosque.");
    }
}