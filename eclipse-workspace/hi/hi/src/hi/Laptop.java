package hi;


class Lappy
{
	String RAM; String Type;
	int Price;
    void display()
    {
        System.out.println("Working...");
    }
    
    static void specs(String RAM, String Type, int Price) {
    	System.out.println("SPECIFICATIONS: RAM:" + RAM +" Type:" + Type + " Price:"+Price);
    }
    
}

class Dell extends Lappy
{
    void print()
    {
        System.out.println("Dell Inspiron");
        display();
    }
    
}

class Lenovo extends Lappy
{
    void show()
    {
        System.out.println("Lenovo YOGA - Gaming Laptop");
        System.out.println("4GB Graphic Card, for rich gaming experience");
    }
}

class HP extends Lappy {
	void features() {
		System.out.println("This HP Lappy has Touch Screen");
	}
}

class Laptop
{
    public static void main(String args[]){
        Dell d = new Dell();
        d.print();
        d.specs("8GB", "256GB-SSD", 45999);
        System.out.println();
        
        Lenovo l = new Lenovo();
        l.show();
        l.specs("12GB", "1TB-HDD", 42999);
        System.out.println();
        
        HP obj = new HP();
        obj.features();
        System.out.println(obj.RAM = "12GB RAM");
       
        Lappy obj1 = new Lappy();
        obj1.specs("12GB", "512GB-SSD", 51299);
        
        
    }
}
