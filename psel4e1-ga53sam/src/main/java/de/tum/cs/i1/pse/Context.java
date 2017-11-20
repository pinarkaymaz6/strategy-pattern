package de.tum.cs.i1.pse;

public class Context {
    private int[] array;
    private Policy policy;
    private SortStrategy sortAlgorithm;
    public Context(){

    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public void sort(){
        sortAlgorithm.performSort(this.array);
    }
    public SortStrategy getSortAlgorithm(){
        return sortAlgorithm;
    }
    public void setSortAlgorithm(SortStrategy sortAlgorithm){
        this.sortAlgorithm=sortAlgorithm;
    }
}
