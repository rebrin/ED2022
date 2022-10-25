package unidad.nolineales;

public class BSTNode {
    int info;
    BSTNode left,right;
    public BSTNode(){
        left=null;right=null;info=0;
    }
    public BSTNode(int el){
        this(el,null,null);
    }
    public BSTNode(int el, BSTNode l,BSTNode r){
        info=el;left=l;right=r;
    }
}
