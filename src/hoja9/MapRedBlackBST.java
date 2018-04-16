/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja9;

/**
 * Clase que utiliza RedBlackTree implementado con la interfaz Map
 * @author Oliver Mazariegos 16043
 */
public class MapRedBlackBST<K extends Comparable<K>, V> implements Map<K, V> {
    private RedBlackBST<K,V> data;

    public MapRedBlackBST() {
        data = new RedBlackBST<K, V>();
    }

    /**
     * @post returns the number of entries in the map
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * @post returns true iff this map does not contain any entries
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * @param k
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    @Override
    public V get(K k) {
        return data.get(k);
    }

    /**
     * @param k
     * @param v
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    @Override
    public V put(K k, V v) {
        data.put(k,v);
        return null;
    }
}