import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class graph {

	public Map<Integer, List<Integer>> map = new HashMap<>();

	
	public void add(int data) {
		
		map.put(data, new ArrayList<>());
	}
	

	public void insert(int vertex,int edge , boolean isBiderct) {
        
		if(!map.containsKey(vertex)) {
			add(vertex);
		}
		if(!map.containsKey(edge)) {
			add(edge);
		}
		map.get(vertex).add(edge);
		
		if(isBiderct) {
			map.get(edge).add(vertex);
		}
	}
	public void dispaly() {
		
		for(int x:map.keySet()) {
			System.out.print(x+": ");
			for(int y:map.get(x)) {
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}
	public void removedges(int vertex) {
		if(map.containsKey(vertex)) {
			map.remove(vertex);
			return;
		}
		else {
			System.out.println("edge is not in the garph");
		}
	}
	
	public static void main(String[] args) {
		graph graph =new graph();
		graph.insert(3, 5, true );
		graph.insert(3, 4, true );
		graph.insert(5, 6, false );
		graph.dispaly();
		graph.removedges(5);
		System.out.println("after remove");
		graph.dispaly();
		
	}
}