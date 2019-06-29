import java.util.*;
class demo
{
  public static void main(String args[])
  {
Scanner obj=new Scanner(System.in);

int a[]={1,4,4,0,2,5,0,3,6,1,4,6};
System.out.println("Enter a Date");
int date=obj.nextInt();
System.out.println("Enter a Month");
int month=obj.nextInt();
System.out.println("Enter a Year");
int year=obj.nextInt();
if(date<=0&&date>31)
{
System.out.println("invalid date");
return ;
}
if(month<=0&&month>12)
{
System.out.println("invalid month");
return;
}
int sum=0;
int l=0;
switch(month)
{
case 1:
if(date<=31 && date>0)
{
}
else
{
System.out.println("invalid  date");
return;
}
break;
case 2:

if(year%100==0)
{
  if(year%400 ==0)
  l=1;
  else
  l=0;
  }
  else if(year%4==0)
  l=1;
  else
  l=0;
  if(l==1)
  {
      if(date<=0 && date>29)
      {
      System.out.println("invalid date");
      return;
      }
    }
    else
    {
    if(date<=0 && date>28)
      {
      System.out.println("invalid date");
      return;
      }
     }
  break;
  case 3:
if(date<=31 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;
case 4:
if(date<=30 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;
case 5:
if(date<=31 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;

case 6:
if(date<=30 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;
case 7:
if(date<=31 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;

case 8:
if(date<=31 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;

case 9:
if(date<=30 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;
case 10:
if(date<=31 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;

case 11:
if(date<=30 && date>0);
else
{
System.out.println("invalid  date");
return;
}
break;
case 12:
if(date<=31&& date>0);
else
{
System.out.println("invalid  date");
return;
}
break;
default:
System.out.println("invalid choice");
}
sum=sum+date;
sum=sum+a[month-1];
if(year>=1500 &&year<=1599)
sum=sum+0;
else if(year>=1600 &&year<=1699)
sum=sum+6;
else if(year>=1700 &&year<=1799)
sum=sum+4;
else if(year>=1800 &&year<=1899)
sum=sum+2;
else if(year>=1900 &&year<=1999)
sum=sum+0;
else if(year>=2000 &&year<=2099)
sum=sum+6;
else if(year>=2100 &&year<=2199)
sum=sum+4;
else if(year>=2200 &&year<=2299)
sum=sum+2;
else if(year>=2300 &&year<=2399)
sum=sum+0;
else if(year>=2400 &&year<=2499)
sum=sum+6;
else if(year>=2500 &&year<=2599)
sum=sum+4;
else if(year>=2600 &&year<=2699)
sum=sum+2;
int rev=0;
int le=1;
while(le<=2)
{
  int r=year%10;
  rev=rev*10+r;
  year=year/10;
  le++;
  }
int rev1=0;
while(rev!=0)
{
  int r=rev%10;
  rev1=rev1*10+r;
  rev=rev/10;

  }
  sum=sum+rev1;
  int c=rev1/4;
  sum=sum+c;
  int fin=sum%7;
  switch(fin)
  {
  case 1:
  System.out.println("Sunday");
  break;
  case 2:
  System.out.println("Monday");
  break;
  case 3:
  System.out.println("Tuesday");
  break;
  case 4:
  System.out.println("Wednesday");
  break;
  case 5:
  System.out.println("Thursday");
  break;
  case 6:
  System.out.println("Friday");
  break;
  case 0:
  System.out.println("Saturday");
  break;
  }








  }
  }
