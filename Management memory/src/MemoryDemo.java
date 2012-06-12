
class MemoryDemo {
	public static void main(String args[]){
		Runtime r= Runtime.getRuntime();
		long mem1,mem2;
		Integer someints[]=new Integer[1000];
		
		System.out.println("Full memory volume: "+r.totalMemory());
		
		mem1=r.freeMemory();
		System.out.println("Begin free memory: "+mem1);
		r.gc();
		mem1=r.freeMemory();
		System.out.println("Free memory after trach: "+mem1);
		
		for(int i=0;i<1000;i++)
			someints[i]=new Integer(i);
		mem2=r.freeMemory();
		System.out.println("Free memory after allocated: "+mem2);
		System.out.println("allocated memory: "+(mem1-mem2));
		
		for(int i=0;i<1000;i++)
			someints[i]=null;
		
		r.gc();
		mem2=r.freeMemory();
		System.out.println("Free memory after build build allocated area: "+mem2);
		
	}

}
