package com.utils;

import java.util.HashSet;
import java.util.Set;

/**
 * 集合的操作
 *
 */
public class SetOptUtils {
	
    /**
     * 交集运算
     * @param dest 集合数量大一点
     * @param src
     * @return
     */
    public static <T> Set<T> intersect(Set<T> dest, Set<T> src) {  
        Set<T> set = new HashSet<T>(src.size());  
        copy(set, src);  
        set.retainAll(dest);  
        return set;  
    } 
    
    /**
     * 并集运算
     * @param dest
     * @param src
     * @return
     */
    public static <T> Set<T> union(Set<T> dest, Set<T> src) {  
        Set<T> set = new HashSet<T>(src.size());  
        copy(set, src);  
        set.addAll(dest);  
        return set;  
    } 
    
    /**
     * 差集运算
     * @param dest
     * @param src
     * @return
     */
    public static <T> Set<T> diff(Set<T> dest, Set<T> src) {  
        Set<T> set = new HashSet<T>(src.size());  
        copy(set, src);  
        set.removeAll(dest);  
        return set;  
    }  
    
    /**
     * 
     * @param dest
     * @param src
     */
    private static <T> void copy(Set<T> dest, Set<T> src) {  
        dest.addAll(src);  
    }
}
