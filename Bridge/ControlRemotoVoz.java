package Bridge;
public class ControlRemotoVoz extends ControlRemoto {
    public ControlRemotoVoz(Dispositivo dispositivo) {
        super(dispositivo);
    }
    @Override
    public void togglePower() {
        if (dispositivo.isEnabled()) {
            dispositivo.disable();
        } else {
            dispositivo.enable();
        }
    }       
   
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
    public void executeVoiceComand(String command) {
    System.out.println("\n Escuchando comando de voz: "+ command + "\"");
    switch (command.toLowerCase()) {
        case "encender":
            dispositivo.enable();   
            break;
        case "apagar":
            dispositivo.disable();
            break;   
        case "subir volumen":
            dispositivo.setVolume(dispositivo.getVolume() + 10);
            break;  
        case "bajar volumen":  
            dispositivo.setVolume(dispositivo.getVolume() - 10);
            break;  
        default: System.out.println("Comando de voz no reconocido: " + command);
            break;
    }

    }


}