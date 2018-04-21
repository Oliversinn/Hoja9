/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja9;

/**
 * Esta clase devuelve un Map en cualquiera de sus dos variedades
 * @author Oliver Mazariegos 16043
 */
public class MapFactory {
    /**
     * Metodo que devuelve un stack tipo map segun lo indicado por el usuario
     * @param map Es el tipo de map que se desea
     * @return Devuelve un map
     */
    static <K extends Comparable<K>,V> Map<K,V> getMap(String map) {
        if (map.equalsIgnoreCase("RedBlack")) {
            return new MapRedBlackBST<K,V>();
        } else if (map.equalsIgnoreCase("Splay")){
            return new MapSplayBST<K, V>();
        }
        return null;
    }
}

