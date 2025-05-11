public class SistemaHospitalario {
    public static void main(String[] args) {
        CoordinadorTurnos coordinador = new CoordinadorTurnos();

        Medico medico1 = new Medico("Dr. Pepito", coordinador);
        Enfermero enfermero1 = new Enfermero("Garito", coordinador);
        Paciente paciente1 = new Paciente("Api Luna", coordinador);

        coordinador.registrar(medico1);
        coordinador.registrar(enfermero1);
        coordinador.registrar(paciente1);

        medico1.enviarMensaje("Orden para análisis de sangre");
        enfermero1.enviarMensaje("Paciente lista para el control");
        paciente1.enviarMensaje("Tengo fiebre desde anoche");
    }
}
