import java.util.ArrayList;

public class Universidad {
    
    String nombre;
    String direccion;
    ArrayList<Carrera> carreras;//Relacion con la clase Carrera.
    ArrayList<Estudiante> estudiantes;//Relacion con la clase Estudiante.
    
    public Universidad(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.carreras= new ArrayList<>();
        this.estudiantes=new ArrayList<>();
    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public ArrayList<Carrera> getCarreras(){
        return carreras;
    }
    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
    //SETTERS
    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
           this.nombre=nombre;
        }
        else{
            System.out.println("Nombre Invalido.");
        }
    }
    public void setDireccion(String direccion){
         if(direccion != null && !direccion.trim().isEmpty()){
           this.direccion=direccion;
        }
        else{
            System.out.println("Dirección Invalida.");
        }
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes){
        this.estudiantes=estudiantes;
    }
    
    //METODOS PARA GESTIONAR CARRERAS
    public void agregarCarrera(Carrera carrera){
        if(carrera != null){
            carreras.add(carrera);
            System.out.println("Carrera " + carrera.getNombre() + " agregada exitosamente.");
        }
        else{
            System.out.println("Carrera invalida.");
        }
    }
    
    public Carrera obtenerCarrera(String nombre){//esto es para buscar la carrera a la que se le va a inscribir el estudiante.
        for(Carrera carrera : carreras){
            if(carrera.getNombre().equalsIgnoreCase(nombre)){
                return carrera;
            }
        }
        return null;
    }
    
    public void listarCarreras(){
        System.out.println("=== CARRERAS DE " + nombre + " ===");
        if(carreras.isEmpty()){
            System.out.println("No hay carreras registradas.");
        }
        else{
            for(Carrera carrera : carreras){
                System.out.println("- " + carrera.getNombre());
            }
        }
    }
}
