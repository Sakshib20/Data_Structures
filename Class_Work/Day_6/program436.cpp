#include<iostream>
using namespace std;

class Arithematic
{
    private :
        int no1,no2;

    public:
        Arithematic(int A, int B);

        int Addition();

        int Subtraction();
};

// ERRORS

Arithematic::Arithematic(int A, int B)
{
    this->no1=A;
    this->no2=B;
}

int Arithematic::Addition()
{
    return no1+no2;
}

int Arithematic::Subtraction()
{
    return no1-no2;
}

int main()
{

    Arithematic aobj(11,10);

    cout<<aobj.Addition()<<"\n";
    cout<<aobj.Subtraction()<<"\n";


    return 0;
}