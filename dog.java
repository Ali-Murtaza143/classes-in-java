class Animal{
void Sound()
{
System.out.print("sound  ");
}
}
class cat extends Animal{
void sound()
{
System.out.print("cat say meow  ");
}
}
class dog extends Animal{
void sound()
{
System.out.print("dog say boww  ");
}

public static void main (String aw[])
{
Animal A;
A=new Animal();
A.Sound();
A=new cat ();
A.Sound();
A=new dog();
A.Sound();
}}