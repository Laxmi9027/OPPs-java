public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld(); 
        int sum = hw.add(5, 3);
        int difference = hw.subtract(5, 3);
        System.out.println("5 + 3 = " + sum); 
        System.out.println("5 - 3 = " + difference);    
    }   

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract (int a, int b) {
        return a - b;
    }
}