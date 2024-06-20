// package Arrays;


class ArrayExample{



    void SumOfArray(){
        int [] arr = {2,4,6};
        int sum = 0;
        
        for(int i=0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }


    void multiarrays(){
        // int[][] arr_1 = new int[5][3];
    
        int[][] arr = {{14,15,16},{16,17,18}};
    
        // System.out.println(arr[0][2]);
        // System.out.println(arr.length);

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println(arr[i][j]);
            }
        }
    
    }
    
    void demoarrays(){
        int [] ages = new int[3];
        ages[0] = 18;
        ages[1] = 19;
        ages[2] = 20;
    
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);



        for(int i=0; i <=2; i++){
            System.out.println(ages[i]);
        }
        System.out.println(ages.length);
    
        
    }
}

public class Main {
    public static void main(String[] ages) {
        ArrayExample obj = new ArrayExample();
        // obj.demoarrays();
        // obj.multiarrays();

        obj.SumOfArray();

        
    }
    
}
