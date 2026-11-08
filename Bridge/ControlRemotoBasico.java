package Bridge;

public class ControlRemotoBasico extends ControlRemoto {
    public ControlRemotoBasico(Dispositivo dispositivo) { super(dispositivo); }
    // Implementa los métodos abstractos usando 'dispositivo'
    @Override
    public void togglePower() {
        if (dispositivo.isEnabled()) {
            dispositivo.disable();
        } else {
            dispositivo.enable();
        }
    }       
    // ... Implementa volumeDown, volumeUp, etc...
    @Override
    public void volumeDown() {
        System.out.println("Control basico: Bajar volumen");
        dispositivo.setVolume(dispositivo.getVolume() - 10);}
    @Override
    public void volumeUp() {
        System.out.println("Control basico: Subir volumen");
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }
    @Override
    public void channelDown() {
        System.out.println("Control basico: Canal anterior");
        dispositivo.setChannel(dispositivo.getChannel() - 1);
    }
    @Override   
public void channelUp() {
        System.out.println("Control basico: Canal siguiente");
        dispositivo.setChannel(dispositivo.getChannel() + 1);
    }
}