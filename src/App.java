import java.util.Scanner;

/*
    En el método Main cree un objeto Clinica, agregue 4 pacientes y muestre en pantalla lo que devuelva la
ejecución de los puntos 6 y 7 del enunciado.
*/
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse la cantidad de pacientes");
        int cantPacientes = sc.nextInt();

        Clinica c = new Clinica(cantPacientes);

        for (int i = 0; i < cantPacientes; i++) {
            
            System.out.println("Ingrese DNi");
            int dni = sc.nextInt();

            System.out.println("Ingrese Nombre");
            String nombre = sc.next();
            sc.nextLine();

            System.out.println("Ingrese Apellido");
            String apellido = sc.next();
            System.out.println("Ingrese Cobertura Obra Social");
            int coberturaObraSocial = sc.nextInt();

            System.out.println("Ingrese Código");
            int codigo = sc.nextInt();

            System.out.println("Ingrese Descripción");
            String descripcion = sc.next();
            sc.nextLine();
            System.out.println("Ingrese Monto");
            float monto = sc.nextFloat();

            System.out.println("Ingrse Cantidad de sesiones");
            int cantidadSesiones = sc.nextInt();

            Prestacion pres = new Prestacion(codigo, descripcion,monto);
            Paciente pas = new Paciente(dni, nombre,apellido, coberturaObraSocial, pres,cantidadSesiones);

            c.AgregarPaciente(pas);
        }

        System.out.println("El Paciente que más pagó es " + c.PacienteQueMasPago());
        System.out.println("El monto promedio de las bonificaciones es: "+ c.MontoPromedioBonificaciones());
        
    }
}

