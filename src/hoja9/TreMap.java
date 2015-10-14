package hoja9;

 /*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102
Marlon Josue Castillo Martinez                  14427

Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 9

* Codigo obtenido de:
  * http://optimizarsinmas.blogspot.com/2011/01/manejar-colecciones-ordenadas-treeset-y.html
  * http://www.tutorialspoint.com/java/java_treemap_class.htm
  * http://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html
  * 
  * implementacion de un treemap
 
-------------------------------------------------------------------------*/
  
 

import java.util.TreeMap;

public class TreMap implements WordSet {
    TreeMap<String, String> treeMap = new TreeMap<String, String>();

    @Override
    public void add(Word wordObject) {
        treeMap.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        treeMap.containsValue(word.getWord());
        if(treeMap.containsKey(word.getWord())==true){
            Word verdad=new Word();
            verdad.setWord(word.getWord());
            verdad.setType(treeMap.get(word.getWord()));
            return verdad;
        }else{
            return null;
        }
      }
}
