package com.ljd1991.Solution.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import com.ljd1991.Object.TreeNode;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<TreeNode> currentList = new ArrayList<>();
		currentList.add(root);
		while (true) {
			result.add(flush(currentList));
			List<TreeNode> preList = new ArrayList<>();
			for (TreeNode node : currentList) {
				if (node.left != null)
					preList.add(node.left);
				if (node.right != null)
					preList.add(node.right);
			}
			if (preList.size()<=0)
			currentList = preList;
		}
	}

	private List<Integer> flush(List<TreeNode> list) {
		List<Integer> result = new ArrayList<Integer>();
		for (TreeNode node : list) {
			result.add(node.value);
		}
		return result;
	}
}
