class Paciente extends PersonaBase {
    public Paciente(String nombre, CoordinadorTurnos coordinador) {
        super(nombre, coordinador);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("[Paciente " + getNombre() + "] recibe: " + mensaje);
    }
}
