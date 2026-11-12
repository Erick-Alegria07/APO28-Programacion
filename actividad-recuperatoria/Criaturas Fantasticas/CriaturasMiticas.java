public abstract class CriaturasMiticas {

    private int vida;
    private int velocidad;
    private int energiaMagica;
    private int poder;

    public CriaturasMiticas(int vida, int velocidad, int energiaMagica, int poder) {
        this.vida = vida;
        this.velocidad = velocidad;
        this.energiaMagica = energiaMagica;
        this.poder = poder;
    }

 
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

   
    public void descansar() {
        this.vida += 10;
        System.out.println("La criatura descansa y recupera 10 de vida.");
    }

    public void recargarEnergia() {
        this.energiaMagica += 15;
        System.out.println("La criatura recarga 15 de energía mágica.");
    }

   
    public abstract void moverse();

    public void mostrarEstadisticas() {
        System.out.println("Vida: " + vida);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Energía mágica: " + energiaMagica);
        System.out.println("Poder: " + poder);
    }
}