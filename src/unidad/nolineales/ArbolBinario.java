package unidad.nolineales;

import java.util.ArrayDeque;

public class ArbolBinario {
    BSTNode root;
    public ArbolBinario(){
        root=null;
    }
    public boolean vacia(){
        return root==null;
    }
    public void insertar(int el){
        BSTNode tmp,prev;
        tmp=root;
        prev=null;
        while (tmp!=null){
            prev=tmp;
            if(el>tmp.info) tmp=tmp.right;
            else tmp=tmp.left;
        }//fin de while
        if(vacia()){
            root=new BSTNode(el);
        } else if (el< prev.info) {
            //se inserta a la izquierda
            prev.left=new BSTNode(el);
        }else {
            //se inserta a la derecha
            prev.right=new BSTNode(el);
        }
    }

    public BSTNode regresaNodo(BSTNode p,int el){
      while (p!=null){
          if(el==p.info)
              return p;
          else if (el>p.info) {
              p=p.right;
          }else p=p.left;
      } return null;
    }//fin de regresaNodo

    public boolean contiene(BSTNode p,int el){
        while (p!=null){
            if(el==p.info)
                return true;
            else if (el>p.info) {
                p=p.right;
            }else p=p.left;
        } return false;
    }

    public void visita(BSTNode nodo){
        System.out.print(nodo.info+" ");
    }
    public void recorridoAnchura(){
        BSTNode p=root;
        ArrayDeque<BSTNode> fila=new ArrayDeque();
        fila.add(p);
        while(!fila.isEmpty()){
            p=fila.poll();
            visita(p);
            if(p.left!=null)
                fila.add(p.left);
            if (p.right!=null)
                fila.add(p.right);
        }
    }

    public void preOrden(BSTNode p){
        if(p!=null){
            visita(p);
            preOrden(p.left);
            preOrden(p.right);
        }
    }
    public void inOrden(BSTNode p){
        if(p!=null){
            inOrden(p.left);
            visita(p);
            inOrden(p.right);
        }
    }
    public void posOrden(BSTNode p){
        if(p!=null){
            posOrden(p.left);
            posOrden(p.right);
            visita(p);
        }
    }

    public void delete(int el){
        BSTNode prev = null,tmp,p=root,node;
        //posicionar a p en el elemento a eliminar
        while(p!=null && el!=p.info){
            prev=p;
            if(el>p.info)
                p=p.right;
            else p=p.left;
        }
        node=p;
        if(p!=null && el==p.info){
            if(node.right==null){
                node=node.left;
            } else if (node.left==null) {
                node=node.right;
            }else {
                tmp = node.left;
                while (tmp.right != null)
                    tmp = tmp.right;
                tmp.right = node.right;
                node=node.left;
            }
                if(p==root){
                    root=node;
                } else if (prev.left==p) {
                    prev.left=node;
                }else prev.right=node;
            }
         else if (root!=null) {
            System.out.println("el elemento "+el+" no se encuentra");
        }else System.out.println("el árbol está vacio");
    }
    public static void main(String[] args) {
        ArbolBinario ab=new ArbolBinario();
        ab.insertar(13);
        ab.insertar(10);
        ab.insertar(25);
        ab.insertar(2);
        ab.insertar(12);
        ab.insertar(20);
        ab.insertar(31);
        ab.insertar(29);
//      ab.recorridoAnchura();
//      ab.preOrden(ab.root);
//        System.out.println();
      ab.inOrden(ab.root);
//        System.out.println();
//      ab.posOrden(ab.root);
        ab.delete(2);
        ab.delete(31);
        System.out.println();
        ab.inOrden(ab.root);
    }//fin de main
}//fin de clase
