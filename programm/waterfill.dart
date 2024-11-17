void main() {
  List<int> waterLevel = [4, 2, 0, 6, 3, 2, 5];

  // Call the method and print the result
  int result = findLevelFillWater(waterLevel);
  print("Maximum water that can be trapped: $result");
}

int findLevelFillWater(List<int> waterLevel) {
  int n = waterLevel.length;

  // Create arrays to store maximum heights from left and right
  List<int> leftMax = List.filled(n, 0);
  leftMax[0] = waterLevel[0];
  for (int i = 1; i < n; i++) {
    leftMax[i] =
        waterLevel[i] > leftMax[i - 1] ? waterLevel[i] : leftMax[i - 1];
  }

  List<int> rightMax = List.filled(n, 0);
  rightMax[n - 1] = waterLevel[n - 1];
  for (int i = n - 2; i >= 0; i--) {
    rightMax[i] =
        waterLevel[i] > rightMax[i + 1] ? waterLevel[i] : rightMax[i + 1];
  }

  // Calculate trapped water
  int maxAreaWaterFill = 0;
  for (int i = 0; i < n; i++) {
    int waterLevelFill = leftMax[i] < rightMax[i] ? leftMax[i] : rightMax[i];
    maxAreaWaterFill += waterLevelFill - waterLevel[i];
  }

  return maxAreaWaterFill;
}
