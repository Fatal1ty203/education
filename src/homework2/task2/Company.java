package homework2.task2;

import homework2.task1.Animal;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String lastNameDirector;
    private int workers, companyValue;

    public Company(String lastNameDirector, int workers) {
        this.lastNameDirector = lastNameDirector;
        this.workers = workers;
    }

    public int addWorker(){
        return workers++;
    }

    public int fireWorker(int n){
        return workers -= n;
    }





    @Override
    public String toString() {
        return "lastNameDirector = '" + lastNameDirector + '\'' +
                ", workers = " + workers ;
    }

    private class obj {
    }
}
