package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public static int lowCount = 0;
    public static int mediumCount = 0;
    public static int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
     //traversing through the input array
	    for(int i=0;i<cycles.length;i++) {
	    	//counting for battery having less than 400 charge cycle
	    	if(cycles[i]<400) {
	    		counts.lowCount++;
	    	}
	    	//counting for battery having between 400 and 919 charge cycle
	    	else if(cycles[i]>=400 && cycles[i]<=919) {
	    		counts.mediumCount++;
	    	}
	    	else if(cycles[i]>=920) {
	    		counts.highCount++;
	    	}
	    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000,919,400,920,0,-1});
    assert(counts.lowCount == 4);
    assert(counts.mediumCount == 5);
    assert(counts.highCount == 2);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
