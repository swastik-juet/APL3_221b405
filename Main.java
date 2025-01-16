/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		JUET t = new JUET();
		t.setAge(21);
		t.setName("swastik");
		int a = t.getAge();
		String n = t.getName();
		System.out.println(a);
		System.out.println(n);
		
	}
}
class JUET{
    protected int age;
    protected String name;
    protected void setAge(int age) {
        this.age = age;
    }
    protected int getAge() {
        return age;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected String getName() {
        return name;
    }
}
