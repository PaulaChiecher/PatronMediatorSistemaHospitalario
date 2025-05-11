class Medico extends PersonaBase{
    public Medico(String nombre, CoordinadorTurnos coordinador) {
        super(nombre, coordinador);
    }
    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("El médico " + getNombre() + " ha recibido el mensaje: " + mensaje);
    }
}
