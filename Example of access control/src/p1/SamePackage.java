package p1;

class SamePackage {
	SamePackage(){
		Protection p=new Protection();
		System.out.println("same constructor package");
		System.out.println("n= "+p.n);
		//System.out.println("n_pri= "+n_pri);
		System.out.println("n_pro= "+p.n_pro);
		System.out.println("n_pub= "+p.n_pub);
	}

}
