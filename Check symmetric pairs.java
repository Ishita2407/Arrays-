class checkPairs{
  public static String findPair(int arr[][]){
    HashMap<Integer, Integer> map = new HashMap<>();
    String res = "";
    for(int i = 0; i < arr.length; i++){
      int first = arr[i][0];
      int second = arr[i][1];

      Integer value = map.get(second);

      if(value != null && value == first){
        res += "{" + String.valueOf(second) + "," + String.valueOf(first) + "}";
      }else{
        map.put(first, second);
      }
    }
    return result;
  }
}
