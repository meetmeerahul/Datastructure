public class LetterCount {
  public static void main(String[] args) {
    String a="aaaaaaaabbbbbbcccccccccccccd";
    char first=a.charAt(0);
    int recur=0;
  
    StringBuilder res=new StringBuilder();
    for (int i = 1; i <a.length(); i++) {
        if(first==a.charAt(i)){
           recur++;
        }
        else{
         if (recur>0)
         res.append(first).append(recur);
         recur=0;
         first=a.charAt(i);
        }
    }
    if (recur>0)
        res.append(first).append(recur);
    else
        res.append(first);
    System.out.println(res);
  }
  
  }