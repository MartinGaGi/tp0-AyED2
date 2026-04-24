import java.util.ArrayList;


public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private ArrayList<Materia> materias;//Array list pq pide una LISTA de materias.
    
    //Constructor VACIO
    public Estudiante(){
        materias = new ArrayList<>();
    }
    
    //Constructor CON PARAMETROS
    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
        materias = new ArrayList<>();
    }
    //Getter y Setter NOMBRE
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
         if(nombre != null && !nombre.trim().isEmpty()){
           this.nombre=nombre;
        }
        else{
            System.out.println("Nombre Invalido.");
        }
    }
    //Getter y Setter APELLIDO;
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
         if(apellido != null && !apellido.trim().isEmpty()){
           this.apellido=apellido;
        }
        else{
            System.out.println("Apellido Invalido.");
        }
    }
    //Getter y Setter EDAD
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        if(edad >16){
            this.edad=edad;
        }
        else{
            System.out.println("Edad Invalida, debe haber finalizado sus estudios secundarios.");
        }
    }
    //Getter y Setter CARRERA
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        if(carrera != null && !carrera.trim().isEmpty()){
           this.carrera=carrera;
        }
        else{
            System.out.println("Carrera Invalida.");
        }
    }
    //Getter PROMEDIO - Se calcula automaticamente basado en las materias
    public double getPromedio(){
        return calcularPromedio();
    }
    //Getter MATERIAS
    public ArrayList<Materia> getMaterias(){
        return materias;
    }
    //Metodo agregar materia del punto 4.
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
    //Metodo para calcular el promedio.
    public double calcularPromedio() {
        if (materias.isEmpty()) {
            System.out.println("El estudiante no tiene materias registradas.");
            return 0;
        }

        double suma = 0;//suma las notas

        for (Materia m : materias) {//para cada materia "m" dentro de la lista "materias"...
            suma += m.getCalificacion();//suma = suma + m.getCalificacion
        }

        return suma / materias.size();//suma de las notas dividido la cantidad de materias
    }
    
}