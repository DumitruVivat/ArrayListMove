package ArrayMoveApp;


import java.util.ArrayList;

public class ArrayMove {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<>();
		
		data.add(100);
		data.add(200);
		data.add(300);
		data.add(400);
		data.add(null);
		
		FirstIndex(data);
		FirstIndex(data);
		
		LastIndex(data);
		LastIndex(data);
		
		for (Integer integer : data) {
			System.out.println(integer);
		}
		}
	
	 public static ArrayList<Integer> methodA(ArrayList<Integer> array){
        int i = array.size() -1;
        while( i > 0 ){
        array.set(i--, array.get(i));
        }
        array.set(i, null);
        return array;
     }
	 public static ArrayList<Integer> FirstIndex(ArrayList<Integer> array){
		 int i;
		 for ( i = array.size() -1; i > 0; ) {
	            array.set(i--, array.get(i));
	            }
		        array.set(i, null);
	            return array;
	    }
	 public static ArrayList<Integer> LastIndex(ArrayList<Integer> array){
		 int i;
		 for ( i = 0; i < array.size() - 1; ) {
	            array.set(i++, array.get(i));
	            }
		        array.set(i, null);
		        return array;
	    }

}
