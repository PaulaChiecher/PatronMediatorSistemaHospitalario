class Enfermero extends PersonaBase{
    public Enfermero(String nombre, CoordinadorTurnos coordinador) {
        super(nombre, coordinador);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("[Enfermero " + getNombre() + "] recibe: " + mensaje);
    }
}
