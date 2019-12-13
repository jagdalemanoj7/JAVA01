package jv19;

public class RameshKaCode extends Exception {
	private Object[] a=new Object[10];
	private int p=0;
	public void add(Object e)
	{
		if(p>=a.length)
		{
		 	increase();
		}
		a[p++]=e;
	}
	public void increase()
	{
		Object[] temp= new Object[a.length+5];
		for(int i=0;i<=a.length;i++)
		{
			temp[i]=a[i];
		}
		a=temp;
		p++;
	}
	/*public void add(int index,Object e)
	{
		if(index>=size())throw new IndexOutOfBoundsException();
		if(p>=a.length) increase();
		for(int i=index;i<=a.length;i++)
		{
			a[i+1]=a[i];
		}	
	}
	public int size()
	{
		return p;
	}
	public void set(int index,Object e)
	{
		if(index>=size()) throw new IndexOutOfBoundsException();
		if(p>=a.length) increase();
		for(int i=index;i<=a.length-1;i++)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
	}*/

	public static void main(String[] args) {
		
		RameshKaCode r=new RameshKaCode();
		/*r.add(0,10);
		r.add(1,20);
		r.add(2,30);
		r.add(3,40);
		r.add(4,50);*/
		r.add(10);
		r.add(20);
		System.out.println("");
	}

}