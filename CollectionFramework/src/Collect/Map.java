package Collect;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;




class MyClass
{
	int value;
	@Override
	public String toString() {
		
		return "My Class value is"+value;
	}
}



class Employee
{
	private int id;
	private String empName;
	private String email;
	private String address;
	
	public Employee() {
		
	}

	public Employee(int id, String empName, String email, String address) 
	{
		super();
		this.id = id;
		this.empName = empName;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return  id +" "+empName +" "+ email +" "+  address ;
	}
	
}

class Student
{
	private int id;
	private String name;
	private float  height;
	
	public Student() {
	}
	
	public Student(int id, String name, float height) 
	{
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return  id + " " + name + " " + height ;
	}
	
	
	
	
}












public class Map
{	
	 static Scanner scan=new Scanner(System.in);
//	 static int count=3;

	public static void main(String[] args) 
	{
//		Employee e=new Employee(1,"Tim","tim@gmail.com","Btm_layout,Banglore");
//		System.out.println(e);
		
		
		Student s1=new Student();	
		s1.setId(1);
		s1.setName("Steve");
		s1.setHeight(5.10f);
		
		Student s2=new Student(2,"tim",6.09f);	
		Student s3=new Student(3,"Satya",5.09f);	
		Student s4=new Student(4,"Rahul",5.11f);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s2);
		al.add(s1);
		al.add(s4);
		al.add(s3);
		
//		System.out.println(s1+"\t"+s2+"\n"+s3);
		
		
		System.out.println(al);
		
		
//		Collections.sort(al);
		
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
//		HashMap<String,Integer> map=new HashMap<String,Integer>();
//		
//		map.put("India",900);
//		map.put("China",9500);
//		map.put("Japan",400);
//		map.put("Pakistan",500);
//		map.put("London",300);
//		map.put("Italy",250);
//		
//		System.out.println(map); 
//		
//		Set<String> countryNames=map.keySet();
//		
//		for(String s:countryNames)
//		{
//			Integer p=map.get(s);
//			System.out.println(s+" : "+p);
//		}
//		
//		Set<Entry<String,Integer>> entry=map.entrySet();
//		
//		for(Entry<String,Integer> e:entry)
//		{
//			System.out.println(e.getKey()+" : "+e.getValue());
//		}
		
		
		
//		Scanner scan =new Scanner(System.in);
//		
//		
//		String s =scan.nextLine();
//		
//		countFrequency(s);
		
		
		
//		int n=scan.nextInt();
//		
//		
//		int []ar=new int[n];
//		
//		
//		for(int i=0;i<ar.length;i++)
//		{
//			ar[i]=scan.nextInt();
//		}
//		
//		countPairs(ar);
		
		
//		String s=scan.nextLine();
	
		
		
//		countWords(s);
		
		
		
//		HashMap hs =new HashMap();
//		
//		hs.put(7,"DHONI");
//		hs.put(18,"KHOLI");
//		hs.put(45,"SHARMA");
//		hs.put(77,"GILL");
//		
//		
//		
//		Set s=hs.keySet();
//		
		
//		String s="";
//		Iterator itr=s.iterator();
//		ListIterator<Integer> itrs=s.listIterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		while(itrs.hasPrevious())
//		{
//			System.out.println(itrs.previous());
//		}
		
		
		
		
//		Map mp=new Map();
//		Map mp1=new Map();
//		Map mp2=new Map();
//		Map mp3=new Map(); 
		
		
		
//		System.out.println(mp1.scan);
//		System.out.println(mp2.scan);
		
		
		
		
//		ArrayList x=new ArrayList();
//		
//		
//		x.add(10);
		
		
		
//		int a=10;
		
//		Boxing
//		Integer i=new Integer(10);
		
		
//		AutoBoxing
//		Integer e=a;
//		
//		int b=i.intValue();
//		
//		System.out.println(i);
//		System.out.println(e);
//		System.out.println(b);
		
		
//		int n=scan.nextInt();
//		int []arr=new int[n];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=scan.nextInt();
//		}
//		
//		sumOfNum(arr);
//		
//		for(int a:arr)
//		{
//			System.out.println(a);
//		}

		
//		ArrayList<Integer> al =new ArrayList();
//		
//		al.add(23);
//		al.add(99);
//		al.add(199);
//		al.add(990);
//		al.add(100);
//		al.add(123);
//		
//		
//		System.out.println(al);

//		System.out.println(Collections.shuffle(al));
		
		
//		Collections.shuffle(al);
//		
//		
//		System.out.println(al);
		
		
		
//		String s="ABCD";
//		
//		String s1=s.toUpperCase();
//		
//		System.out.println(s1);
// 
//		
//		
//		s1.split(" ");
		
//		String s="    Hello world, welcome to Java!   ";
//		
//		 s=s.trim();		
//
//		System.out.println(s);
		
//		
//		int n=scan.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=scan.nextInt();
//		}
//		int []arr1=bubbleSort(arr);
//		for(int num:arr1)
//		{
//			System.out.println(num);
//		}
	
//		int n=scan.nextInt();
//		int first=0,second=1,next=0;
//		
//		for(int i=1;i<=n;i++)
//		{
//			next=first+second;
//			System.out.println(next+" ");
//			first=second;
//			second=next;
//		}
		
		
//		int n=scan.nextInt();
//		int res=fact(n);
//		
//		System.out.println(res);
		
		
		
		
//		Exception Handling using
		
		
		
//		int count=3;
//		int n=0;
//		try 
//		{
//			n=scan.nextInt();
//			System.out.println(countDigits(n));
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("Enter the Correct No");
//		}
//		catch (Exception e)
//		{
//			try
//			{
//				System.out.println("Wrong input, You have "+count+" attempt left");
//				count--;
//				n=scan.nextInt();
//				System.out.println(countDigits(n));
//			}
//			catch(Exception e1)
//			{
//				try
//				{
//					System.out.println("Wrong input, You have "+count+" attempt left");
//					count--;
//					n=scan.nextInt();
//					System.out.println(countDigits(n));
//				}
//				catch(Exception e2)
//				{
//					 try
//					 {
//						 System.out.println("Wrong input, You have last "+count+" attempt left");
//						 count--;
//						 n=scan.nextInt();
//						 System.out.println(countDigits(n));
//					 }
//					 catch(Exception e3)
//					 {
//						 System.out.println("Sorry!");							
//					 }
//				}
//			}
//		}
		
		
//		int n=scan.nextInt();
//		System.out.println(trailingZeros(n));
		
		
		
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		int min=a<b?a:b;
//		System.out.println(hcf(a,b,min));
		
		
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		System.out.println(euclidGcd1(a,b));
		
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		System.out.println(findLcm1(a,b));
		
		
//		int n=scan.nextInt();	
//		System.out.println(isPrime1(n));
		
		
//		int n=scan.nextInt();
//		sievePrintPrime(n);
		
//		
//		MyClass obj=new MyClass();
//		obj.value=10;
//		modify(obj);
//		System.out.println(obj.value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}
	
	
	static void modify(MyClass o)
	{
		o.value=20;
		o=new MyClass();
		o.value=30;	
		System.out.println(o);
	}
		
//	Sieve of Eratosthenes
	
	
	static void sievePrintPrime(int n)
	{
		boolean[] prime=new boolean[n+1];
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==false)
			{
				 for(int j=i*2;j<=n;j=j+1)
				 {
					  prime[j]=true;
				 }
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==false)
			{
				System.out.println(i);
			}
		}
	}
	
	static void factors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
		
	static void printPrime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(isPrime1(i))
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total prime number between 2 and "+n+" are "+count);
	}	
	
