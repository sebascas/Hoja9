package hoja9;

/*-----------------------------------------------------------------------
Carlos Javier Lima Cordon			14373
Fernando Sebastian Castillo Echeverria		14102
Marlon Josue Castillo Martinez                  14427

Algoritmos y estructura de datos
Seccion 30
Hoja de trabajo 9
-------------------------------------------------------------------------*/
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
            Word variable=new Word();
    
	    if (tipo == 1)
		    return new SimpleSet();
            
            else
	    // aqui se regresara el set empleando sus implementaciones:
                if (tipo == 2)
                    return new RedBlackTree(variable);          
                if (tipo == 3)
                    return new SplayTree();
		if (tipo == 4)
                    return new HasTable();
		if (tipo == 5)
                    return new TreMap();
                
                return null;
	}
	
	
}