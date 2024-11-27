package programm.javapractics;

public class subpair {
   public static  int subpaier(int num[]){
    for (int i=1;i<num.length;i++){
        for (int j=i;j<num.length;j++)
        {
            System.out.println((i+" "+j));
        }
    }
        return 0;
}


    public static void main(String[] args) {

        int num[]={2,4,6,8,10,12};
        subpaier(num);
        System.out.println( subpaier(num));

    }
    
}
