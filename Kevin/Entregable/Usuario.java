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
	
	public void crearNuevoPersonaje(){
		this.personajes[numPersonajes] = new Personaje();
		this.numPersonajes++;
	}
}
