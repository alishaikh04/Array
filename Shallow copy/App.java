public class Main {
   public void run(){

    try {
        Array a1 =  new Array();
        Array a2 =  (Array) a1.clone();

        System.out.println("---------ORGINAL ONE----------");
        System.out.println("VALUES FORM a1 IS :" + a1);
        System.out.println("----------SHALLOW COPY-----------");
        System.out.println("VALUES FORM COPY IS: " + a2);

        a2.increment();
        System.out.println("==============VALUES AFTER INCREMENT===============");
        System.out.println("---------ORGINAL ONE----------");
        System.out.println("VALUES FORM a1 IS :" + a1);
        System.out.println("----------SHALLOW COPY-----------");
        System.out.println("VALUES FORM COPY IS: " + a2);


    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
   }    
}