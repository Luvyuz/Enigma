package Enigma;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Rotor {
    public static final String DEFAULT_ALPHABETS[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    //Assegna la prima della dell'alfabeto alla lettera alla posizione assegnata dell'array
    public static final int DEFAULT_WIRING[] = {7 , 23, 19, 2, 14, 18, 8, 21, 17, 9, 11, 22, 13, 12, 25, 5, 20, 0, 24, 10, 3, 6, 16, 15, 1, 4}; //Generata randomicamente
    private int index;
    public Hashtable<Integer, String> input, output;
    public Hashtable<Integer, Integer> wirings;
    public static final byte N_LETTERS = 26;
    public Rotor() {
        index = 0;
        input = new Hashtable<>();
        output = new Hashtable<>();
        wirings = new Hashtable<>();
        assignValues(DEFAULT_WIRING);
    }
    public Rotor(int wiring[], int index){
        this.index = index;
        input = new Hashtable<>();
        output = new Hashtable<>();
        wirings = new Hashtable<>();
        assignValues(wiring);
    }
    private void assignValues(int wiring[]){
        for(int i = 0; i < DEFAULT_ALPHABETS.length; i++){
            input.put(i, DEFAULT_ALPHABETS[i]);
            output.put(i, DEFAULT_ALPHABETS[i]);
            wirings.put(i, wiring[i]);
        }
    }
    public String changeLetter(String c){
        int key = -1;
        String encryptedLetter = input.get((Arrays.asList(DEFAULT_ALPHABETS).indexOf(c) + index) % DEFAULT_ALPHABETS.length);
        int wiring = Arrays.asList(DEFAULT_ALPHABETS).indexOf(encryptedLetter);
        key = wirings.get(wiring);
        encryptedLetter = output.get(key);
        return encryptedLetter;
    }
    public int getKeyFromValue(String c, String type){
        switch(type.toUpperCase()){
            case "INPUT":
                if(!input.contains(c)){
                    break;
                }
                for(Entry<Integer, String> value : input.entrySet()){
                    if(value.getValue().equals(c)){
                        return value.getKey();
                    }
                }
            case "OUTPUT":
                if(!output.contains(c)){
                    break;
                }
                for(Entry<Integer, String> value : output.entrySet()){
                    if(value.getValue().equals(c)){
                        return value.getKey();
                    }
                }
            default:
                System.out.println("Only 'Input'/'Output' allowed as type");
                break;
        }
        return -1;
    }
    public String getValueFromKey(int key, String type){
        switch (type.toUpperCase()) {
            case "INPUT":
                return input.get(key);
            case "OUTPUT":
                return output.get(key);
            default:
                System.out.println("Only 'Input'/'Output' allowed as type");
                break;
        }
        return "";
    }
    public void rotate(){
        index = (index + 1) % (N_LETTERS - 1);
    }
    public int getIndex(){
        return index;
    }
}
