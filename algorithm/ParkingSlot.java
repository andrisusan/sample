public class ParkingSlot {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{10,0,8,2,-1,12,11,3}));
    System.out.println(solutionTwo(new int[]{10,0,8,2,-1,12,11,3}));
  }

  // result : 2
  public static int solution(int[] A) {
    // check value A
    if(A.length == 1) {
      return 0;
    }

    int position = 0;
    //sorting
    sorting(A);

    for(int slotNumber = 1; slotNumber < A.length; slotNumber++) {
      int currentPosition = A[slotNumber];
      int previousPosition = A[slotNumber - 1];
      int range = Math.abs(currentPosition - previousPosition);
      if (range > position) {
        position = range;
      }
    }
    return position / 2;
  }

  public static void sorting(int[] value) {
    for(int i=0; i<value.length; i++) {
      for(int j=0; j<value.length; j++) {
        int temp = value[i];
        if(value[i] < value[j]) {
          value[i] = value[j];
          value[j] = temp;
        }
      }
    }

  }

  // result : 3
  public static int solutionTwo(int[] A) {
    if(A.length == 1){
      return 0;
    }
    int position = 0;
    sorting(A);
    for(int slotNumber = 1; slotNumber < A.length; slotNumber++){
      int currentPositionSlot = A[slotNumber];
      int previousPositionSlot = A[slotNumber - 1];
      int range = Math.abs(currentPositionSlot - previousPositionSlot);
      double gap = (double) range / 2;
      if(gap >= 1.0){
        position++;
      }
    }
    return position;
  }

}
