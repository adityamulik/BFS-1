
public class RightSideViewTree {

    public static void main(String[] args) {
       
    }

    public List<Integer> rightSideView(TreeNode root) {
       
	if (root == null) return new ArrayList<>();    

        List<Integer> result = new ArrayList<>();;

	Queue<TreeNode> q = new LinkedList<>();

	q.add(root);

	while(!q.isEmpty()) {
	    int size = q.size();

	    for(int i=0; i<size; i++) {
		TreeNode curr = q.poll();        
		if(i == size - 1) {
		    result.add(curr.val);
		}

		if(curr.left != null) {
		    q.add(curr.left);
		}

		
		if(curr.right != null) {
		    q.add(curr.right);
		}
	    }
	}

	return result;
    }
}
