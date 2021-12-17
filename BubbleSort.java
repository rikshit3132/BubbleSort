import java.util.Scanner;
class BubbleSort{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the Array:\n");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the Array Elements:\n");
	for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();
	}
	System.out.println("Elements Before Sorting:\n");
	for(int i=0;i<size;i++){
	System.out.print(arr[i]+" ");
	}
	System.out.println("Bubble Sort:\n");
	for(int i=0;i<size;i++){
	for(int j=0;j<size-i-1;j++){
	if(arr[j]>arr[j+1]){
	int temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	}
	}
	}
	System.out.println("After Buble Sort\n");
	for(int i=0;i<size;i++){
 System.out.print(arr[i]+" ");
}
	}
}