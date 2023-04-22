package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;

public class main_misc {
    
	
	public static void main(String[] args) {
	  
		int[] v = {1,2,3,4,5,6,7,8};
		Graph_1 g = to_bsearch_tree(v);
	


		
	}
	
	private static void middle_values(LinkedList<Integer> l,int[] v,int strt,int end) {
	     
		int m = (strt+end)/2;
		
		//l.addFirst(v[m]);
		if(!l.contains(v[m])) {
			l.add(v[m]);
			//System.out.println("-->"+l);
		}
		
		if(strt >= end) {
			return;
		}
		
		
		middle_values(l,v,strt,m-1);
		middle_values(l,v,m+1,end);
		
		
		
		
	}
	
	private static Graph_1 to_bsearch_tree(int[] v) {
		
		Graph_1 g = new Graph_1();
		for(int i = 0;i < v.length;i++) {
			g.add(v[i]);
		}
		
		LinkedList<Integer> l = new LinkedList<>();
		middle_values(l,v,0,v.length-1);
		
		int div = 1+((v.length-1)/2);
		
		int curr = 0;
		int qnt = 0;
		for(int i = 0;i < div;i++) {
			if(i == 0) {
				g.link(l.get(0),l.get(1));
				continue;
			}
			if(qnt == 0) {
				curr = i;
				qnt++;
			}
			if(qnt <= 2 && i != curr) {
				g.link(l.get(curr),l.get(i));
				System.out.println(l.get(curr) + "-->" + l.get(i));
				qnt++;
				if(qnt > 2) {
					curr = i;
					qnt = 1;
				}
			}
		}
		
		curr = 0;
		qnt = 0;
		for(int i = div;i < l.size();i++) {
			if(i == div) {
				g.link(l.get(0),l.get(div));
			}
			if(qnt == 0) {
				curr = i;
				qnt++;
			}
			if(qnt <= 2 && i != curr) {
				g.link(l.get(curr),l.get(i));
				System.out.println(l.get(curr) + "-->" + l.get(i));	
				qnt++;
				if(qnt > 2) {
					curr = i;
					qnt = 1;
				}
			}
		}
		
		return g;
	}
	

	
		
}
	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

