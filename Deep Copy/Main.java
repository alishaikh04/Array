public class Main {
    public void run(){
         
        try {
            Array a1 =  new Array();
            Array a2= (Array) a1.clone();

            System.out.println("---------ORIGINAL ONE-------------");
            System.out.println("Values of a1 Array : " + a1);
              System.out.println("---------DEEP COPY-----------------");
            System.out.println("Values of a2 Array : " + a2);

            a1.increment();

            System.out.println("After increment in Array : ");
            System.out.println("---------ORIGINAL ONE-------------");
            System.out.println("Now the value of a1 : " + a1);
            System.out.println("---------DEEP COPY-----------------");
            System.out.println("Now the value of a2 : " + a2);
            



        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    
}
