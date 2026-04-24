import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean salir=false;
        int opcion=0;
        /*/1) Constructor vacio, no le paso parametros.
        Estudiante e1 = new Estudiante();
        //Esto es necesario porque los atributos estan en private(hay que usar getter y setter)
        e1.setNombre("Martin");
        e1.setApellido("Gimenez");
        e1.setEdad(22);
        e1.setCarrera("Ing. Sist. Inf");
        e1.setPromedio(8);
        System.out.println("Constructor vacio| Alumno 1: ");
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("---------------------------");
        //2)Constructores con parametros
        Estudiante e2 = new Estudiante("Enzo", "Ceballos", 22, "Ing. Sist. Inf.", 9);
        Estudiante e3 = new Estudiante("Luciano", "Soto", 22, "Ing. Sist. Inf.", 10);
        //Estudiante para ingresar datos por teclado
        Estudiante e4 = new Estudiante();
        //Arreglo de Estudiante con objetos de Estudiante
        Estudiante[] estudiantes = new Estudiante[4];
        estudiantes[0]=e1;
        estudiantes[1]=e2;
        estudiantes[2]=e3;
        estudiantes[3]=e4;
        //Ingresar estudiante 4 por teclado
        System.out.println("Ingrese los datos de un estudiante:");
        System.out.println("Nombre: ");
        n=scanner.nextLine();
        estudiantes[3].setNombre(n);
        System.out.println("Apellido: ");
        a=scanner.nextLine();
        estudiantes[3].setApellido(a);
        System.out.println("Edad: ");
        e=scanner.nextInt();
        estudiantes[3].setEdad(e);
        scanner.nextLine();
        System.out.println("Carrera: ");
        c=scanner.nextLine();
        estudiantes[3].setCarrera(c);
        System.out.println("Promedio: ");
        p=scanner.nextDouble();
        estudiantes[3].setPromedio(p);
        scanner.nextLine();
        
        //For del tipo FOREACH(para cada estudiante dentro del arreglo estudiantes)
        for (Estudiante estudiante : estudiantes) {
            System.out.println("---------------------------");
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Carrera: " + estudiante.getCarrera());
            System.out.println("Promedio: " + estudiante.getPromedio());
        }
    */  
        //Datos de mi universidad//
        Universidad universidad = new Universidad("UNViMe", "Garcia Lorca 123");
        //MENU//
        do{
            System.out.println("\n=======MENU=======");
            System.out.println("1. Ingresar una Carrera a la Universidad.");
            System.out.println("2. Ingresar Estudiante a una Carrera");
            System.out.println("3. Listar Estudiantes de una Carrera");
            System.out.println("4. Buscar Estudiante de una Carrera.");
            System.out.println("5. Inscribir Estudiante a una materia");
            System.out.println("6. Listar todas las Carreras.");
            System.out.println("7. Salir.");
            System.out.println("==================");
            System.out.print("Opcion: ");
            opcion=scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1://Ingresar carrera a la universidad
                    System.out.println("\n--- AGREGAR NUEVA CARRERA ---");
                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera=scanner.nextLine();
                    Carrera carrera = new Carrera(nombreCarrera, new ArrayList<Estudiante>());
                    universidad.agregarCarrera(carrera);
                    break;
                    
                case 2://Ingresar estudiante a una carrera
                    System.out.println("\n--- AGREGAR ESTUDIANTE A CARRERA ---");
                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera2=scanner.nextLine();
                    Carrera carreraEncontrada = universidad.obtenerCarrera(nombreCarrera2);
                    
                    if(carreraEncontrada != null){
                        System.out.print("Nombre del estudiante: ");
                        String nombreEst = scanner.nextLine();
                        System.out.print("Apellido del estudiante: ");
                        String apellidoEst = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edadEst = scanner.nextInt();
                        scanner.nextLine();
                        //El promedio se calcula solo, no se ingresa por teclado.
                        double promedioEst = 0;
                        Estudiante nuevoEstudiante = new Estudiante(nombreEst, apellidoEst, edadEst, nombreCarrera2, promedioEst);
                        carreraEncontrada.agregarEstudiante(nuevoEstudiante);
                        System.out.println("Estudiante agregado exitosamente a " + nombreCarrera2);
                    }
                    else{
                        System.out.println("ERROR: La carrera '" + nombreCarrera2 + "' no existe.");
                    }
                    break;
                    
                case 3://Listar estudiantes de una carrera
                    System.out.println("\n--- LISTAR ESTUDIANTES DE UNA CARRERA ---");
                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera3=scanner.nextLine();
                    Carrera carreraAListar = universidad.obtenerCarrera(nombreCarrera3);
                    
                    if(carreraAListar != null){
                        carreraAListar.listarEstudiantes();
                    }
                    else{
                        System.out.println("ERROR: La carrera '" + nombreCarrera3 + "' no existe.");
                    }
                    break;
                    
                case 4://Buscar estudiante
                    System.out.println("\n--- BUSCAR ESTUDIANTE ---");
                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera4=scanner.nextLine();
                    Carrera carreraBusqueda = universidad.obtenerCarrera(nombreCarrera4);
                    
                    if(carreraBusqueda != null){
                        System.out.print("Nombre del estudiante a buscar: ");
                        String nombreEstBuscar = scanner.nextLine();
                        carreraBusqueda.buscarEstudiante(nombreEstBuscar);
                    }
                    else{
                        System.out.println("ERROR: La carrera '" + nombreCarrera4 + "' no existe.");
                    }
                    break;

                case 5://Inscribir estudiante a una materia
                    System.out.println("\n--- INSCRIBIR ESTUDIANTE A UNA MATERIA ---");
                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera5=scanner.nextLine();
                    Carrera carreraInscripcion = universidad.obtenerCarrera(nombreCarrera5);
                    if(carreraInscripcion != null){
                        System.out.print("Nombre del estudiante a inscribir: ");
                        String nombreEstInscribir = scanner.nextLine();
                        Estudiante estudianteInscribir = null;
                        
                        for(Estudiante est : carreraInscripcion.getEstudiantes()){
                            if(est.getNombre().equalsIgnoreCase(nombreEstInscribir)){
                                estudianteInscribir = est;
                                break;
                            }
                        }
                        
                        if(estudianteInscribir != null){
                            System.out.print("Nombre de la materia: ");
                            String nombreMateria = scanner.nextLine();
                            System.out.print("Codigo de la materia: ");
                            String codigoMateria = scanner.nextLine();
                            System.out.print("Creditos de la materia: ");
                            int creditosMateria = scanner.nextInt();
                            System.out.print("Calificacion obtenida: ");
                            double calificacionMateria = scanner.nextDouble();
                            scanner.nextLine();
                            
                            Materia nuevaMateria = new Materia(nombreMateria, codigoMateria, creditosMateria, calificacionMateria);
                            estudianteInscribir.agregarMateria(nuevaMateria);
                            System.out.println("Materia '" + nombreMateria + "' inscrita exitosamente para " + nombreEstInscribir);
                            System.out.println("Promedio actualizado: " + String.format("%.2f", estudianteInscribir.getPromedio()));
                        }
                        else{
                            System.out.println("ERROR: El estudiante '" + nombreEstInscribir + "' no existe en la carrera '" + nombreCarrera5 + "'.");
                        }
                    }
                    else{
                        System.out.println("ERROR: La carrera '" + nombreCarrera5 + "' no existe.");
                    }
                    break;
                    
                case 6://Listar todas las carreras
                    System.out.println();
                    universidad.listarCarreras();
                    break;
                    
                case 7://Salir
                    System.out.println("¡Hasta luego!");
                    salir=true;
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }while(!salir);
        scanner.close();
    }

}