//	Sum of first 10 multiples of N
	
	static int sum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=n*i;
		}
		return sum;
	}
	
	static boolean isPrime1(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
//	Find LCM of Number
	
	static int findLcm1(int a,int b)
	{
	 	return (a*b)/euclidGcd1(a,b);
	}
			
	static int findLcm(int a,int b)
	{
		int res=Math.max(a,b);
		
		 while(true)
		 {
			 if(res%a==0&&res%b==0)
			 {
				 break;
			 }
			 res++;
		 }
		 return res;
	}	

	
//	Optimized Euclids Theorem
		
	static int euclidGcd1(int a,int b)
	{
		while(a!=0&&b!=0)
		{
			if(a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
		}
		return a>b?a:b;
	}
			
	
//	Euclids Theorum
	
	static int euclidGcd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		return a;
	}
			
//	hcf of two number
	
	static int hcf(int a,int b,int min)
	{
		for(int i=min;i>=1;i--)
		{
			 if(a%i==0&&b%i==0)
			 {
				 return i; 
			 }
		}
		return 1;
	}
		
	static int trailingZeros(int n)
	{
		int res=0;
		int powOf5=5;
		while(n>=powOf5)
		{
			res=res+(n/powOf5);
			powOf5=powOf5*5;
		}
		return res;
	}
			
	static int countDigits(int n) throws Exception
	{
		if(n<0)
		{
			throw new Exception();
		}
		int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		return count;
	}
		
	static int fact(int n)
	{
		int res=1;
		for(int i=2;i<=n;i++)
		{
			res*=i;
		}
		return res;
	}
	
	static int [] bubbleSort(int []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr.length-1-j;i++)
			{
				if(arr[i]<arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static void sumOfNum(int []arr)
//	{
//		arr=null;		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static void countFrequency(String s)
//	{
//		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
//		for(int i=0;i<s.length()-1;i++)
//		{
//			char ch=s.charAt(i);
//			if(map.containsKey(ch))
//			{
//				int c=map.get(ch);
//				map.put(ch,c+1);
//			}
//			else
//			{
//				map.put(ch, 1); 
//			}
//		}
//		System.out.println(map);
		
//		Set<Character> count=map.keySet();
//		
//		for(char ch:count)
//		{
//			int i=map.get(ch);
//			System.out.print(ch+" "+i+",");
//		}		

//	}
	
	static void countPairs(int[] ar)
	{
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				int c=map.get(ar[i]);
				map.put(ar[i],c+1);
			}
			else
			{
				map.put(ar[i],1);
			}
		}
		
		Collection<Integer> values=map.values();
		
		int count=0;
		for(int value:values)
		{
			count=count+value/2;
		}
		
		System.out.println(count);
	}
	
	
	
	
	static void countWords(String s)
	{
		String []ar=s.split(" ");
		HashMap<String,Integer> map=new HashMap();
		for(int i=0;i<ar.length;i++)
		{
			int c=map.getOrDefault(ar[i],0);
			map.put(ar[i],c+1);
		}
		
		Set<Entry<String,Integer>> entry=map.entrySet();

//		for(Entry<String,Integer> e: entry)
//		{
//			if(e.getValue()>3)
//			{
//				System.out.println(e.getKey()+" "+e.getValue());
//			}
//		}
		
		int max=0;
		String maxWord="";
		
		for(Entry<String,Integer> e: entry)
		{
			if(max<=e.getValue())
			{
				max=e.getValue();
				maxWord=e.getKey();
			}
		}
		System.out.println(maxWord);
		
		
	}
	
	
	
	
	
	
	
	
}
 