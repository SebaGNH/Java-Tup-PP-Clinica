public class Clinica {
    /*   public static void main(String[] args){        
    }
    
        Desarrolle en la clase Clinica un método que reciba un Paciente por parámetro y la agregue al vector correspondiente
    */ 

    Paciente[] pacientes;

    public Clinica(int cantPacientes){
        pacientes = new Paciente[cantPacientes];
    }
    
    public void AgregarPaciente(Paciente p){
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i]==null) {
                pacientes[i] = p;
                break;
            }
        }
    }

    ////6. Desarrolle en la clase Clinica un método que devuelva el el paciente que más pagó por sus sesiones.
    public String PacienteQueMasPago(){
        String datosPaciente = "";
        float mayorPago = 0;
        Paciente p = new Paciente(); // por este motivo creamos el constructor limpio en la calse paciente
        
        for (Paciente paciente : pacientes) {
            if (paciente != null && paciente.getMontoPagadoPorPaciente() > mayorPago) {
                mayorPago = paciente.getMontoPagadoPorPaciente();
                p = paciente;
            }
        }
        datosPaciente = p.toString();
        return datosPaciente;
    }

    // 7. Desarrolle en la clase Clinica un método que devuelva el monto promedio de las bonificaciones de las obras sociales.
    public float MontoPromedioBonificaciones(){
        float monto = 0;
        int contador = 0;
        for (Paciente paciente : pacientes) {
            if (paciente != null) {
                contador ++;
                monto += paciente.getMontoBonificacion();
            }
        }
        float montoPromedio = monto / contador;
        return montoPromedio;
    }








}
