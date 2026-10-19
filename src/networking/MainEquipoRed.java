package networking;

public class MainEquipoRed {
    public static void main(String[] args) {
        EquipoRed router = new EquipoRed();
        router.nombre = "Router";
        router.direccionIP = "19236731232";
        router.tipo = "Router";
        router.conectado = false;

        EquipoRed switchE = new EquipoRed();
        switchE.nombre = "Switch";
        switchE.direccionIP = "982222221";
        switchE.tipo = "Switch";
        switchE.conectado = true;

        EquipoRed accessPoint = new EquipoRed();
        accessPoint.nombre = "Access Point";
        accessPoint.direccionIP = "123456789";
        accessPoint.tipo = "Access Point";
        accessPoint.conectado = false;

        router.mostrarInformacion();
        router.conectar();
        router.mostrarEstado();

        switchE.mostrarInformacion();
        switchE.desconectar();
        switchE.mostrarEstado();

        accessPoint.mostrarInformacion();
        accessPoint.conectar();
        accessPoint.mostrarEstado();




    }
}
