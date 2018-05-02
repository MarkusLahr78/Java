
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(Addition.sum(nums));
		}
		static int sum(int[] nums) {
		int counter = 0;
		for (int i: nums)
		{
		counter += i;
		}
		return counter;
	}

}
