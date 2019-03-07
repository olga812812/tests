package test22;

import java.util.Random;
import java.util.TreeSet;

public class GitExps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a=rand.nextInt();
		int b=rand.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(a);
		treeSet.add(b);
		
		System.out.println("maxNumber is "+treeSet.last());
		
		//some change for commit
		String notNeededString="";
		String secondCommit="sdfsdf";
		String fifthCommit="sdfsdf555";

	}

}
