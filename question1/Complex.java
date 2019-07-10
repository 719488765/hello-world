//复数类
class Complex{
	private double real;//实部
	private double virtual;//虚部
	public Complex(){
		this.real=0;
		this.virtual=0;
	}
	public Complex(double real,double virtual){
		this.real=real;
		this.virtual=virtual;
	}
	public double getreal(){
		return this.real;
	}
	public double getvirtual(){
		return this.virtual;
	}
	public void setreal(double real){
		this.real=real;
	}
	public void setvirtual(double virtual){
		this.virtual=virtual;
	}
	public boolean equals(Complex c){
		if(c==null){
			return false;
		}
		if(this.real==c.getreal()&&this.virtual==c.getvirtual()){
			return true;
		}
		else{
			return false;
		}
	}
	//加法
	public Complex add(Complex c){
		double real=this.real+c.getreal();
		double virtual=this.virtual+c.getvirtual();
		return new Complex(real,virtual);
		 
	}
	//减法
	public void sub(Complex c){
		this.real-=c.getreal();
		this.virtual-=c.getvirtual();
	}
	//乘法
	public static Complex muti(Complex c,Complex d){
		double real=c.real*d.real-c.virtual*d.virtual;
		double virtual=c.real*d.virtual+c.virtual*d.real;
		return new Complex(real,virtual);
	}
	//除法
	public Complex div(Complex c){
		double real=(this.real*c.getreal()+this.virtual*c.getvirtual())/(c.getreal()*c.getreal()+c.getvirtual()*c.getvirtual());
		double virtual=(this.virtual*c.getreal()-this.real*c.getvirtual())/(c.getreal()*c.getreal()+c.getvirtual()*c.getvirtual());
		return new Complex(real,virtual);
	}
	//设计者
	public static String getDesigner(){
		String s="设计者：[李智春]  学号：[20164487] 班级：[计算机1602]";
		return s;
	}
}