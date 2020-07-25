interface Operator  {
    public  abstract double calculate(double num1, double num2);
}

class Cal_Sum implements Operator
{
    public double calculate(double num1,double num2)
    {
        return num1+num2;
    }
}

class Cal_Sub implements Operator
{
    public double calculate(double num1,double num2)
    {
        return num1-num2;
    }
}

class Cal_Mul implements Operator
{
    public double calculate(double num1,double num2)
    {
        return num1*num2;
    }
}

class Cal_Div implements Operator
{
    public double calculate(double num1,double num2)
    {
        if(num2==0)
        {
            return 0;
        }
        return num1/num2;
    }
}
