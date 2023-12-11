package Enigma;

import java.util.Hashtable;
import java.util.Map.Entry;

public class PlugBoard {
    Hashtable<Character,Character> plugBoardWiring;
    public PlugBoard(){
        plugBoardWiring = new Hashtable<>();
    }
    public PlugBoard(Hashtable<Character,Character> plugBoardWiring){
        this.plugBoardWiring = plugBoardWiring;
    }
    public void wire(char key, char value){
        for(Entry<Character, Character> keyCheck : plugBoardWiring.entrySet()){
            if(keyCheck.getKey().compareTo(key) == 0){
                plugBoardWiring.put(key, value);
                plugBoardWiring.put(value, key);
                break;
            }
        }
    }
    public char changeLetter(char c){
        if(plugBoardWiring.containsKey(c)){
            return plugBoardWiring.get(c);
        }
        return c;
    }
}
