
class SirenRunner {
    public static void main(String[] args) {
        Siren siren = new Siren();
        
        System.out.println("The default value for soundType is \t" + siren.soundType);
        System.out.println("The default value for volume is \t" + siren.volume);
        System.out.println("The default value for powerSource is \t" + siren.powerSource);
        System.out.println("The default value for isEmergency is \t" + siren.isEmergency);
        
        siren.soundType = "Wailing";
        siren.volume = 120;
        siren.powerSource = "Battery";
        siren.isEmergency = true;
        
        System.out.println("The values after initialization");
        System.out.println("The siren sound type: " + siren.soundType);
        System.out.println("The siren volume level: " + siren.volume + " dB");
        System.out.println("The siren power source: " + siren.powerSource);
        System.out.println("Is it for emergencies? " + siren.isEmergency);
    }
}
