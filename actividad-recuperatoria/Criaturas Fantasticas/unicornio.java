public abstract class Unicornio extends CriaturasMiticas {
 
    private String habitat;
    private String rol;
 
  
    public Unicornio(int vida, int velocidad, int energiaMagica, int poder,
                     String habitat, String rol) {
        super(vida, velocidad, energiaMagica, poder);
        this.habitat = habitat;
        this.rol = rol;
    }
 
    public String getHabitat() {
        return habitat;
    }
 
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
 
    public String getRol() {
        return rol;
    }
 
    public void setRol(String rol) {
        this.rol = rol;
    }
 

    public void bosqueMagico() {
        System.out.println("El unicornio hace brillar el bosque mágico de " + habitat + ".");
    }
 
    public void protegerBosque() {
        System.out.println("El unicornio protege el bosque como " + rol + ".");
    }
 
    public void galopar() {
        System.out.println("El unicornio galopa a velocidad " + getVelocidad() + ".");
    }
 
    public void atacar() {
        System.out.println("El unicornio ataca con un poder de " + getPoder() + ".");
    }
 
    public void poderCurativo() {
        setVida(getVida() + 20);
        System.out.println("El unicornio sana y recupera 20 de vida. Vida actual: " + getVida());
    }
 
}