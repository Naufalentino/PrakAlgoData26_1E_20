public class BinaryTree20 {
    Node020 root;

    public BinaryTree20() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa200 mahasiswa) {
        Node020 newNode = new Node020(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node020 current = root;
            Node020 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current==null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current==null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        Node020 current = root;
        while (current != null) {
            if (ipk == current.mahasiswa.ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node020 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node020 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node020 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node020 getSuccessor(Node020 del) {
        Node020 successor = del.right;
        Node020 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(Node020 node, double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        
        Node020 parent = null;
        Node020 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (ipk == current.mahasiswa.ipk) {
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            } else {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current==root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node020 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }

    }
    
    public void addRekursif(Node020 current, Mahasiswa200 mahasiswa){
        if (root==null) {
            root = new Node020(mahasiswa);
            return;
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            if (current.left==null) {
                current.left = new Node020(mahasiswa);
                return;
            }
            addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            if (current.right==null) {
                current.right = new Node020(mahasiswa);
                return;
            }
            addRekursif(current.right, mahasiswa);
        }
        
    }

    public void cariMinIPK() {
        Node020 current = root;
        while (true) {
            if (current.left != null) {
                current = current.left;
            } else {
                current.mahasiswa.tampilInformasi();
                return;
            }
        }
    }
    
    public void cariMaxIPK(){
        Node020 current = root;
        while (true) {
            if (current.right != null) {
                current = current.right;
            } else {
                current.mahasiswa.tampilInformasi();
                return;
            }
        }
    }
    
    public void tampilMahasiswaIPKdiAtas(double ipkBatas){
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtas(Node020 node, double ipkBatas){
        if (node == null) return;
        tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
        if (node.mahasiswa.ipk > ipkBatas) {
            node.mahasiswa.tampilInformasi();
        }
        tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
    }
    
}