import java.util.ArrayList;

public class U7_L3_Activity_One
{
  // Write your shiftRight method here
public static void shiftRight(ArrayList<String> list) {
  String temp = list.get(list.size() - 1);
  for(int i = list.size()- 1; i > 0; i--) {
      list.set(i,list.get(i-1)); 
    }
  list.set(0, temp);     
  }
}

