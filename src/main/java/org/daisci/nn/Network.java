package org.daisci.nn;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dkudryavtsev on 4/30/15.
 */
public class Network {
    private List<Layer> layers = new LinkedList<>();
    private InputLayer inputLayer;
    private OutputLayer outputLayer;


    public void forwardPropagation() {
        Iterator<Layer> layerItr = layers.listIterator();
        if (layerItr.hasNext()) {
            Layer current = layerItr.next();

            while (layerItr.hasNext()) {
                Layer next = layerItr.next();



                current = next;
            }
        }

    }

    public void backPropagation(){

    }
}
