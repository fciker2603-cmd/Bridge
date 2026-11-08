package Bridge;

public class ControlRemotoAvanzado extends ControlRemoto {
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void togglePower() {
        System.out.println("Control avanzado: Power inteligente");
        if (dispositivo.isEnabled()) {
            dispositivo.disable();
        } else {
            dispositivo.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Control avanzado: Bajar volumen");
        int nuevoVolumen = dispositivo.getVolume() - 10;
        dispositivo.setVolume(Math.max(0, nuevoVolumen));
    }

    @Override
    public void volumeUp() {
        System.out.println("Control avanzado: Subir volumen");
        int nuevoVolumen = dispositivo.getVolume() + 10;
        dispositivo.setVolume(Math.min(100, nuevoVolumen));
    }

    @Override
    public void channelDown() {
        System.out.println("Control avanzado: Canal anterior");
        int nuevoCanal = dispositivo.getChannel() - 1;
        dispositivo.setChannel(Math.max(1, nuevoCanal));
    }

    @Override
    public void channelUp() {
        System.out.println("Control avanzado: Canal siguiente");
        int nuevoCanal = dispositivo.getChannel() + 1;
        dispositivo.setChannel(Math.max(1, nuevoCanal));
    }

    public void mute() {
        System.out.println("Control avanzado: Mute");
        dispositivo.setVolume(0);
    }

    public void record() {
        System.out.println("Control avanzado: Grabar");
    }
}
