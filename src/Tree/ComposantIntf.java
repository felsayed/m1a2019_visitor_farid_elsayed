package Tree;

import java.util.Set;

public interface ComposantIntf {
    int getValue();
    void setValue(int value);
    boolean addNode(Composant node);
    boolean removeNode(Composant node);
    Set<Composant> getChildren();
    boolean isNode();

}
