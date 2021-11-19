import java.util.ArrayList;

public class U7_L3_Activity_Two
{

  // Write the printStatistics method as described in the assignment
  public static void printStatistics(ArrayList<Integer> list) {
    int sum = 0;
    double avg = 0;
    int mode = 0;
    
    int mostAppearingNumber = 0;
    int mostAppearingCount = 0;
    int noSingleUnlessGreater = 0;
    
    for (Integer number : list) {
      sum += number;
      int modeCount = 0;
      for (Integer referenceNumber : list){
        if (referenceNumber == number){
          modeCount++;
        }
      }
      if (modeCount > mostAppearingCount){
        mostAppearingCount = modeCount;
        mostAppearingNumber = number;
      }else if (modeCount == mostAppearingCount && number != mostAppearingNumber){
        noSingleUnlessGreater = modeCount;
      }
    } 
    avg = sum / (double) list.size();
    
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);
    if (mostAppearingCount <= 1){
      System.out.println("Mode: no single mode");
    }else {
      if (mostAppearingCount > noSingleUnlessGreater){
        System.out.println("Mode: " + mostAppearingNumber);
      }else {
        System.out.println("Mode: no single mode");
      }
    }
  }
}
