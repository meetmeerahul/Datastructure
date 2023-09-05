import java.util.*;  
public class LinkedHashMap1{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> LHM=new LinkedHashMap<Integer,String>();  
  
      LHM.put(16,"Virat");
      LHM.put(1,"Alex");
      LHM.put(40,"Ishika");
      LHM.put(5,"Sonu");
      LHM.put(3,"Mrinalini");
      LHM.put(38,"John"); 
      
      
  System.out.println("Does it mentain insertion order? ....");
  
  for(Map.Entry m:LHM.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
} 