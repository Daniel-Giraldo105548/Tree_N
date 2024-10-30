package co.edu.umanizales.tree_n_api.model;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class NodeN_2 {
    private Person data;
    private List<NodeN_2> parent = new ArrayList<>();

    public NodeN_2(Person data){
        this.data = data;
    }

    public void addParend(NodeN_2 parend) {
        this.parent.add(parend);
    }

}
