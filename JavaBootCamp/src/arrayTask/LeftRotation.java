package arrayTask;

import java.util.ArrayList;

public class LeftRotation {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int d = 4;
		int temp;
        int first = 0;
        int last = 0;
        ArrayList<Integer> arr2 = new ArrayList();
        for(int i =0; i<d; i++){
            first = arr.get(0);
            //last = arr.get(arr.size()-1);
            //for(int j=0; j<arr.size()-1; j++){
                
              //  arr.set(j, arr.get(j+1));    
            //}
            
            //arr.remove(0);
            arr2 = (ArrayList) arr.clone();
            arr2.remove(0);
            arr2.add(arr.size() - 1,first);
            arr = (ArrayList) arr2.clone();
            //arr.set(arr.size()-1, temp);

            for (int j = 0; j < arr.size(); j++) {
				 System.out.print(arr.get(j));
			}
            System.out.println();
        }
	}
}
