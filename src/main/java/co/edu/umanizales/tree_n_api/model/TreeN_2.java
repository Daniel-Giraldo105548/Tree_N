package co.edu.umanizales.tree_n_api.model;

import lombok.Data;

@Data
public class TreeN_2 {
    private NodeN_2 nodes;

    public String add(Person person) {
        if(nodes == null){
            nodes = new NodeN_2(person);
            return "Eres el padre";
        }
        else{
            NodeN_2 newNode = new NodeN_2(person);
            newNode.addParend(nodes);

            nodes = newNode;
            return "Eres el hijo" ;
        }
    }
}
