class node
{
    public int data;
    public node next;
}

class SinlglyLL
{
    public node first;
    public int iCount;

    SinlglyLL()
    {
        System.out.println("Object of SinglyLL get's created.");
        this.first = null;
        this.iCount = 0;
    }

}

class program438
{
    public static void main(String A[])
    {
        SinlglyLL obj = null;

        obj = new SinlglyLL();
    }
}