class node
{
    public int data;
    public node next;
}

class SinlglyLL
{
    public node first;
    public int iCount;

    public SinlglyLL()
    {
        System.out.println("Object of SinglyLL get's created.");
        this.first = null;
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

class program439
{
    public static void main(String A[])
    {
        SinlglyLL obj = null;
        int iRet = 0;

        obj = new SinlglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of nodes are : "+iRet);
    }
}