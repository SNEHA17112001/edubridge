package mypack;
import java .util.*;
import java.util.Map.Entry;
public class Item {
	static  int price;
	  static  String productName;
	 static  TreeMap<String,Integer> cho = new  TreeMap<>();
	 Scanner sc = new Scanner(System.in);
	  public static void searchProduct(TreeMap<String,Integer> cho,Scanner sc)  
	  {
		  String search;
		  int h=0,str;
		  System.out.println(cho);
		   System.out.println("Enter the product to search:");
		   sc.nextLine();
		   search=sc.nextLine();
	        
	
	 try
	 {
	h= cho.get(search);
	 }
	catch (NullPointerException e)
	 {
		System.out.println("Chocolate Not Found :(");
	   }
	 if(h!=0)
	 {
		
		 System.out.println("Chocolate name is :"+" "+search+" "+"price is "+cho.get(search));
	 }
	 System.out.println("Back to postion then press 1:: ");
		str=sc.nextInt();
		if(str==1)
		{
		retailerUser(cho,sc);
		}
		else if(str!=1)
		{
			System.out.println("Exited....");
			System.exit(0);
		}
		
		 
	  }
	
	 public static void deleteProduct(TreeMap<String,Integer> cho ,Scanner sc )
	 {  
		 String del;
		 int h=0;
		
		 System.out.println("enter the productName to delete:");
		  sc.nextLine();
		 del=sc.nextLine();
		 try
		 {
		h= cho.get(del);
		 }
		catch (NullPointerException e)
		 {
			System.out.println("Chocolate Not Found :(");
		   }
		 if(h!=0)
		 {
			 cho.remove(del);
			 System.out.println("Chocolate Deleted Successfully :)");
		 }
		 System.out.println("Back to postion then press 1:: ");
			h=sc.nextInt();
			if(h==1)
			{
			retailerUser(cho,sc);
			}
			else if(h!=1)
			{
				System.out.println("Exited....");
				System.exit(0);
			}
			
		
		 }
		
public static void addProduct(TreeMap<String,Integer> cho, Scanner sc )
{
	
int str;	
try {
	System.out.println("enter the  ChocolateName ");
	sc.nextLine();
	productName =sc.nextLine();
	System.out.println("enter the ChocolatePrice");
	
	price=sc.nextInt();	
	
}catch(Exception e)
{
System.out.println("please enter vaild ChocolateName  and ChocolatePrice :");
try {
	System.out.println("enter the  ChocolateName ");
	sc.nextLine();
	productName =sc.next();
	System.out.println("enter the ChocolatePrice");
	price=sc.nextInt();	
}
catch(Exception e1)
{
	System.out.println("please enter vaild ChocolateName  and ChocolatePrice :");
		System.out.println("enter the  ChocolateName ");
		sc.nextLine();
		productName =sc.next();
		System.out.println("enter the ChocolatePrice");
		price=sc.nextInt();	
}
}
		
		if(productName!="" && price!=0)
	{  
		cho.put(productName,price);
        System.out.println("Add updated :"+productName+" "+price);	
        System.out.println(cho);	
	}
	if(productName=="" || price==0)
	{
		if(productName=="")
		{
		 System.out.println("Invalid data failed chocolate name  ");	
		}
		else if(price==0)
		{
			 System.out.println("Invalid data failed chocolate price ");		
		}
	}
	System.out.println("Back to postion then press 1:: ");
	str=sc.nextInt();
	if(str==1)
	{
	retailerUser(cho,sc);
	}
	else if(str!=1)
	{
		System.out.println("Exited....");
		System.exit(0);
	}
	
	
}        
public static void purchasProduct(TreeMap<String,Integer> cho,Scanner sc )
{
	 System.out.println(cho);
	String ch;
	int quantity,j=1,temp,total=0;
	for(int i=0;i<j;i++)
	{
	System.out.println("please enter the chocholate name :");
	ch = sc.next();
	System.out.println("Enter the quantity");
	quantity = sc. nextInt();
	
	try 
	{
		System.out.println(" name is :"+ch);
		System.out.println(" price is :"+cho.get(ch));
		System.out.println(" quantity is :"+quantity);
	     total +=cho.get(ch)*quantity;
}catch (NullPointerException e)
	{
	System.out.println("product is not available please select product whch s available n the lst");
	ch = sc.next();
	 total +=cho.get(ch)*quantity;
	}
	System.out.println("if you want any another chocholate to buy then press 5");
	temp=sc.nextInt();
	if(temp!=5)
	{
		System.out.println("Total Amount to pay: "+total);
		System.out.println("Back to postion then press 1::");
		temp=sc.nextInt();
		if(temp==1)
		{
		retailerUser(cho,sc);
		}
		else if(temp!=1)
		{
			System.out.println("Exited....");
			System.exit(0);
		}
		}
	j++;
	System.out.println("Total Amount to pay: "+total);
	 
}
	
}
public static void display(TreeMap<String,Integer> cho ,Scanner sc )
{
	int str;
	System.out.println("CHocolate Available in shop Are :");
	for(Entry<String, Integer> map: cho.entrySet())
	{
		System.out.println("Chocolate Name: "+map.getKey()+" "+"Chocolate Price :"+map.getValue());
	}
	System.out.println("Back to postion then press 1:: ");
	str=sc.nextInt();
	
if(str==1)
	{
	retailerUser(cho,sc);
	}
	else if(str!=1)
	{
		System.out.println("Exited....");
		System.exit(0);
	}
}
public static void retailerUser(TreeMap<String,Integer> cho ,Scanner sc )

{
	
	int ch1;
	System.out.println("If your a Retailer then press 0");
	System.out.println("If your a Customer then press 1");
	ch1=sc.nextInt();
	
	if(ch1==0) {
	    int ch;
		System.out.println("Welcome Retailer please selecte which operation you want to perform ");
		System.out.println("Press 2 for add Chocholate :)");
		System.out.println("Press 3 for delete Chocholate :)");
		System.out.println("Press 4 for Search Chocholate :)");
		ch=sc.nextInt();
		if(ch==2)
		{
			System.out.println("add Chocholate :)");
		addProduct(cho ,sc);
	
		}
		else if(ch==3)
		{
			System.out.println("Delete Chocholate ;)");
		deleteProduct(cho,sc);
		
		}
		else if(ch==4)
		{
			System.out.println("SearchChocholate :)");
		searchProduct(cho,sc);
		
		}
		else
		{
			System.out.println("Invaild option :(");
			System.exit(0);
		}
	}
	else if (ch1==1)
	{
		int c=0;
		System.out.println("Welcome Coustomer please selecte which operation you want to perform ");
		System.out.println("press 7 to Display Chocolate");
		System.out.println("press 8 to Purchase Chocolate");
		c=sc.nextInt();
	if(c==7)
	{
		System.out.println("Purchase Chocolate :");
		purchasProduct(cho,sc);
		
	}
	else if(c==8)
	{
		System.out.println("Purchase Chocolate :");
		display(cho,sc);
		
	}
	else if(c!=7 && c!=8)
	{
	 System.out.println("Invaild option :(");
	}
	}
	else 
	{
		System.out.println("Invaild option :(");
		System.out.println("Back to postion then press 1:: ");
		ch1=sc.nextInt();
		if(ch1==1)
		{
		retailerUser(cho,sc);
		}
		else if(ch1!=1)
		{
			System.out.println("Exited....");
			System.exit(0);
		}
	}
	}

public static void main(String[] args) {
	System.out.println("-----------WELCOME TO CHOCOLATE WORLD------------");
	 cho.put("FiveStar ",5);
	cho.put("Dairymilk",10);
	cho.put("munch",5);
	cho.put("mars",15);
	cho.put("milky bar",15);
	cho.put("kitkat",10);
	cho.put("kinder",20);
	cho.put("perk",5);
	cho.put("fuse",54);
	cho.put("dark chocolate",87);
	cho.put("almond",88);
	cho.put("snickers",115);
	cho.put("galaxy",58);
	cho.put("dove",65);
	cho.put("hersheys",24);
	cho.put("topic",115);
	cho.put("bounty",58);
	cho.put("aero",65);
	cho.put("decker",24);
	Scanner sc = new Scanner(System.in);
	
	retailerUser( cho , sc );
}
}
