public class Calculation {
    private int Num=0;
    private int sum=0;

      Calculation()
      {

      }

      Calculation(int Num)
      {
          this.Num=Num;
      }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }
    int sumOfDigit()
      {
          int temp;
          while(Num>0)
          {
              temp=Num%10;
              sum=sum+temp;
              Num=Num/10;
          }
          return sum;
      }

      int maxNum(int a[])
      {
          int max=a[0];
           for(int i=1;i<a.length;i++)
           {
               if(a[i]>max)
                   max=a[i];
           }
           return max;
      }

      boolean isPositive(int n)
      {
          if(n>0)
              return true;
          else
              return false;
      }

}
