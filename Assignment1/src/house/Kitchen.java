package house;

public class Kitchen {

	public static void main(String[] args) {

		String appliances[] = {"Mixer", "Cooker", "Oven", "Toaster"};
		
		System.out.println("Kitchen appliances: ");
		for(String appliance: appliances)
			System.out.print(appliance + " ");
		System.out.println();
		
		int i=0;
		String copies[] = new String[appliances.length];
		for(String appliance: appliances)
			copies[i++] = appliance;
		System.out.println();
		
		System.out.println("After copying: ");
		for(String copy: copies)
			System.out.print(copy + " ");
	}
}