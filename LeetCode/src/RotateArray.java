
public class RotateArray {
	public static void main(String[] args) {    
	 int arr[] = new int[]{1,2,3,4,5,6,7};
	 
	 int n = 3;
	 
	 // �� ������ ����������� �����
     System.out.println("Original array: ");    
     for (int i = 0; i < arr.length; i++) {
    	System.out.print(arr[i] + " ");
     }
     
     // ������ "for" �����  �� �������� "n" ���� �����
     for (int i = 0; i < n; i++) {
    	 // ���� ��������� ������� �� ������
    	 int last = arr[arr.length - 1];
    	 
    	 for(int j = arr.length - 1; j > 0; j--) {
    		 arr[j] = arr[j-1];
    	 }
    	 arr[0] = last;
     }
     
     System.out.println();
     
     System.out.println("Rotated array: ");    
     for (int i = 0; i < arr.length; i++) {
    	System.out.print(arr[i] + " ");
     }
	}
}
