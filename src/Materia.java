public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;
    
    public Materia(String nombre, String codigo, int creditos, double calificacion){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
        this.calificacion=calificacion;
    }
    
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
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        if(codigo != null && !codigo.trim().isEmpty()){
            this.codigo=codigo;
        }
        else{
            System.out.println("Codigo Invalido.");
        }
    }
    
    public int getCreditos(){
        return creditos;
    }
    
    public void setCreditos(int creditos){
        if(creditos > 0){
            this.creditos=creditos;
        }
        else{
            System.out.println("Debe ingresar un numero mayor a 0.");
        }
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion(double calificacion){
        if(calificacion > 0){
            this.calificacion=calificacion;
        }
        else{
            System.out.println("Debe ingresar un numero mayor a 0.");
        }
    }
}
