import java.util.Scanner;

public class assin23 {

    public static void main(String[] args) {
        System.out.println("Enter the row and column : ");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        int sum[][]=new int[row][col];
        int sub[][]=new int[row][col];
        int mut[][]=new int[row][col];
        System.out.println("1 Matrix Element.....");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter the "+(i+1)+(j+1)+" Element");
                mat1[i][j]=s.nextInt();
            }
        }

        System.out.println("2 Matrix Element.....");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter the "+(i+1)+(j+1)+" Element");
                mat2[i][j]=s.nextInt();
            }
        }

        System.out.println("Addition .....");
        for(int i=0; i <row; i++){
            for(int j=0; j<col; j++){
                sum[i][j]=mat1[i][j]+mat2[i][j]; 
                System.out.print(sum[i][j]+" ");      
            }
            System.out.println();
        }
       

        System.out.println("Subtraction.....");
        for(int i=0; i <row; i++){
            for(int j=0; j<col; j++){
                sub[i][j]=mat1[i][j]-mat2[i][j]; 
                System.out.print(sub[i][j]+"  ");      
            }
            System.out.println();
        }

        if(row==col){
        System.out.println("Multiplication.....");
        for(int i=0;i<row;i++){    
            for(int j=0;j<col;j++){    
            sum[i][j]=0;      
            for(int k=0;k<col;k++)      
            {      
            sum[i][j]+=mat1[i][k]*mat2[k][j];      
            }
            System.out.print(sum[i][j]+" ");   
            } 
            System.out.println();     
            }    
        }
        else{
            System.out.println("Multiplication can't be possible...");
        }

    }
}