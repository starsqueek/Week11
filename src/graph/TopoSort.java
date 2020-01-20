package graph;

import java.util.*;

public class TopoSort<T> extends AdjacencyGraph<T> implements TopologicalSort<T> {
    Stack<T> sort;
    Set<T> visiting = new HashSet<T>();

    /**
     * The getSort method is to sort the graph into a reference counting topological sort.
     *
     * @return Stack of sorted nodes.
     */
    @Override
    public List<T> getSort() throws GraphError {
        sort = new Stack<T>(); // start a new sort
        int remainingnum = getNoOfNodes();
        while (sort.size() < remainingnum) {

        for (T node: getNodes()) {
            if(CountNeighbours(node).size() == 0){
                visitNode(node);
            }

        }}
        return sort;
    }

    /**
     * The CountNeighbours method is called wto see how many Neighbours it has remaining.
     *
     * @return ArrayList NeighboursList is returned as it isd the array list of all the nodes that is its Neighbour
     */
    private ArrayList CountNeighbours(T node) {
        ArrayList NeighboursList = new ArrayList();
        for (T nodeV: getNodes()) {
            if (visiting.contains(nodeV)){
                //
            } else if(contains(nodeV,node)){
                NeighboursList.add(nodeV);
            }
        }
        return NeighboursList;
    }

    /**
     * The visitNode method is called when the node has no Neighbours remaining. The method does not return a value.
     *
     * @throws GraphError a error occurs within the graph.
     */
    private void visitNode(T node) throws GraphError {
        if (sort.contains(node)) {
            return;
        }
        if (visiting.contains(node)) {
            throw new GraphError("Cannot get topological sort.  Graph is not acyclic.");
        }
        visiting.add(node);
        for (T neighbour: getNeighbours(node)) {
            if(CountNeighbours(neighbour).size() == 0){
                visitNode(neighbour);
            }
        }
        sort.push(node);
        visiting.remove(node);
    }
}
