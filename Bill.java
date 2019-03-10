import java.util.*;
class Bill
{
public static void main(String args[])
{
int i,a=0,b=0,c=0,d=0,e=0,g=0,x=0,h=0,j=0,k=0,l=0,n=0,A,B,C,D,E,F,G,H,J,K,L;
int m1=0,m2=0,m3=0,m4=0,m5=0,m6=0,m7=0,m8=0,m9=0,m10=0;
float total=0;
double gst;

n=1;
System.out.print("**********************PRO'Z RESTAURANT*************************\n");
System.out.print("****************************MENU CARD*****************************\n");
System.out.print("sr.no       list of item                   price(p/p)\n");
System.out.print("1           Chickan tandoori                225      \n ");
System.out.print("2           Chicken lollypop                150      \n ");
System.out.print("3           Fried rice                      70       \n ");
System.out.print("4           Soup                            40       \n ");
System.out.print("5           Chicken biryani                 100      \n ");
System.out.print("6           Veg rice                        60       \n ");
System.out.print("7           Franky                          45       \n ");
System.out.print("8           Manchurian                      20       \n ");
System.out.print("9           Noodles                         40       \n ");
System.out.print("10          Chicken soup                    50       \n ");
System.out.print("11          PRINT BILL                                    \n ");
for(i=1;i<=n;i++)
{
System.out.print("\n");
System.out.print("enter the item serial number:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a==1)
{
System.out.print("chicken tandoori\n");
System.out.print("enter the quantity: \n");
b=sc.nextInt();
B=b*225;
n++;
m1++;
total=total+B;
}
else if(a==2)
{
System.out.print("chicken lollypop\n ");
System.out.print("enter the quantity: \n");
c=sc.nextInt();
C=c*150;
n++;
m2++;
total=total+C;
}
else if(a==3)
{
System.out.print(" fried rice\n ");
System.out.print("enter the quantity: \n");
d=sc.nextInt();
D=d*70;
n++;
m3++;
total=total+D;
}
else if(a==4)
{
System.out.print(" soup\n ");
System.out.print("enter the quantity: \n");
e=sc.nextInt();
E=e*40;
n++;
m4++;
total=total+E;
}
else if(a==5)
{
System.out.print("chicken biryani\n ");
System.out.print("enter the quantity: \n");
x=sc.nextInt();
F=x*100;
n++;
m5++;
total=total+F;
}
else if(a==6)
{
System.out.print("veg rice\n ");
System.out.print("enter the quantity: \n");
g=sc.nextInt();
G=g*60;
n++;
m6++;
total=total+G;
}

else if(a==7)
{
System.out.print("francky\n ");
System.out.print("enter the quantity: \n");
h=sc.nextInt();
H=h*45;
n++;
m7++;
total=total+H;
}
else if(a==8)
{
System.out.print("manchurian\n");
System.out.print("enter the quantity: \n");
j=sc.nextInt();
J=j*20;
n++;
m8++;
total=total+J;
}
else if(a==9)
{
System.out.print("noodles\n ");
System.out.print("enter the quantity: \n");
k=sc.nextInt();
K=k*40;
n++;
m9++;
total=total+K;
}
else if(a==10)
{
System.out.print("chicken soup\n ");
System.out.print("enter the quantity: \n");
l=sc.nextInt();
L=l*50;
n++;
m10++;
total=total+L;
}
else if(a==11)
{
System.out.print("no further order STOP \n\n\n ");
break;
}
else
{
System.out.print("invalid order\n");
n++;
}
}
System.out.print("================================================================\n");
System.out.print("**********************PRO'Z RESTAURANT***************************\n");
System.out.print("****************************BILL*********************************\n");
System.out.print(" ================================================================\n");
System.out.print("sr.no       list of item                   price(p/p)     No. of quantity\n");
if(m1>=1)
System.out.print("1           chickan tandoori                225    \t     "+b+"\n");
if(m2>=1)
System.out.print("2           chicken lollypop                150      \t     "+c+"\n");
if(m3>=1)
System.out.print("3           fried rice                      70       \t     "+d+"\n");
if(m4>=1)
System.out.print("4           soup                            40       \t     "+e+"\n");
if(m5>=1)
System.out.print("5           chicken biryani                 100      \t     "+x+"\n");
if(m6>=1)
System.out.print("6           veg rice                        60       \t     "+g+"\n");
if(m7>=1)
System.out.print("7           franky                          45       \t     "+h+"\n");
if(m8>=1)
System.out.print("8           manchurian                      20       \t     "+j+"\n");
if(m9>=1)
System.out.print("9           noodles                         40       \t     "+k+"\n");
if(m10>=1)
System.out.print("10          chicken soup                    50       \t     "+l+"\n");
gst=total*0.18;
System.out.print("total  = "+total+"\n");
System.out.print("Gst = "+gst+"\n");
System.out.print("total amount = "+(total+gst)+"\n");


System.out.print("\n\n\n");
System.out.print("THANK YOU VISIT AGAIN");
}
}