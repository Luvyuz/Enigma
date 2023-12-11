package Enigma;

import java.util.LinkedList;

public class RotorsManager {
    private LinkedList<Rotor> rotors;
    public static final int MAX_N_ROTORS = 5;
    public RotorsManager(){
        rotors = new LinkedList<>();
    }
    public void addRotor(Rotor rotor){
        if(rotors.size() < 5){
            rotors.add(rotor);
        }else{
            System.out.println("Max size reached! " + "(" + (rotors.size() + 1) + ")");
        }
    }
    public void remove(Rotor rotor){
        if(!rotors.isEmpty()){
            rotors.remove(rotor);
        }else{
            System.out.println("There are no rotors!");
        }
    }
    public String encrypt(String c , String type){
        String encryptedLetter;
        switch (type.toUpperCase()) {
            case "INPUT": //entrance
                encryptedLetter  = rotors.get(0).changeLetter(c);
                System.out.println(c + " --> " + encryptedLetter);
                for(int i = 1; i < rotors.size(); i++){
                    String test = encryptedLetter;
                    encryptedLetter = rotors.get(i).changeLetter(encryptedLetter);
                    System.out.println(test + " -->" + encryptedLetter);
                }
                return encryptedLetter;
            case "OUTPUT": //return
                encryptedLetter  = rotors.get(rotors.size() - 1).changeLetter(c);
                System.out.println(c + " --> " + encryptedLetter);
                for(int i = rotors.size() - 2; i > 0; i--){
                    String test = encryptedLetter;
                    encryptedLetter = rotors.get(i).changeLetter(encryptedLetter);
                    System.out.println(test + " -->" + encryptedLetter);
                }
                return encryptedLetter;
            default:
                System.out.println("Only 'Input'/'Output' allowed!");
                return null;
        }
    }
    public Rotor getRotorAtPos(int pos){
        if(pos >= 0 && pos <= rotors.size()){
            return rotors.get(pos);
        }
        return null;
    }
    public int getSize(){
        return rotors.size();
    }
    public boolean isEmpty(){
        return rotors.isEmpty();
    }
}