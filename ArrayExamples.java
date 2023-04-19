

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i++){
      int temp = arr[i]; //store value of the first half of array
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    double min = Integer.MAX_VALUE;
    int count = 0;
    double sum = 0;
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < min) {
      min = arr[i];
      count = 1;
      }
    
    else if (arr[i] == min){
      count++;
    }
    sum += arr[i];

  }
  double avg = (sum - min * count) / (arr.length - count);

  return avg;
}
}


