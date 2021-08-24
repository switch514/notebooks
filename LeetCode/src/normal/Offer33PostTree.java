package normal;

public class Offer33PostTree {
    public boolean verifyPostorder(int[] postorder) {
        boolean res = checkPostorder(postorder, 0, postorder.length - 1);
        return res;
    }

    private boolean checkPostorder(int[] postorder, int iLeft, int iRoot) {
        if (iLeft >= iRoot) {
            return true;
        }
        int root = postorder[iRoot];
        int iNewRoot = iLeft;
        for (int i = iLeft; i <= iRoot; i++) {
            if (postorder[i] >= root) {
                iNewRoot = i;
                break;
            }
        }
        for(int i= iLeft; i<iNewRoot;i++){
            if(postorder[i] > root){
                return false;
            }
        }

        for(int i= iNewRoot; i< iRoot; i++){
            if(postorder[i] <root){
                return false;
            }
        }

        return checkPostorder(postorder, iLeft, iNewRoot - 1) && checkPostorder(postorder, iNewRoot, iRoot-1);
    }
}
