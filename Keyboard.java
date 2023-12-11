package EnigmaWindow;

import Enigma.Enigma;

public class Keyboard{
    
    private Enigma enigma;
    //public static final String LAYOUT_KEYBOARD [][]= {{"q","w","e","r","t","z","u","i","o"},
                                                 //   {"a","s","d","f","g","h","j","k"},
                                                 //   {"p","y","x","c","v","b","n","m","l"}};


    public static final String LAYOUT_KEYBOARDTOP [] = {"q","w","e","r","t","z","u","i","o"};
    public static final String LAYOUT_KEYBOARDMID [] = {"a","s","d","f","g","h","j","k"};
    public static final String LAYOUT_KEYBOARDBOTTOM [] = {"p","y","x","c","v","b","n","m","l"};

    public Keyboard(Enigma enigma){
        this.enigma = enigma;
    }
}
