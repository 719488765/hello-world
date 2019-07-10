class Lianxil{
	public static void main(String[] args){
		Complex c1=new Complex();
		Complex c2=new Complex(3,4);
		c1=c1.add(new Complex(1,2));
		System.out.println("c1="+c1.getreal()+"+"+c1.getvirtual()+"i");
		System.out.println("c2="+c2.getreal()+"+"+c2.getvirtual()+"i");
		Complex c3=Complex.muti(c1,c2);
		Complex c4=c3.div(c2);
		System.out.println("c3="+c3.getreal()+"+"+c3.getvirtual()+"i");
		System.out.println("c4="+c4.getreal()+"+"+c4.getvirtual()+"i");
		System.out.println("c1==c4"+(c1==c4));
		System.out.println("c1.equals(c4)"+c1.equals(c4));
		System.out.println(c2.hashCode());
		System.out.println(Complex.getDesigner());
	}
}