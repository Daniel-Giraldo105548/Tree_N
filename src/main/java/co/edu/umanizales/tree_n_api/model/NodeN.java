package co.edu.umanizales.tree_n_api.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class NodeN {
    private Person data;
    private List<NodeN> children = new ArrayList<>();

    public NodeN(Person data){
        this.data = data;
    }

    public void addChild(NodeN child) {
        this.children.add(child);
    }

}
