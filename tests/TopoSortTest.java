import graph.GraphError;
import graph.TopoSort;
import org.junit.jupiter.api.Test;

public class TopoSortTest<T> {

    /**
     * Tests the reference counting topological sort with 6 nodes.
     *
     * @throws GraphError a error occurs within the graph.
     */
    @Test
    void TestBinTree6() throws GraphError {
        TopoSort<T> newGraph = new TopoSort<T>();
        newGraph.add((T) "A");
        newGraph.add((T) "B");
        newGraph.add((T) "C");
        newGraph.add((T) "D");
        newGraph.add((T) "E");
        newGraph.add((T) "F");
        newGraph.add((T) "A",(T) "B");
        newGraph.add((T) "A",(T) "C");
        newGraph.add((T) "A",(T) "F");
        newGraph.add((T) "B",(T) "F");
        newGraph.add((T) "C",(T) "E");
        newGraph.add((T) "E",(T) "D");
        System.out.println(newGraph.getSort());
    }

    /**
     * Tests the reference counting topological sort with 8 nodes.
     *
     * @throws GraphError a error occurs within the graph.
     */
    @Test
    void TestBinTree8() throws GraphError {
        TopoSort<T> newGraph = new TopoSort<T>();
        newGraph.add((T) "1");
        newGraph.add((T) "2");
        newGraph.add((T) "3");
        newGraph.add((T) "4");
        newGraph.add((T) "5");
        newGraph.add((T) "6");
        newGraph.add((T) "7");
        newGraph.add((T) "8");
        newGraph.add((T) "2",(T) "1");
        newGraph.add((T) "1",(T) "4");
        newGraph.add((T) "4",(T) "3");
        newGraph.add((T) "3",(T) "5");
        newGraph.add((T) "8",(T) "6");
        newGraph.add((T) "5",(T) "7");
        newGraph.add((T) "7",(T) "8");
        System.out.println(newGraph.getSort());
    }
}
