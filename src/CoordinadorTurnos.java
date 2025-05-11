class CoordinadorTurnos {
    private IPersona[] personas;
    private int cantidadPersonas;
    private static final int MAX_PERSONAS = 10;
    // Constructor de la clase CoordinarTurnos
    public CoordinadorTurnos() {
        personas = new IPersona[MAX_PERSONAS];
        cantidadPersonas = 0;
    }
    public void registrar(IPersona persona) {
        if (cantidadPersonas < MAX_PERSONAS) {
            personas[cantidadPersonas] = persona;
            cantidadPersonas++;
        } else {
            System.out.println("No se pueden registrar más personas.");
        }
    }
    //sobrecarga: envio a todos
    public void enviar(IPersona emisor, String mensaje) {
        for (int i = 0; i < cantidadPersonas; i++) {
            IPersona p = personas[i];
            if (!p.equals(emisor)) {
                p.recibirMensaje("De " + emisor.getNombre() + ": " + mensaje);
            }
        }
    }
    //sobrecarga: envio a uno
    public void enviar(IPersona emisor, String mensaje, IPersona destino) {
        for (int i = 0; i < cantidadPersonas; i++) {
            IPersona p = personas[i];
            if (p.equals(destino)) {
                p.recibirMensaje("De " + emisor.getNombre() + ": " + mensaje);
                break;
            }
        }
    }
}
