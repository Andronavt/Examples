package p2;

class OtherPackage {
	OtherPackage(){
		p1.Protection p=new p1.Protection();
		System.out.println("Designer of another package");
		//System.out.println("n= "+n);
		//System.out.println("n_pri= "+n_pri);
		//System.out.println("n_pro= "+n_pro);
		System.out.println("n_pub= "+p.n_pub);
	}

}
