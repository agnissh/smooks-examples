package org.smooks.examples.osgi.servicetracker.groovy;

import org.smooks.container.ExecutionContext;
import org.smooks.delivery.dom.DOMVisitAfter;

public class Test implements DOMVisitAfter {

    public void visitAfter(Element element, ExecutionContext executionContext) 
    {
        println ("In Test.groovy...");
    }

}