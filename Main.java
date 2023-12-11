import Enigma.Enigma;
import Enigma.Rotor;
public class Main{
    public static void main(String[] args) {
        //new Enigma();
        //new EnigmaGUI();
        //String alphabets[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        //Integer testNumeri [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,0};
        Rotor test1 = new Rotor();

        Enigma enigma = new Enigma();

        enigma.addRotors(test1);

        System.out.println(enigma.encryptDecrypt("a"));
        //int index = Arrays.asList(alphabets).indexOf("b");
        //System.out.println(rm.encrypt("a"));
    }
}