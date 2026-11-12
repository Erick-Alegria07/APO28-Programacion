public abstract class Dragones extends CriaturasMiticas {
 
    private String habitat;
    private String colores;
    private String poderes;
    private int tamano; 
 
    public Dragones(int vida, int velocidad, int energiaMagica, int poder,
                    String habitat, String colores, String poderes, int tamano) {
        super(vida, velocidad, energiaMagica, poder);
        this.habitat = habitat;
        this.colores = colores;
        this.poderes = poderes;
        this.tamano = tamano;
    }
 
    public String getHabitat() {
        return habitat;
    }
 
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
 
    public String getColores() {
        return colores;
    }
 
    public void setColores(String colores) {
        this.colores = colores;
    }
 
    public String getPoderes() {
        return poderes;
    }
 
    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }
 
    public int getTamano() {
        return tamano;
    }
 
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
 
    
    @Override
    public void moverse() {
        System.out.println("El dragón vuela con sus alas de " + tamano + " metros.");
    }
 
    @Override
    public void mostrarEstadisticas() {
        super.mostrarEstadisticas();
        System.out.println("Hábitat: " + habitat);
        System.out.println("Colores: " + colores);
        System.out.println("Poderes: " + poderes);
        System.out.println("Tamaño: " + tamano + " metros");
    }
}