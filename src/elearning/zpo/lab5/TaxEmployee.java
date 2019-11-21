package elearning.zpo.lab5;

import java.util.Observable;
import java.util.Observer;

class TaxEmployee implements Observer {
    @Override
    public void update(Observable o, Object name) {
        System.out.println("Tax Employee received informations from " + name);
    }    
}