/**
 * Name: Giovanni Joubert
 * Student Number: u18009035
 */

public class GraphSelectionSort {
    Edge[] myEdges;
    /**
     * Initialize a new object using the array of Edges
     */
    public GraphSelectionSort(Edge[] edges) {
        // TODO: your code here...
        myEdges = edges;
    }

    /**
     * Return the array of sorted values.
     */
    public Integer[] getSorted() {
        // TODO: your code here...

        return null;
    }

    /**
     * Return the edges that are still in the graph
     */
    public Edge[] getEdges() {
        // TODO: your code here...
        return myEdges;
    }

    /**
     * Remove the vertex with the lowest value from the graph
     * and append it to the sorted array.
     */
    public void doSortIteration() {
        // TODO: your code here...
        printNodes();
        
    }

    public void printNodes(){
        for(int i = 0; i < myEdges.length; i++){
            System.out.println(myEdges[i].source.getValue());
            System.out.println(myEdges[i].target.getValue());
        }
    }

    /**
     * Return true if all elements are sorted and the graph contains no more vertices.
     */
    public Boolean isSorted() {
        // TODO: your code here...
        return false;
    }
}
