import exercise.BaseTool;
public class Sort {
	public static void main(String []args){
		int[] list = {22, 3, 123, 1, 2, 43, 12, 5};
		//BaseTool.bubbleSort(list);
		BaseTool.quickSort(list, 0, list.length-1);
		for(int i=0; i<list.length; i++){
			System.out.print(list[i] + " ");
		}
		
	}
}

 