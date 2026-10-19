package networking;

public class EquipoRed {
    public String nombre;
    public String direccionIP;
    String tipo;
    boolean conectado;

    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Dirección IP: " + direccionIP);
        System.out.println("Tipo: " + tipo);
        String estadoE = conectado ? "conectado" : "desconectado";
        System.out.println("Estado: " + estadoE);
    }

    public void conectar() {
        conectado = true;
        System.out.println(nombre + " se ha conectado");

    }
    void desconectar() {
        conectado = false;
        System.out.println(nombre + " se ha desconectado");
    }

    void mostrarEstado() {
        String estadoE = conectado ? "conectado" : "desconectado";
        System.out.println(nombre + ": " + estadoE);
    }
}


