public class Usuario {
    
    public String nombre, contraseña;
    public Personaje[] personajes; 
    public int numPersonajes;
    
    public Usuario(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.numPersonajes = 0;
        personajes = new Personaje[100];
    }
    
    public void comprobarUsuario(String nombre, String contraseña) throws UserNotFoundException{
        if(!this.nombre.equals(nombre) && !this.contraseña.equals(contraseña))
            throw new UserNotFoundException("El usuario no existe");
    }
    
    public void crearNuevoPersonaje(String nombre, String raza, int nivel){
        this.personajes[numPersonajes] = new Personaje(nombre,raza,nivel);
        this.numPersonajes++;
    }
    
    public void crearNuevoPersonaje(String nombre, String raza){
        this.personajes[numPersonajes] = new Personaje(nombre,raza,1);
        this.numPersonajes++;
    }
    
    public void borrarPersonaje(String nombre){
        int i = 0;
        boolean enc = false;
        while (enc && i<personajes.length){
            if(personajes[i].nombre.equals(nombre)){
                    this.personajes[i] = null;
                    this.numPersonajes--;
                    enc = true;
                    if(i!=this.personajes.length-1)
                        for(int z=i; z<personajes.length-1; z++)
                            this.personajes[z] = this.personajes[z+1];
            }
           	i++;
        }
    }
}
