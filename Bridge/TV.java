package Bridge;

public class TV implements Dispositivo {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;
    // ... Implementación de los métodos de la interfaz ...

    public boolean isEnabled() { 
        return on; 
    }


    public void enable() { 
        on = true;
        System.out.println("TV encendida"); 
    }

    public void disable(){
        on = false;
        System.out.println("TV apagada");
    }

    // Métodos getters y setters de volumen y canal
   
    public int getVolume() {    
        return volume;
    }
  
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }  
    }
   
    public int getChannel() {
        return channel;
    }
   
    public void setChannel(int channel){
        if (channel > 0) {
            this.channel = channel; 
        }
    }

  //Print status 
    public void printStatus() {
        System.out.println("---__---____----____---___---___---___---___----__\n");
        System.out.println("Estado del Televisor:\n");
        System.out.println(("Encendido:    " + (on ? "Si" : "No\n")));
        System.out.println("Volumen:     " + volume + "%\n");
        System.out.println("Canal:       " + channel + "\n");
        System.out.println("---__---____----____---___---___---___---___----__\n");
    }
}
