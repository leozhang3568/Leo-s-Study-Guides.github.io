```java
public int[] fix45(int[] nums) {
  int[] newArr = new int[nums.length];
  int count5 = 0;
  int index = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      newArr[i] = 4;
    } else if (nums[i] == 5) {
      count5++;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if ((count5 > 0)&&(newArr[i] == 4)) {
        newArr[i+1] = 5;
        count5 --;
    }
  }
  for (int i = 0; i < nums.length; i++) {
    if ((count5 > 0)&&(newArr[i] == 0)) {
      newArr[i] = 5;
      count5--;
    } else if (newArr[i] == 0){
      while ((nums[index] == 5) || (nums[index] == 4)) {
        index++;
      }
      newArr[i] = nums[index]; index++;
    }
  }
  return newArr;
}
```