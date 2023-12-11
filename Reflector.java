package Enigma;

import java.util.Arrays;
import java.util.Hashtable;

public class Reflector {
    private Integer indexes[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
    private Hashtable<Integer,Integer> reflectorLinks;
    public Reflector(){
        createLinks();
    }
    public Reflector(Integer indexes[]){
        this.indexes = indexes;
        createLinks();
    }
    private void createLinks(){
        reflectorLinks = new Hashtable<>();
        for(int i = 0; i < (indexes.length / 2); i++){
            link(i, indexes[indexes.length/2 + i]);
            link(indexes[indexes.length/2 + i], i);
        }
    }
    public void setIndexes(Integer indexes[]){
        this.indexes = indexes;
        reflectorLinks = new Hashtable<>();
        for(int i = 0; i < (indexes.length / 2); i++){
            link(i, indexes[indexes.length/2 + i]);
            link(indexes[indexes.length/2 + i], i);
        }
    }
    public boolean link(int key, int value){
        if(reflectorLinks.contains(key) || reflectorLinks.contains(value)){
            return false;
        }else if(key == value){
            return false;
        }else if(!Arrays.asList(indexes).contains(key) || !Arrays.asList(indexes).contains(value)){
            return false;
        }
        reflectorLinks.put(key, value);
        reflectorLinks.put(value, key);
        return true;
    }
    public boolean remove(int key){
        if(reflectorLinks.containsKey(key)){
            reflectorLinks.remove(key);
            reflectorLinks.remove(reflectorLinks.get(key));
            return true;
        }
        return false;
    }
    public int reflect(int n){
        if(reflectorLinks.containsKey(n)){
            return reflectorLinks.get(n);
        }
        return -1;
    }
    public Integer[] getIndexes(){
        return indexes;
    }
}
