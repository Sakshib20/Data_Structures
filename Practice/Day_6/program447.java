// Singly Circular

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        this.data=no;
        this.next=null;
    }
}

class SinlglyCL
{
    private node first;
    private node last;

    public int iCount;

    public SinlglyCL()
    {
        System.out.println("Object of SinlglyCL get's created.");
        this.first = null;
        this.last=null;

        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {

    }

    public void InsertLast(int no)
    {

    }

    public void InsertAtPos(int no, int pos)
    {

    }

    public void DeleteFirst()
    {

    }
    public void DeleteLast()
    {
        
    }
    public void DeleteAtPos(int pos)
    {
        
    }

    public void Display()
    {}

    public int Count()
    {

        return this.iCount;
    }
}

class program447
{
    public static void main(String A[])
    {
        SinlglyCL obj = null;
        int iRet = 0;

        obj = new SinlglyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet=obj.Count();
        System.out.print("Number of nodes are : "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of nodes are : "+iRet);

        obj.DeleteFirst();

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of nodes are : "+iRet);

        obj.DeleteLast();

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of nodes are : "+iRet);

        obj.InsertAtPos(105,4);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of nodes are : "+iRet);

        obj.DeleteAtPos(4);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of nodes are : "+iRet);

        // Important for memory deallocation

        obj=null;
        System.gc();
    }
}