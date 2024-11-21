int minEdge(int source, int destination) {
    if (source == destination) {
        return 0;
    }
    boolean visited[] = new boolean[vertices];
    int[] distance = new int[vertices];
    Arrays.fill(distance, -1);
    Queue<Integer> que = new LinkedList<>();
    que.add(source);
    visited[source] = true;
    distance[source] = 0;
    while (!que.isEmpty()) {
        int current = que.poll();
        for (int ele : adjacency_List[current]) {
            if (!visited[ele]) {
                visited[ele] = true;
                distance[ele] = distance[current] + 1;
                que.add(ele);

                if (ele == destination) {
                    return distance[ele];
                }
            }
        }
    }
    return -1;

}