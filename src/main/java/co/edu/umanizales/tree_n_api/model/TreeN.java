package co.edu.umanizales.tree_n_api.model;

import lombok.Data;

@Data
public class TreeN{
    private NodeN root;

    public NodeN getRoot() {
        return root;
    }

    public String add(Person person) {
        if(root == null){
            root = new NodeN(person);
            return "Eres el padre";
        }
        else{
            NodeN newNode = new NodeN(person);
            newNode.addChild(root);

            root = newNode;
            return "Eres el hijo";
        }
    }
}
