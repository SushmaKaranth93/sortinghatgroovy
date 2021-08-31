package com.vendantu.sortinghat

class SortingHat {
    public static void main(String[] args) {
        //input student records
        int numberOfElements;
        Scanner sc = new Scanner(System.in);
        println(" Enter the number of elements you want to store: \n");
        numberOfElements = sc.nextInt();
        sc.skip(System.lineSeparator());
        List<String> studentRegisterDataInput = [];
        println(" Enter the 4 digit register number, class (A/B) and food preferences (V/NV)  like given below \n eg: 1001 B NV");
        for (int i = 0; i < numberOfElements; i++) {
            String studentInput = sc.nextLine();
            studentRegisterDataInput << studentInput;
        }
        sc.close()

        List<Map> studentRegisterData = [];
        studentRegisterData = (0..(numberOfElements - 1)).collect { it ->
            List<String> studentList = studentRegisterDataInput[it].split(" ").toList();
            Map student = [:]
            student.registerNumber = studentList[0]?.toInteger();
            student.batch = studentList[1]?.toString();
            student.preference = studentList[2]?.toString();
            student
        }

        Integer capacity = 3;
        Map<String, List> result = [BV: [], AV: [], BNV: [], ANV: [], NA: []];

        studentRegisterData.each { it ->
            List allocatedHostelStudents = result."${it.batch + it.preference}";
            if (allocatedHostelStudents?.size() < capacity) {
                result."${it.batch + it.preference}" << it.registerNumber;
            } else {
                result.NA << it.registerNumber;
            }
        }

        println("result ${result}");
    }
}
