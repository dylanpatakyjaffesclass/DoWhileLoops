public class dowhileloops
{
    
    public void run() {
        
        int i = 0;
        int k = 7;
        int a = 0;
        int b = 0;
        
        do {
            System.out.println("i is " + i + " but less than 15");
            i++;
        } while (i < 15);
        
        do {
            System.out.println("i is " + i);
            k--;
        } while (k > 5);
        
        do {
            System.out.println("a is " + a + " and b is " + b);
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }
    
    public static void main(String[] args)
    {
        dowhileloops hw = new dowhileloops();
        hw.run();
    }
}