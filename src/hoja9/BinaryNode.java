

/*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102
Marlon Josue Castillo Martinez                  14427

Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 9

  * Codigo obtenido de:
  *  Implements a top-down splay tree.
 * Available at http://www.link.cs.cmu.edu/splay/
 * Author: Danny Sleator <sleator@cs.cmu.edu>
 * This code is in the public domain.
 
-------------------------------------------------------------------------*/ 
  


class BinaryNode
{
    BinaryNode(Comparable theKey) {
        key = theKey;
        left = right = null;
    }   

    Comparable key;          // The data in the node
    BinaryNode left;         // Left child
    BinaryNode right;        // Right child
    
}
