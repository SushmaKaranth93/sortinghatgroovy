package com.vendantu.sortinghat

class SortingHat {
    public static void main(String[] args){
        //input student records
        int numberOfElements;
        Scanner sc=new Scanner(System.in);
        println(" Enter the number of elements you want to store: \n");
        numberOfElements=sc.nextInt();
        sc.skip(System.lineSeparator());

        println(" Enter the 4 digit register number, class (A/B) and food preferences (V/NV)  like given below \n eg: 1001 B NV");
        for(int i=0;i<numberOfElements;i++){
            String studentInput=sc.nextLine();
            studentInput << studentInput;
        }
        sc.close()

        List<String> studentRegisterData=[];
    }
}
