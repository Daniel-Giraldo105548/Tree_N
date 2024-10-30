package co.edu.umanizales.tree_n_api.service;

import co.edu.umanizales.tree_n_api.model.NodeN_2;
import co.edu.umanizales.tree_n_api.model.TreeN_2;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class TreeService_2 {
    private TreeN_2 treeN_2;
    private NodeN_2 nodeN_2;

    @PostConstruct
    public void init() {
        treeN_2 = new TreeN_2();
    }

    public NodeN_2 showP() {
        return treeN_2.getNodes();
    }
}
