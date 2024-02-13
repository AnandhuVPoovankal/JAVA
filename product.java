import java.util.*;

class product
{
 String pcode,pname;
 int price;
 
  product(String pcode,String pname,int price)
 {
  this.pcode=pcode;
  this.pname=pname;
  this.price=price;
  }
  
  void putData()
  {
   System.out.println("Product Code:"+pcode);
   System.out.println("Product Name:"+pname);
   System.out.println("Product Price:"+price);
   }
   
  public static void main(String[] args)
  {
  
        System.out.println("ANANDHU,23MCA015,13/02/2023\n");
  	product p1 = new product("1", "pc", 9999);
  	product p2 = new product("2", "mouse", 4555);
  	product p3 = new product("3", "monitor", 86777);
  	
  	p1.putData();
  	p2.putData();
	p3.putData();
	
	
	
	if(p1.price > p2.price && p1.price > p3.price)
	{
	  System.out.println("product 1 is largest " + p1.price);
	}
	else if(p2.price > p3.price && p2.price > p1.price)
	{
	  System.out.println("product 2 is largest " + p2.price);
	}
	else
	{
	  System.out.println("product 3 is largest " + p3.price);
	}
  	
  }
  
}

