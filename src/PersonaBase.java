abstract class PersonaBase implements IPersona{
    private String nombre;
    private CoordinadorTurnos coordinador;
    public PersonaBase(String nombre, CoordinadorTurnos coordinador) {
        this.nombre = nombre;
        this.coordinador = coordinador;
    }
    public String getNombre() {
        return nombre;
    }
    public CoordinadorTurnos getCoordinador() {
        return coordinador;
    }
    public void setCoordinador(CoordinadorTurnos coordinador) {
        this.coordinador = coordinador;
    }
    //sobrecarga: permite enviar sin nombre explicito
    public void enviarMensaje(String mensaje) {
        coordinador.enviar(this, mensaje);
    }
    //sobrecarga: permite enviar con destino explicito
    public void enviarMensaje(String mensaje, IPersona destino) {
        coordinador.enviar(this, mensaje, destino);
    }
}
