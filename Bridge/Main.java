package Bridge;
  
public class Main {


public static void main(String[] args) {


 // Combinación 1: Control básico con Radio


System.out.println("= Control Básico con Radio =");

ControlRemoto control1 = new ControlRemotoBasico(new Radio());
    probarControlRemoto(control1);

// Combinación 2: Control avanzado con TV
System.out.println("\n = Control Avanzado con TV =");
ControlRemotoAvanzado control2 = new ControlRemotoAvanzado(new TV());
    probarControlRemoto(control2);
    control2.mute(); // Funcionalidad exclusiva del control avanzado


// Combinación 3: Control básico con TV


System.out.println("\n= Control Básico con TV =");


ControlRemoto control3 = new ControlRemotoBasico(new TV());


probarControlRemoto(control3);


// Combinación 4: Control avanzado con Radio
 

System.out.println("\n = Control Avanzado con Radio =");


ControlRemotoAvanzado control4 = new ControlRemotoAvanzado(new Radio());


probarControlRemoto(control4);


control4.record();

// Combinaciones con proyector
System.out.println("\n= Control Básico con Proyector =");

ControlRemoto control5 = new ControlRemotoBasico(new Projector());
    probarControlRemoto(control5);


System.out.println("\n = Control Avanzado con Proyector =");
ControlRemotoAvanzado control6 = new ControlRemotoAvanzado(new Projector());
    probarControlRemoto(control2);
    control2.mute();

System.out.println("\n = Control de Voz con Proyector =");
ControlRemotoVoz control7 = new ControlRemotoVoz(new Projector());
    control7.executeVoiceComand("encender");
    control7.executeVoiceComand("subir volumen");
    control7.executeVoiceComand("bajar volumen");
    control7.executeVoiceComand("apagar");
    control7.executeVoiceComand("comando no reconocido");

}


public static void probarControlRemoto(ControlRemoto control) {


control.togglePower(); // Encender


control.volumeUp();


control.channelUp();


control.volumeDown();


control.togglePower(); // Apagar


}


}
