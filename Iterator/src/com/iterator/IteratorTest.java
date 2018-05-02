package com.iterator;

import java.util.*;

import junit.framework.TestCase;
  
public class IteratorTest<E> extends TestCase {
    private List<String> list;
    private Iterator<String> iter;
    private FilteredIterator<E> fi;
  
    @SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
  
        iter = list.iterator();
  
        fi = (FilteredIterator<E>) new FilteredIterator<E>((Iterator<E>) iter, new StringTest()) ;              

    }
  
    public void testMoreHasNextsThanElements() {
        assertTrue(fi.hasNext());
        assertTrue(fi.hasNext());
        assertTrue(fi.hasNext());
        assertTrue(fi.hasNext());
        assertTrue(fi.hasNext());
        assertTrue(fi.hasNext());
    }
  
    public void testMultipleHasNextsDoNotAdvanceIterator() {
        fi.hasNext();
        fi.hasNext();
        assertEquals("1", fi.next());
        fi.hasNext();
        fi.hasNext();
        assertEquals("2", fi.next());
    }
  
    public void testNextsWithoutHasNext() {
        assertEquals("1", fi.next());
        assertEquals("2", fi.next());
        assertEquals("3", fi.next());
        assertEquals("4", fi.next());
        assertEquals("5", fi.next());
    }
  
    public void testNextWithNoElementThrowsException() {
        while (fi.hasNext())
            fi.next();
        try {
            fi.next();
            fail();
        } catch (NoSuchElementException e) {
            // expected
        }
    }
  

}