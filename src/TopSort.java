import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class TopSort {

    public static boolean checkForCycle(Graph g){
        Stack stack = new Stack();
        String value = "";
        ArrayList<String> Vertex = g.getVerticies();

        for (String V : Vertex) {
            ArrayList<String> edges = g.getEdgeList(V);
            stack.push(V);
            for (Object keysOnStack : stack) {
                for (String e: edges) {
                    if (keysOnStack == e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	public static ArrayList<String> dfsTopSort(Graph g) {
		long startTime = System.nanoTime();
		if(!checkForCycle(g)) return null;
		
		//write code
		
		

		long difference = System.nanoTime() - startTime;
		System.out.println("Elapsed Time: " + difference);
		
		return new ArrayList<String>();
	}

	public void dfs(String vertex, Graph g) {

	}

	public static ArrayList<String> sourceTopSort(Graph g) {
		long startTime = System.nanoTime();
		if(!checkForCycle(g)) return null;
		
		//write code
		
		

		long difference = System.nanoTime() - startTime;
		System.out.println("Elapsed Time: " + difference);
		
		return new ArrayList<String>();
	}

}
