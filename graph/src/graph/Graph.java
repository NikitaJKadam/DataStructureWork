package graph;

public class Graph {
	private int noOfvertices;
	private int [] vertices;
	private int adjMat[][];
	
	 public Graph(int noOfvertices)
	 {
		 this.noOfvertices=noOfvertices;
		 vertices=new int[noOfvertices];
		 adjMat=new int [noOfvertices][noOfvertices];
		 init();
	 }
	 
	 public void init()
	 {
		//to intilize vertices array
		 for(int i=0; i<vertices.length; i++)
		 {
			 vertices[i]=i;			 
		 }
		 int arr[]= {0,1,1,0,0,0,0,
				     1,0,1,0,0,0,0,
				     1,0,0,0,1,0,0,
				     0,1,0,0,1,1,0,
				     0,0,1,1,0,1,0,
				     0,0,0,1,1,0,1,
				     0,1,1,0,0,1,0};
		 int k=0;
		 //to initlize the adjMat		 
		 for(int i=0;i<adjMat.length;i++)
		 {
			 for(int j=0;j<adjMat[i].length;j++) {
				 adjMat[i][j]=arr[k++];
			 }
		 }
	 }
	 public void display() {
		 System.out.print("  ");
		 for(int n:vertices)
		 {
			 System.out.print(n+" ");
		 }
		 System.out.println();
		 //to print adjMat
		 for(int i=0; i<noOfvertices; i++)
		 {
			 System.out.print(vertices[i]+" ");
			 for(int j=0; j<noOfvertices; j++)
			 {
				 System.out.print( adjMat[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
	 }
	 
	 //BFS
	 public void bfs(int startIndex)
	 {
		 int [] queue=new int[100];
		 int front=-1,rear=-1;
		 int visited[]=new int [noOfvertices];
		 
		 queue[++rear]=startIndex;
		 front=0;
		 rear=0;	
		 System.out.println("BFS :");
		 
		 while(front <= rear)
		 {
			 int current=queue[front++];
			//to visit the vertx
			 if(visited[current]==0)
			 {
				 System.out.print(vertices[current]+" ");
				 visited[current]=1;
			 }
			 //to visit the neighbours
			 
			 for(int i=0; i<noOfvertices;i++)
			 {
				 if(adjMat[current][i]==1 && visited[i]==0) {
					 queue[++rear]=i;
				 }
			 }
		 } 		 
	 }
	 
	 //DFS
	 public void dfs(int startIndx,int visited[])	 {
		 
		 //to print the visited vertex
		 if(visited[startIndx]==0)
		 {
			 System.out.print(vertices[startIndx]+" ");
			 visited[startIndx]=1;
		 }
		 //to visit the neighbours 
		 for(int i=0; i<vertices.length; i++)
		 {
			 if(adjMat[startIndx][i]==1 && visited[i]==0)
				 dfs(i, visited);
		 }
	 }
	
}
