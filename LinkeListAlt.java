public class LinkeListAlt {
    Node first; 

    public void add(Node data){

        if(first==null){
            first = data;
        }
        else{
            Node current = first; 
            while(current.neighbour != null){
                current = current.neighbour;
            }
            current.neighbour = data;

        }
        
    }

    public Node getFirst(){
        return first;
    }
}
