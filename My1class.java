public class My1class {
    public static void main(String[] args) {

       int age=20;





       if (age>18)
       {
           System.out.println("ამომრჩეველი");
       } else if (age>88)
       {
           System.out.println("პენსიონერი");
       } else
       {
           System.out.println("არასრულწლოვანი");
       }
    }
}
// არასრულწლოვანი

//თუ დავწერთ 81-ს იქნება მაინც ამომრჩეველი, რადგან პირველი (if) ლოგიკა შესრულდა. if else მოწმდება მხოლოდ მაშინ თუ if არ შესრულდება.