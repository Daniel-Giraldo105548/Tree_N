package co.edu.umanizales.tree_n_api.service;

import co.edu.umanizales.tree_n_api.model.NodeN;
import co.edu.umanizales.tree_n_api.model.TreeN;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;


@Service
@Data
public class TreeService {
    private TreeN treeN;
    private NodeN nodeN;

    @PostConstruct
    public void init() {
        treeN = new TreeN();
    }

    public NodeN show() {
        return treeN.getRoot();
    }
}
