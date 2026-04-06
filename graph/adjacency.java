import java.util.ArrayList;

public class adjacency {
    static class edge {
        int src;
        int dest;
        int wt;
        public edge (int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        /*            
                    (5)
                0-----------1
                           / \
                      (1) /   \ (3)
                         /     \
                        2 ----- 3
                        |  (1)
                    (2) |
                        |
                        4

        */        
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph = new ArrayList[v]; //null stored hoga by default
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 vertex 0 > 1
        graph[0].add(new edge(0, 1, 5));


        // 1 vertex 1 > 0 
        graph[1].add(new edge(1, 0, 5));
        // 1 > 2
        graph[1].add(new edge(1, 2, 1));
        // 1 > 3
        graph[1].add(new edge(1, 3, 3));


        // 2 > 3
        graph[2].add(new edge(2, 3, 1));
        // 2 > 4
        graph[2].add(new edge(2, 4, 2));
        // 2 > 1
        graph[2].add(new edge(2, 1, 1));


        // 3 > 2
        graph[3].add(new edge(3, 2, 1));
        // 3 > 1
        graph[3].add(new edge(3, 1, 3));


        // 4 > 2
        graph[4].add(new edge(4, 2, 2));

        // 2's neighbour
        for(int i=0 ;i<graph[2].size();i++){
            edge e=graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
