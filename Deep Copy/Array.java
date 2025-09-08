public class Array implements Cloneable{ 

    private int[] anArray = {1,2,3,4,5};
    private int values = 7;

public void increment() { 
    int newSize = values;
    int[] newAnArray = new int[newSize];
    for(int i = 0; i < newSize; i++){
        newAnArray[i] = i + 1;
    } 
    anArray = newAnArray;
}
 @Override
public String toString() {
   String result = "";
   for(int i = 0; i < anArray.length; i++){
     result += anArray[i];
     if(i < anArray.length - 1){
        result += ", ";
     }
   }
   return result;
}
 @Override
public Array clone() throws
     CloneNotSupportedException{
      Array cloned = (Array) super.clone();
      cloned.anArray = anArray.clone();
      return cloned;
     } 
}