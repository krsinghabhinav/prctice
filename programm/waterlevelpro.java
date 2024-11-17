 
 package programm;
 class waterlevelpro {
    private static int findlevelfillwatter(int waterlevel[]) {

      int   n= waterlevel.length;
      int leftmax[] = new int[n];
      leftmax[0]= waterlevel[0];
      for (int i = 1; i < n; i++) {
        leftmax[i]= Math.max(waterlevel[i], leftmax[i-1]);
      }

      int rightmax[] = new int[n];
      rightmax[n-1]=waterlevel[n-1];
      for(int i=n-2;i>=0; i-- ){
        rightmax[i]=Math.max(waterlevel[i], rightmax[i+1]);
      }

      int maxareawatterfill=0;
      
      for(int i=0;i<n;i++){
        int waterlevelfill =Math.min(leftmax[i], rightmax[i]);
        maxareawatterfill +=  waterlevelfill-waterlevel[i];
      }
      return maxareawatterfill;

    }
   public static void main(String[] args) {
    int waterlevel []={4,2,0,6,3,2,5};
    
System.out.println(findlevelfillwatter(waterlevel));;
       }
    
    
}
