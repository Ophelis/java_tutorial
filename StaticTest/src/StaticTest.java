
public class StaticTest {
int count = 0;
public StaticTest(){
	count++;
	System.out.println(count);
}
public static void main(String[] args){
	StaticTest s1 = new StaticTest();
	StaticTest s2 = new StaticTest();
}
}
