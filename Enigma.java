package Enigma;

import java.util.Arrays;

public class Enigma {
    private RotorsManager rotorsManager;
    private PlugBoard plugBoard;
    private Reflector reflector;
    private String lettersPosition[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public Enigma(){
        rotorsManager = new RotorsManager();
        plugBoard = new PlugBoard();
        reflector = new Reflector();
    }
    public void addRotors(Rotor rotor){
        rotorsManager.addRotor(rotor);
    }
    public String encryptDecrypt(String c){
        if(rotorsManager.isEmpty()){
            return null;
        }
        if(Arrays.asList(lettersPosition).contains(c)){
            String letter = c;
            letter = rotorsManager.encrypt(c, "Input");
            int pos = rotorsManager.getRotorAtPos(rotorsManager.getSize() - 1).getKeyFromValue(letter, "OUTPUT");
            System.out.println(pos);
            pos = reflector.reflect(pos);
            System.out.println(pos);
            letter = rotorsManager.getRotorAtPos(rotorsManager.getSize() - 1).getValueFromKey(pos, "OUTPUT");
            letter = rotorsManager.encrypt(c, "Output");
            //plugboard
            return letter;
        }
        return null;
    }
}
