package hoja9;

   /*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102
Marlon Josue Castillo Martinez                  14427

Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 9

* Codigo obtenido de:
  * http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/
  * Implements a red-black tree.
     * Note that all "matching" is based on the compareTo method.
     * @author Mark Allen Weiss
 
-------------------------------------------------------------------------*/ 

    class RedBlackNode
    {
            // Constructors
        RedBlackNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        Comparable   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color
    }